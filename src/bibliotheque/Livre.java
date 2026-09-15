package bibliotheque;

public class Livre implements Document {

    private static int CPT = 1;

    int id;
    String titre;
    String genre;
    boolean estEmprunte;
    EtatLivre etat = EtatLivre.LIBRE;
    String edition;
    Auteur auteur;
    Etagere etagere;

    public Livre(String titre, Auteur auteur, String genre , String edition) {
        this.id = CPT++;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.edition = edition;
        this.estEmprunte = false;
    }

    public void emprunter(){
        setEtat(EtatLivre.EMPRUNTE);
    }

    public void rendre(){
        setEtat(EtatLivre.LIBRE);
    }

    public void detruit(){
        setEtat(EtatLivre.DETRUIT);
    }

    public void vol(){
        setEtat(EtatLivre.VOL);
    }

    public void declarerPerdu(){
        setEtat(EtatLivre.PERDU);
    }

    public void setEtat(EtatLivre etat){
        this.etat = etat;
    }

    public void setEtagere(Etagere etagere) {
        this.etagere = etagere;
    }

    public Etagere getEtagere() {
        return this.etagere;
    }

    public EtatLivre getEtat() {
        return this.etat;
    }

    public void perdre() {
        setEtat(EtatLivre.PERDU);
    }

    public void voler() {
        setEtat(EtatLivre.VOL);
    }
}