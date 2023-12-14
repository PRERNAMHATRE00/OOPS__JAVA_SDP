public class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setBreadth(10);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Breadth: " + rect.getBreadth());
    }
}
