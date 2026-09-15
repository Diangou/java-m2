package bibliotheque;

import java.util.Arrays;
import java.util.List;

public class Etagere {
    private static final int MAX_LIVRE= 10;
    int row;
    int col;

    public Etagere(Livre...livres) {
        this.setLivres(Arrays.asList(livres));
    }

    public List<Livre> livres;

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        var ajoutOK = livres.size() < MAX_LIVRE;
        if (ajoutOK) {

            for(var livre : livres) {
                if(livre.titre != null) {
                    livre.setEtagere(this);
                }
            }
            livres.stream()
                    .filter(livre -> livre.titre != null)
                    .forEach(livre -> livre.setEtagere(this));

        }
        else {
            throw new IllegalArgumentException("Il y a trop de livre taille max 10");
        }
    }

    public void AddLivre(Livre livre) {
        this.livres.add(livre);
    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }

    void prendFeu(){
        livres.stream()
                .filter(livre -> livre.etat == EtatLivre.LIBRE)
                .forEach(livre -> livre.setEtat(EtatLivre.DETRUIT));
    }
}
