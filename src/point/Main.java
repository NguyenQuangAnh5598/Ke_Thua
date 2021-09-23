package point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,7);
        System.out.println(point.toString());
        MovablePoint p = new MovablePoint(8,6,9,8);
        System.out.println(p.move());
    }
}
