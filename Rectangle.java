package OMKAR.Rectangle;

public class Rectangle {

    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void DisplayMeasures() {
        System.out.println("Length  " + length);
        System.out.println("Breadth  " + breadth);
    }

    public void calculatePerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter  " + perimeter);
    }
}
    