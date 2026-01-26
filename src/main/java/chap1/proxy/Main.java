package chap1.proxy;

import chap1.proxy.executeur.ExecuteurDeCommande;
import chap1.proxy.executeur.ExecuteurDeCommandeProxy;

public class Main {
    static void main() throws Exception {
        ExecuteurDeCommande exec = new ExecuteurDeCommandeProxy("admin", "admin");
        exec.executerCommande("echo machin");
        exec = new ExecuteurDeCommandeProxy("admin", "admin");
        exec.executerCommande("rmdir machin");
        exec = new ExecuteurDeCommandeProxy("stef", "stef");
        exec.executerCommande("echo machin");
        exec = new ExecuteurDeCommandeProxy("stef", "stef");
        exec.executerCommande("rmdir machin");
    }
}
