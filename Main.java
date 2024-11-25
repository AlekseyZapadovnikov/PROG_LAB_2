import MyPokemons.Clamperl;
import MyPokemons.Yveltal;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Clamperl("A", 1);
        Pokemon p2 = new Yveltal("B", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}