package chap3.collections;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    static void main() {
        Set<Point> set = new HashSet<>();
        set.add(new Point(0, 0));
        set.add(new Point(1, 3));
        set.add(new Point(0, 0));

        System.out.printf("Set size = %d%n", set.size());
        for (Point p : set) {
            System.out.printf("%s, %s%n", p.toString(), p.hashCode());
        }

    }
}
