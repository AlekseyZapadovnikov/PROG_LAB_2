package MyMooves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost(){
        super(Type.ROCK, 0, 0);
    }

    public String describe(){
        return "used Roost";
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, 63);
    }
}
