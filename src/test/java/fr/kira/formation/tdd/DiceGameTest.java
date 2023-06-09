package fr.kira.formation.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {

    DiceGame diceGame;
    Gobelet gobelet;
    Joueur joueur1 = new Joueur();
    Joueur joueur2 = new Joueur();
    Joueur joueur3 = new Joueur();
    @BeforeEach
    void setUp() {
        gobelet = Mockito.mock(Gobelet.class);
        Mockito.when(gobelet.lancer()).thenReturn(5);
        diceGame = new DiceGame(gobelet, joueur1, joueur2, joueur3);
    }

    @Test
    @DisplayName("En tant que joueur, je veux saisir le gobelet")
    public void saisirGobelet(){
        Gobelet gobelet = diceGame.saisirGobelet();
        assertNotNull(gobelet);
    }

    @Test
    @DisplayName("En tant que joueur, je veux connaitre le nombre de participants.")
    public void getNombrePaticipants(){
        int nombreParticipants = diceGame.getNombreParticipants();
        assertEquals(3, nombreParticipants);
    }

    @Test
    @DisplayName("En tant que joueur, je veux connaitre le nombre de manches. (nbJoueur+1)")
    public void getNombreManche(){
        int nombreManche = diceGame.getNombreManches();
        assertEquals(4, nombreManche);
    }

    @Test
    @DisplayName("En tant que joueur, je veux connaitre le nombre de dés que je lance. (=nbJoueur)")
    public void getNombreDes(){
        int nombreDes = diceGame.getNombreDes();
        assertEquals(3, nombreDes);
    }

    @Test
    @DisplayName("Lors ce que je lance le gobelet, je recupere son score")
    public void scoreGobelet(){
        int score = diceGame.lancerGobelet();
        assertEquals(5, score);
    }

    @Test
    @DisplayName("Je peux connaitre le nombre de joueur qui ont deja jouer")
    public void dejaJouer(){
        diceGame.lancerGobelet();
        int dejaJoue = diceGame.getNombreDejaJoue();
        assertEquals(1, dejaJoue);
    }

    @Test
    @DisplayName("En tant que joueur, je veux connaitre combien de joueurs restent à lancer leurs dés.")
    public void restant(){
        diceGame.lancerGobelet();
        int restant = diceGame.getNombreRestant();
        assertEquals(2, restant);
    }

    @Test
    @DisplayName("Le joueur 1 est le premier a jouer")
    public void quiJoue(){
        Joueur joueur = diceGame.quiJoue();
        assertEquals(joueur1, joueur);
    }

    @Test
    @DisplayName("Quand un joueur a jouer, le suivant est le joueur suivant")
    public void quiJoue2(){
        diceGame.lancerGobelet();
        Joueur joueur = diceGame.quiJoue();
        assertEquals(joueur2, joueur);
    }

}