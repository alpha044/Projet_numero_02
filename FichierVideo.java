public class FichierVideo extends Fichier {
    private int duree;

    public FichierVideo(String nom, double taille, String dateCreation, String chemin, int duree) {
        super(nom, taille, dateCreation, chemin);
        this.duree = duree;
    }

    public int getDuree() { return duree; }
    public void setDuree(int duree) { this.duree = duree; }
}


