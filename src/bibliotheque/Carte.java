package bibliotheque;

public class Carte {
    int id;
    String numeroSerie;
    Adherent adherent;
    EtatCarte etat = EtatCarte.INACTIVE;

public Carte (String numeroSerie) {
    this.numeroSerie = numeroSerie;
}

public void setEtat(EtatCarte etat){
        this.etat = etat;
    }

public EtatCarte getEtat() {
        return this.etat;
    }

public void creer() {
    setEtat(EtatCarte.ACTIVE);
}

}



