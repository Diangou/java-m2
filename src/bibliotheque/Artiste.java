package bibliotheque;

public class Artiste {

    private static int idAuteur;
    int id;
    String nom;
    String prenom;

    public Artiste(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }

    public Artiste(String nom, String prenom) {
        this.id = idAuteur++;
        this.nom = nom;
        this.prenom = prenom;

    }

    @Override
    public String toString() {
        return "Id: " + id + " Nom: " + nom + " Prenom: " + prenom;
    }

    private CD produire(String titre, String genre, String artiste, int annee){
        return new CD(titre, this, genre, artiste, annee );
    }

}
