package fr.kira.formation.tdd;

import java.util.ArrayList;
import java.util.List;

public class DiceGame {

    private final List<Joueur> joueurs;

    public DiceGame(Joueur... joueurs){
        this.joueurs = new ArrayList<>(List.of(joueurs));
    }

    public Gobelet saisirGobelet(){
        return new Gobelet();
    }

    public int getNombreParticipants() {
        return this.joueurs.size();
    }

    public int getNombreManches() {
        return this.joueurs.size()+1;
    }

    public int getNombreDes() {
        return this.getNombreParticipants();
    }
}
