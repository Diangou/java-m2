package bibliotheque;

public class CD implements Document{

    private static int CPT = 1;

    int id;
    String titre;
    String genre;
    EtatCD etat = EtatCD.LIBRE;
    Artiste artiste;
    int annee;
    Etagere etagere;


    public CD(int id, String titre, String genre, Artiste artiste, int annee) {
        this.id = CPT++;
        this.artiste = artiste;
        this.titre = titre;
        this.genre = genre;
        this.annee = annee;
    }

    public CD(String titre, Artiste artiste, String genre, int annee) {
        this.id = CPT++;
        this.titre = titre;
        this.artiste = artiste;
        this.genre = genre;
        this.annee = annee;
    }

    @Override
    public void emprunter(){
        setEtat(EtatCD.EMPRUNTE);
    }

    public void rendre(){
        setEtat(EtatCD.LIBRE);
    }

    public void detruit(){
        setEtat(EtatCD.DETRUIT);
    }

    public void vol(){
        setEtat(EtatCD.VOL);
    }

    public void declarerPerdu(){
        setEtat(EtatCD.PERDU);
    }

    public void setEtat(EtatCD etat){
        this.etat = etat;
    }

    public void setEtagere(Etagere etagere) {
        this.etagere = etagere;
    }

    public Etagere getEtagere() {
        return this.etagere;
    }

    public EtatCD getEtat() {
        return this.etat;
    }

    public void perdre() {
        setEtat(EtatCD.PERDU);
    }

    public void voler() {
        setEtat(EtatCD.VOL);
    }
}
