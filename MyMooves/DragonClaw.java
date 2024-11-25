package MyMooves;

import ru.ifmo.se.pokemon.*;


public class DragonClaw extends PhysicalMove {
    public DragonClaw(){
        super(Type.FIRE, 80, 100);
    }

    public String describe(){
        return "used DragonClaw";
    }
}
