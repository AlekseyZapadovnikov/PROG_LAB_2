package MyMooves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.ROCK, 80, 100);
    }

    public String describe(){
        return "used WaterFall";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.8) {
            Effect.flinch(p);
        }
    }
}
