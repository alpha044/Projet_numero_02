public class FichierAudio extends Fichier {
    private int bitrate;

    public FichierAudio(String nom, double taille, String dateCreation, String chemin, int bitrate) {
        super(nom, taille, dateCreation, chemin);
        this.bitrate = bitrate;
    }

    public int getBitrate() { return bitrate; }
    public void setBitrate(int bitrate) { this.bitrate = bitrate;
    }
}