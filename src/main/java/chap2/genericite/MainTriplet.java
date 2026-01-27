package chap2.genericite;

import java.math.BigDecimal;

public class MainTriplet {
    static void main() {
        Triplet<String> t1 = new Triplet<>("A1", "A2", "A3");
        System.out.println(t1);
        String res1 = t1.getPremier();
        System.out.println(res1);

        Triplet<Integer> t2 = new Triplet<>(1, 2, 3);
        System.out.println(t2);
        Integer res2 = t2.getPremier();
        System.out.println(res2);

        Triplet<BigDecimal> t3 = new Triplet<>(BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(7));
        System.out.println(t3);
        BigDecimal res3 = t3.getPremier();
        System.out.println(res3);
    }
}
