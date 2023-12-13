public class StudentTester {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student1 = new Student();

        // Use setter methods to set the values
        student1.setStudentName("Jacob");
        student1.setStudentId(1001);
        student1.setQualifyingMarks(80.0);
        student1.setYearOfEngineering(3);
        student1.setResidentialStatus('H');

        // Use getter methods to display values
        System.out.println("Student Name       :   " + student1.getStudentName());
        System.out.println("Student ID         :   " + student1.getStudentId());
        System.out.println("Qualifying marks   :   " + student1.getQualifyingMarks());
        System.out.println("Year of Engineering:   " + student1.getYearOfEngineering());
        System.out.println("Residential status :   " + 
            (student1.getResidentialStatus() == 'H' ? "Hostellers" : "Day Scholar"));
    }
}

class Student {
    private String studentName;
    private int studentId;
    private double qualifyingMarks;
    private int yearOfEngineering;
    private char residentialStatus; // 'H' for Hostellers, 'D' for Day Scholars

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getQualifyingMarks() {
        return qualifyingMarks;
    }

    public void setQualifyingMarks(double qualifyingMarks) {
        this.qualifyingMarks = qualifyingMarks;
    }

    public int getYearOfEngineering() {
        return yearOfEngineering;
    }

    public void setYearOfEngineering(int yearOfEngineering) {
        this.yearOfEngineering = yearOfEngineering;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
}
