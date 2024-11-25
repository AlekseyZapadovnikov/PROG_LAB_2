package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Tsareena extends Bounsweet {
    public Tsareena(String name, int lvl) {
        super(name, lvl);
        this.setStats(72.0, 120.0, 98.0, 50.0, 98.0, 72.0);
        this.addMove(new Splash());
    }
    public Tsareena() {
        this("Unnamed", 1);
    }
}
