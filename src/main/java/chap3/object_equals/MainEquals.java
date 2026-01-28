package chap3.object_equals;

public class MainEquals {
    static void main() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(3, 4);

        System.out.println("Comparaison p1 <-> p2 : " + p1.equals(p2));
        System.out.println("Comparaison p1 <-> p3 : " + p1.equals(p3));
        System.out.println("Comparaison p2 <-> p3 : " + p2.equals(p3));
    }
}
