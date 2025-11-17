public class FichierImage extends Fichier {
    private String resolution;

    public FichierImage(String nom, double taille, String dateCreation, String chemin, String resolution) {
        super(nom, taille, dateCreation, chemin);
        this.resolution = resolution;
    }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }
}