
public class Fichier {
    protected String nom;
    protected double taille;
    protected String dateCreation;
    protected String chemin;

    public Fichier(String nom, double taille, String dateCreation, String chemin) {
        this.nom = nom;
        this.taille = taille;
        this.dateCreation = dateCreation;
        this.chemin = chemin;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getTaille() { return taille; }
    public void setTaille(double taille) { this.taille = taille; }

    public String getDateCreation() { return dateCreation; }
    public void setDateCreation(String dateCreation) { this.dateCreation = dateCreation; }

    public String getChemin() { return chemin; }
    public void setChemin(String chemin) { this.chemin = chemin; }
}

