package bibliotheque;

public class Auteur {

    private static int idAuteur;
    int id;
    String nom;
    String prenom;

    public Auteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }

    public Auteur(String nom, String prenom) {
        this.id = idAuteur++;
        this.nom = nom;
        this.prenom = prenom;

    }

    @Override
    public String toString() {
        /*var sb = new StringBuilder();
        sb.append("Nom: ");
        sb.append(nom);
        return sb.toString();*/

        return "Id: " + id + " Nom: " + nom + " Prenom: " + prenom;
    }

    private Livre ecrire(String titre, String genre, String edition){
        return new Livre(titre,  this, genre, edition);
    }

}
