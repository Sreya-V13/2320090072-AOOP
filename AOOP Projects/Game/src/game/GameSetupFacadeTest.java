package game;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GameSetupFacadeTest {
    
    private GameSetupFacade gameFacade;

    @Before
    public void setUp() {
        gameFacade = new GameSetupFacade();
    }

    @Test
    public void testSetupAndStartGame() {
        String result = gameFacade.setupAndStartGame();
        assertEquals("Game started with game data loaded and Settings initialized", result);
    }
}
