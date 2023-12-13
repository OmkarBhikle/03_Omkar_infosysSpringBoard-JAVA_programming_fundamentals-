import OMKAR.Rectangle.*;

public class PerimeterCalculator {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(5);

        r.DisplayMeasures();
        r.calculatePerimeter(r.getLength(), r.getBreadth());

    }
}
