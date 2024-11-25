package MyMooves;

import ru.ifmo.se.pokemon.*;


public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    public String describe(){
        return "used RockSlide";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.7) {
            Effect.flinch(p);
        }
    }
}
