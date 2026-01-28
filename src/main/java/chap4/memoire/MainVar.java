package chap4.memoire;

import java.util.ArrayList;
import java.util.List;

public class MainVar {
    static void main() {
        int x = 5;
        doubler(x);
        System.out.printf("x : " + x + "%n");

        Integer y = 5;
        doubler(y);
        System.out.printf("y : " + y + "%n");

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        doubler(list);
        System.out.printf("list : " + list + "%n");

    }

    public static void doubler(int x) {
        x = x * 2;
    }

    public static void doubler(Integer x) {
        x = x * 2;
    }

    public static void doubler(List<Integer> x) {
        for (int i = 0; i < x.size(); ++i) {
            x.set(i, x.get(i) * 2);
        }
    }
}
