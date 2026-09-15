package bibliotheque;

import java.util.ArrayList;
import java.util.List;


public class Adherent {
    private static int CPT = 1;

    int id;
    String nom;
    String prenom;
    EtatLivre etat = EtatLivre.LIBRE;
    List<Livre> livres;

    public Adherent( String prenom) {
        this.prenom = prenom;
        this.livres = new ArrayList<>();
    }

    public Livre emprunt(Livre livre) {
        livre.emprunter();
        this.livres.add(livre);
        return livre;
    }

    public Livre rendre(Livre livre) {
        livre.rendre();
        this.livres.remove(livre);
        return livre;
    }

    public void perdre(Livre livre) {
        if (livres.contains(livre)) {
            livres.remove(livre);
            livre.perdre();
        }
    }

    public void vol(Livre livre) {
        if (livres.contains(livre)) {
            livres.remove(livre);
            livre.voler();
        }
    }
}
