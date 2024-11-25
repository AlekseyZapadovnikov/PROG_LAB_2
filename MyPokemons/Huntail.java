package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Huntail extends Clamperl {
    public Huntail(String name, int lvl) {
        super(name, lvl);
        this.setStats(55.0, 104.0, 105.0, 94.0, 75.0, 52.0);
        this.addMove(new AquaTail());
    }
    public Huntail() {
        this("Unnamed", 1);
    }
}
