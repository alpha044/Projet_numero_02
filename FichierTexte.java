public class FichierTexte extends Fichier {
    private String encodage;
 public FichierTexte(String nom, double taille, String dateCreation, String chemin, String encodage) {
        super(nom, taille, dateCreation, chemin);
        this.encodage = encodage;
    }

    public String getEncodage() { return encodage; }
    public void setEncodage(String encodage) { this.encodage = encodage; }
}

