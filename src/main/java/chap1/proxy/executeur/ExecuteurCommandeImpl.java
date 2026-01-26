package chap1.proxy.executeur;

class ExecuteurCommandeImpl implements ExecuteurDeCommande {

    @Override
    public void executerCommande(String commande) throws Exception {
//        new ProcessBuilder(commande.split(" ")).start();
        System.out.println(commande);
    }
}
