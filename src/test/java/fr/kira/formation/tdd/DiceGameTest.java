package fr.kira.formation.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceGameTest {

    DiceGame diceGame;

    @BeforeEach
    void setUp() {
        diceGame = new DiceGame();
    }

    @Test
    @DisplayName("En tant que joueur, je veux saisir le gobelet")
    public void saisirGobelet(){
        Gobelet gobelet = diceGame.saisirGobelet();
        assertNotNull(gobelet);
    }
}