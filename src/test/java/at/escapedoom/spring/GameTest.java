package at.escapedoom.spring;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {


    //Das Spiel besteht aus 10 Frames

    //In jedem Frame hat der Spieler zwei Würfe, um 10 Pins umzuwerfen.

    // Die Punktzahl für den Frame ergibt sich aus der Gesamtzahl der umgeworfenen Pins, plus Boni für Strikes und Spares

    // Ein Spare ist, wenn der Spieler alle 10 Pins in zwei Würfen umwirft.

    // Der Bonus für diesen Frame ist die Anzahl der Pins, die beim nächsten Wurf umgeworfen werden

    @Test
    public void testScore(){
        Game gameTest = new Game();
         Assert.assertTrue(gameTest.score() == 0);
    }

    @Test
    public void testFirstRoll() {
        Game gameTest = new Game();

        gameTest.roll(7);

        Assert.assertEquals(7, gameTest.score());

        gameTest.roll(2);

        Assert.assertEquals(9, gameTest.score());
    }

    @Test
    public void testFirstTwoRolls() {
        Game gameTest = new Game();

        gameTest.roll(7);

        Assert.assertEquals(7, gameTest.score());

        gameTest.roll(2);

        Assert.assertEquals(9, gameTest.score());
    }
}
