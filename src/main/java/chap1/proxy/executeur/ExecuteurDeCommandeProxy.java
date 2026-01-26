package chap1.proxy.executeur;

public class ExecuteurDeCommandeProxy implements ExecuteurDeCommande {
    private boolean isAdmin;

    public ExecuteurDeCommandeProxy(String login, String password) {
        if ("admin".equals(login)
                && "admin".equals(password)) {
            isAdmin = true;
        }
    }

    @Override
    public void executerCommande(String commande) throws Exception {
        if (!isAdmin
                && commande.contains("rmdir")) {
            throw new IllegalStateException("Commande uniquement autorisée pour les admins");
        } else {
            new ExecuteurCommandeImpl().executerCommande(commande);
        }
    }
}
