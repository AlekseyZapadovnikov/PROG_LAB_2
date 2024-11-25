package MyPokemons;

import MyMooves.*;
import ru.ifmo.se.pokemon.*;

public class Clamperl extends Pokemon {
    public Clamperl(String name, int lvl) {
        super(name, lvl);
        this.setType(new Type[]{Type.WATER});
        this.setStats(35.0, 64.0, 85.0, 74.0, 55.0, 32.0);
        this.setMove(new Move[]{new WaterPulse(), new Waterfall(), new IceBeam()});
    }
    public Clamperl() {
        this("Unnamed", 1);
    }
}
