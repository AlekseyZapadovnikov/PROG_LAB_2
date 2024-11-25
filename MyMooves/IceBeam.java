package MyMooves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends PhysicalMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    public String describe(){
        return "used IceBeam!";
    }

    public void applyOppEffects(Pokemon p){
        if (Math.random()>=0.9) {
            Effect.freeze(p);
        }
    }
}
