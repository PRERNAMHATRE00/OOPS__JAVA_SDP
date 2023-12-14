class InfyTV {
    private String photographer;
    private String newsReporter;
    private String correspondent;

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getNewsReporter() {
        return newsReporter;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public void documentaryFilm() {
        System.out.println("A hundred years ago there were 100,000 tigers in the world. " +
                "Today there are as few as 3,200. Why are tigers disappearing?......");
        System.out.println("by Correspondent: " + getCorrespondent());
        System.out.println("Photographer: " + getPhotographer());
        System.out.println("newsReporter: " + getNewsReporter());
    }
}

public class Tester {
    public static void main(String[] args) {
        InfyTV infyTV = new InfyTV();

        // Cannot access private members directly
        // System.out.println(infyTV.photographer); // This will give an error

        // Setting values using setters
        infyTV.setPhotographer("Joshua");
        infyTV.setNewsReporter("Hudson");
        infyTV.setCorrespondent("Kimberely");

        // Accessing private members through public methods
        infyTV.documentaryFilm();
    }
}
