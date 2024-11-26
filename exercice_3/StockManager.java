/**
 * Classe qui représente un gestionnaire stock
 */
public class StockManager {

    /**
     * gere le stock d'un produit
     * @param typeOperation type de produit
     * @param produit le nom du produit
     * @param quantite quantite du produit
     * @param stock quantite de produit en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            ajout_stock(produit, quantite, stock);
        // Retrait du stock
        } else if (typeOperation.equals("retrait")) {
            retrait_produit(produit, quantite, stock);
        // Si l'action est inconnu
        } else {
            System.out.println("Opération inconnue.");
        }
    }

    /**
     * ajoute un produit du stock
     * @param produit le nom du produit
     * @param quantite quantite de ce produit 
     * @param stock le stock avant ajout 
     * @return le stock apres retrait 
     */
    public int ajout_stock (String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }


    /**
     * retire un produit du stock
     * @param produit le nom du produit
     * @param quantite quantite de ce produit 
     * @param stock le stock avant retrait 
     * @return le stock apres retrait 
     */
    public int retrait_produit (String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }

}
