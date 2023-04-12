package fr.kira.formation.tdd;

import java.util.ArrayList;
import java.util.List;

public class Gobelet {

    private final List<De> des;
    private int nombrePrecedent = 0;


    public Gobelet(De... des){
        this.des = new ArrayList<>(List.of(des));
    }

    public void setDes(De... des){
        this.des.addAll(List.of(des));
    }
    public int lancer() {
        int result = 0;
        for (De de: this.des){
            result+=de.lancer();
        }
        nombrePrecedent++;
        return result;
    }
}
