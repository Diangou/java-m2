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

        var talyha = new Adherent( "Talyha");
        var pierric = new Adherent("Pierric");
        var rafael = new Adherent("Rafael");

        rafael.vol(miserables);
        pierric.rendre(seigneurAnneaux);
        talyha.perdre(frankenstein);

        System.out.println(miserables.getEtat());
        System.out.println(seigneurAnneaux.getEtat());
        System.out.println(frankenstein.getEtat());

    }
}