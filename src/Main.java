import bibliotheque.*;

//
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var victor = new Auteur("Hugo", "Victor");
        var mary = new Auteur("Shelley", "Mary");
        var tolkien = new Auteur("Tolkien", "John");

        var miserables = new Livre("Les miserables", victor, "tragedie", "Gallimard");
        var frankenstein = new Livre("Frankenstein", mary, "Horreur", "Flamarion");
        var seigneurAnneaux = new Livre ("Le Seigneur des Anneaux", tolkien, "Fantastique", "Flamarion");

        var etagere = new Etagere(miserables, frankenstein, seigneurAnneaux);

        var carte1 = new Carte("XSJD6SG7");
        var carte2 = new Carte("XKSD3SG2");
        var carte3 = new Carte("XMSV3SG9");

        var talyha = new Adherent( "Talyha", carte1);
        var pierric = new Adherent("Pierric", carte2);
        var rafael = new Adherent("Rafael", carte3);



        rafael.vol(miserables);
        pierric.rendre(seigneurAnneaux);
        talyha.perdre(frankenstein);
        talyha.volCarte();

        System.out.println(miserables.getEtat());
        System.out.println(seigneurAnneaux.getEtat());
        System.out.println(frankenstein.getEtat());
        System.out.println(carte1.getEtat());

    }
}