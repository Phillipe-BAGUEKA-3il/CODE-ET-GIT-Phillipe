/**
 * Classe qui représente un gestionnaire de notes
 */
public class GestionnaireNotes {

    /**
     * affiche les notes et moyennes d'un etudiant
     * @param nomEtudiant le nom de l'étudiant
     * @param notes tableau de notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        affichage_notes(nomEtudiant, notes);

        // Calcul de la somme des notes
        somme_notes(notes);

        // Affichage de la moyenne
        affichage_moyenne(notes);
    }


    /**
     * affiche les notes des etudiants
     * @param nomEtudiant le nom de l'étudiant
     * @param notes tableau des notes des etudiants
     */
    public void affichage_notes (String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Retourne la somme des notes d'un étudiants 
     * @param notes tableau de notes d'un étudiant
     * @return somme des notes d'un étudiant
     */
    public int somme_notes (int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }


    /**
     * affiche la moyenne des notes d'un étudiant
     * @param notes tableau de notes d'un etudiant
     */
    public void affichage_moyenne (int[] notes) {
        int somme = somme_notes(notes);
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne); 
    }
}
