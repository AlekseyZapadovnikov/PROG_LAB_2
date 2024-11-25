package MyMooves;

import ru.ifmo.se.pokemon.*;


public class DragonRush extends PhysicalMove {
    public DragonRush(){
        super(Type.ROCK, 100, 75);
    }

    public String describe(){
        return "used DragonRUSH!!!";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.8) {
            Effect.flinch(p);
        }
    }
}
