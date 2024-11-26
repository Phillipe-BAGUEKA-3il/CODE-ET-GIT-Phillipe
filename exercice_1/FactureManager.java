/**
 * Classe qui represente un gerant de facture 
 * il fait des reductions et retourne le total
 */
public class FactureManager {

    /**
     * calcule le total de la facture
     * @param typeProduit le type du produit
     * @param quantite quantite du produit
     * @param prixUnitaire le prix unitaire
     * @return le total apres reduction
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total;
        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total = reduction_5(quantite, prixUnitaire);
        } else if (typeProduit.equals("Electronique")) {
            total = reduction_10(quantite, prixUnitaire); // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total = reduction_15(quantite, quantite); // Réduction de 15%
        }

        // Reduction sur le total
        reduction_total(total)
        return total;
    }

    /**
     * Methode fait une reduction de 5 %
     * @param quantite La quantite de produits
     * @param prixUnitaire Le prix d'un produit
     * @return le montant apres reduction 
     */
    public double reduction_5 (int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        total -= total * 0.05;
        return total;
    }


    /**
     * Methode fait une reduction de 10%
     * @param quantite La quantite de produits
     * @param prixUnitaire Le prix d'un produit
     * @return le montant apres reduction 
     */
    public double reduction_10 (int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        total -= total * 0.1;
        return total;
    }


    /**
     * Methode fait une reduction de 15 %
     * @param quantite La quantite de produits
     * @param prixUnitaire Le prix d'un produit
     * @return le montant apres reduction 
     */
    public double reduction_15 (int quantite, int prixUnitaire) {
        double total = quantite * prixUnitaire;
        total -= total * 0.15;
        return total;
    }

    /**
     * Effectue une reduction de 5% sur le total
     * @param total le total de la facture
     * @return total apres reduction
     */
    public double reduction_total (double total) {
        if (total > 1000) {
            total -= total * 0.05;
        }
        return total;
    }

}
