package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Steenee extends Bounsweet {
    public Steenee(String name, int lvl) {
        super(name, lvl);
        this.setStats(52.0, 40.0, 48.0, 40.0, 48.0, 62.0);
        this.addMove(new PlayNice());
    }
    public Steenee() {
        this("Unnamed", 1);
    }
}
