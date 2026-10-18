package affichagesimple;

public class Commande {
    public static void main(String[] args) {
        double prixHT = 150.0;
        double tauxTVA = 0.20;
        int quantite = 3;

        double montantTVA = prixHT * tauxTVA;
        double prixTTC = prixHT + montantTVA;
        double totalCommande = prixTTC * quantite;

        System.out.println("Prix HT : " + prixHT + " DA");
        System.out.println("Taux de TVA : " + tauxTVA);
        System.out.println("Quantité : " + quantite);
        System.out.println("Montant de la TVA : " + montantTVA + " DA");
        System.out.println("Prix TTC : " + prixTTC + " DA");
        System.out.println("Total de la commande : " + totalCommande + " DA");
    }
}