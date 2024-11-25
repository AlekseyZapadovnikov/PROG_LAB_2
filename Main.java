import MyPokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Clamperl("A", 1);
        Pokemon p2 = new Yveltal("B", 1);
        b.addAlly(new Bounsweet("b", 1));
        b.addAlly(new Steenee("fdfd", 1));
        b.addFoe(new Steenee("aa", 1));
        b.addFoe(new Huntail("kk", 1));
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}