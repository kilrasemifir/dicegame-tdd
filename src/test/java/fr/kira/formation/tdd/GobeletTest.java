package fr.kira.formation.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GobeletTest {

    Gobelet gobelet;

    @BeforeEach
    void setUp() {
        gobelet = new Gobelet();De de1 = Mockito.mock(De.class);
        Mockito.when(de1.lancer()).thenReturn(3);
        De de2 = Mockito.mock(De.class);
        Mockito.when(de2.lancer()).thenReturn(1);
        gobelet.setDes(de1, de2);
    }

    @Test
    @DisplayName("En tant que joueur, quand je lance le gobelet, le score est strictement positif")
    public void lancer(){
        int score = gobelet.lancer();
        assertTrue(score > 0);
    }

    @Test
    @DisplayName("Le score du gobele est egale a la somme des valeurs des des")
    public void scoreValeur(){
        assertEquals(4, gobelet.lancer());
    }

    @Test
    @DisplayName("Si je joue en premier alors aucun autre joueurs n'a lancer le gobelet")
    public void nombreDeJeurPrecedent(){
        int nombreJoueurPrecedent = gobelet.getNombreJoueurPrecedent();
        assertEquals(0, nombreJoueurPrecedent);
    }

    @Test
    @DisplayName("Si un autre joueur joue avant, je sais qu'il y a un joueur precedent")
    public void joueurPrecedent(){
        gobelet.lancer();
        int nombreJoueurPrecedent = gobelet.getNombreJoueurPrecedent();
        assertEquals(1, nombreJoueurPrecedent);
    }

}