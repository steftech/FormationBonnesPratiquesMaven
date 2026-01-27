package chap2.interfaces;

public class TestInterfaceJava8  extends MaClasse implements I1,I2{
    static void main() {
        TestInterfaceJava8 t = new TestInterfaceJava8();
        t.testerMethode();
    }

    private void testerMethode() {
        this.direBonsoir();
        I1.direBonjour();
        I1.super.direBonsoir();
        this.direSalut();
        I2.super.direSalut();
    }

    @Override
    public void direSalut(){
        I1.super.direSalut();
    }
}
