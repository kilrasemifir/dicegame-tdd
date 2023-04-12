package fr.kira.formation.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {

    DiceGame diceGame;

    @BeforeEach
    void setUp() {
        diceGame = new DiceGame(new Joueur(), new Joueur(), new Joueur());
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
}