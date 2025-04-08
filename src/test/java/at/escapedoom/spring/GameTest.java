package at.escapedoom.spring;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {


    @Test
    public void testScore(){
        Game gameTest = new Game();

         Assert.assertTrue(gameTest.score() == 0);

    }
}
