public class SubjectMarks {
    private int[] marks = new int[5]; // Initializing an integer array of size 5

    // Method to store marks of 5 subjects in the array
    public void storeMarks(int[] subjectMarks) {
        if (subjectMarks.length == marks.length) {
            System.arraycopy(subjectMarks, 0, marks, 0, marks.length);
            System.out.println("Marks stored successfully!");
        } else {
            System.out.println("Please provide marks for all 5 subjects.");
        }
    }

    // Method to display the data from the array using enhanced for loop
    public void displayMarks() {
        System.out.println("Marks for 5 subjects:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        SubjectMarks subjectMarks = new SubjectMarks();
        int[] studentMarks = {85, 90, 75, 88, 92}; // Example marks for 5 subjects

        subjectMarks.storeMarks(studentMarks); // Store marks in the array
        subjectMarks.displayMarks(); // Display marks using enhanced for loop
    }
}
