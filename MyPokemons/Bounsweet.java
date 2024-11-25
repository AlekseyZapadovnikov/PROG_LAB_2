package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int lvl) {
        super(name, lvl);
        this.setType(new Type[]{Type.GRASS});
        this.setStats(42.0, 30.0, 38.0, 30.0, 38.0, 32.0);
        this.setMove(new Move[]{new TeeterDance(), new MagicalLeaf()});
    }
    public Bounsweet() {
        this("Unnamed", 1);
    }
}
