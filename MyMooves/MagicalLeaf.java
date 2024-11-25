package MyMooves;

import ru.ifmo.se.pokemon.*;


public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.GRASS, 60, 100);
    }

    public String describe(){
        return "used DragonClaw";
    }
}
