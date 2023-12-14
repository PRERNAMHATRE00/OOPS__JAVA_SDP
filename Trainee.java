public class Trainee implements DataProvider {
    int marksSecured;

    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    @Override
    public void calcPercentage() {
        double percentage = (marksSecured / (double) DataProvider.totalMaximumMarks) * 100;
        System.out.println("The total aggregate percentage secured is: " + percentage);
    }
}
