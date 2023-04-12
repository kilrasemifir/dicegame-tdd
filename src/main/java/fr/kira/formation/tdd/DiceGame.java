package fr.kira.formation.tdd;

import java.util.ArrayList;
import java.util.List;

public class DiceGame {

    private final List<Joueur> joueurs;
    private Gobelet gobelet;
    private int nombreDejaJoue = 0;
    private int indexJoueur = 0;

    public DiceGame(Gobelet gobelet, Joueur... joueurs){
        this.joueurs = new ArrayList<>(List.of(joueurs));
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
        this.nombreDejaJoue ++;
        this.indexJoueur++;
        return this.gobelet.lancer();
    }

    public int getNombreDejaJoue() {
        return this.nombreDejaJoue;
    }

    public int getNombreRestant() {
        return this.getNombreParticipants()-this.getNombreDejaJoue();
    }

    public Joueur quiJoue() {
        return this.joueurs.get(indexJoueur);
    }
}
