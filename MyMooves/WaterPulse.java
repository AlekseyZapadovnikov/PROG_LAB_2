package MyMooves;

import ru.ifmo.se.pokemon.*;

public class WaterPulse extends SpecialMove {
    public WaterPulse(){
        super(Type.WATER, 60, 100);
    }

    public String describe(){
        return "used Roost";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.8) {
            Effect.confuse(p);
        }
    }
}
