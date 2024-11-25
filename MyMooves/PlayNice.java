package MyMooves;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice(){
        super(Type.NORMAL, 0, 0);
    }

    public String describe(){
        return "used PlayNice";
    }

    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
}
