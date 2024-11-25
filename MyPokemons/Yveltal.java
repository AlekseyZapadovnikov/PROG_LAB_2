package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Yveltal extends Pokemon {
    public Yveltal(String name, int lvl) {
        super(name, lvl);
        this.setType(new Type[]{Type.DARK, Type.FLYING});
        this.setStats(126.0, 131.0, 95.0, 131.0, 98.0, 99.0);
        this.setMove(new Move[]{new RockSlide(), new Roost(), new DragonRush(), new DragonClaw()});
    }
    public Yveltal() {
        this("Unnamed", 1);
    }
}
