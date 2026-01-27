package chap2.interfaces;

public interface I1 {

    static void direBonjour() {
        System.out.println("bonjour I1");
    }

    default void direBonsoir() {
        System.out.println("bonsoir I1");
    }

    default void direSalut() {
        System.out.println("salut I1");
    }
}
