package MyMooves;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove {
    public TeeterDance(){
        super(Type.NORMAL, 90, 100);
    }

    public String describe(){
        return "used Teeter Dance!";
    }

    public void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
}
