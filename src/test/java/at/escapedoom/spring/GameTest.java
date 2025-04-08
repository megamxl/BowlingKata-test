package at.escapedoom.spring;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

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

    @Test
    public void testThirdRollInFirstNineRound(){
        Game gameTest = new Game();

        gameTest.roll(5);
        Assert.assertEquals(5, gameTest.score());

        gameTest.roll(2);
        Assert.assertEquals(7, gameTest.score());

        gameTest.roll(1);
        Assert.assertEquals(0, gameTest.scores[0].split3 );
        Assert.assertEquals(1, gameTest.scores[1].split1);
    }

    @Test
    public void testThirdRollInLastRound(){
        Game gameTest = new Game();

        for (int i = 0; i < 20; i++) {
            int x = new Random().nextInt(10 - 1 + 1) + 1;
            gameTest.roll(x);
        }

        gameTest.roll(5);
        Assert.assertEquals(5, gameTest.scores[9].split3);
    }

    @Test
    public void testCurFrameFoo() {
        Game gameTest = new Game();
        gameTest.roll(5);

        Assert.assertEquals(gameTest.curFramePart,1);
    }

    private void printScores(Game gameTest){

        Arrays.stream(gameTest.scores).forEach( s -> {
            System.out.println(s.split1 +"-"+ s.split2+"-"+s.split3);
        });
    }
}
