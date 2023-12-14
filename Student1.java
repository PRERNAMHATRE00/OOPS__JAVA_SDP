enum GRADE{
A,B,C,D,E;
}
class Student1{
int studentid;
String name;
public GRADE grade;
int scholorshipAmount;
int totalMarks;

public int getStudentid() {
return studentid;
}
public void setStudentid(int studentid) {
this.studentid=studentid;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name=name;
}
public GRADE getGrade() {
return grade;
}
public void setGrade(GRADE grade) {
this.grade=grade;
}
public int getScholorshipAmount() {
return scholorshipAmount;
}
public void setScholorshipAmount(int scholorshipAmount) {
this.scholorshipAmount=scholorshipAmount;
}
public int getTotalmarks() {
return totalMarks;
}
public void setTotalMarks(int totalMarks) {
this.totalMarks=totalMarks;
}
public void calculateGrade() {
if(totalMarks>=250)
grade=GRADE.A;
else if(totalMarks>=200&&totalMarks<=250)
grade=GRADE.B;
else if(totalMarks>=175&&totalMarks<=200)
grade=GRADE.C;
else if(totalMarks>=150&&totalMarks<=175)
grade=GRADE.D;
else
grade=GRADE.E;
}
public void calculateScholorshipAmount() {
switch(grade) {
case A:
scholorshipAmount=5000;
break;
case B:
scholorshipAmount=4000;
break;
case C:
scholorshipAmount=3000;
break;
case D:
scholorshipAmount=2000;
break;
default:
scholorshipAmount=0;

}
}


//public class Enum2 {

public static void main(String[] args) {
Student1 s=new Student1();
s.setStudentid(101);
s.setName("Alvin");
s.setTotalMarks(140);
s.calculateGrade();
s.calculateScholorshipAmount();
System.out.println("Student details are...");
System.out.println("Student name:"+s.getName());
System.out.println("Student id:"+s.getStudentid());
System.out.println("Student scholorship:"+s.getScholorshipAmount());
System.out.println("student grade:"+s.getGrade());
}

}