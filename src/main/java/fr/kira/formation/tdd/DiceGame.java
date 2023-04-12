package fr.kira.formation.tdd;

import java.util.ArrayList;
import java.util.List;

public class DiceGame {

    private final List<Joueur> joueurs;
    private Gobelet gobelet;

    public DiceGame(Gobelet gobelet, Joueur... joueurs){
        this.joueurs = new ArrayList<>(List.of(joueurs));
        this.gobelet = gobelet;

    }

    public void setGobelet(Gobelet gobelet) {
        this.gobelet = gobelet;
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

    public int lancerGobelet(){
        return this.gobelet.lancer();
    }
}
