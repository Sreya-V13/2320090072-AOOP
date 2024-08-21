package game;

public class GameplayStarter {
    public String startGame(String data, String settings) {
        System.out.println("Starting the game...");
        if (data != null && settings != null) {
            return "Game started with " + data + " and " + settings;
        } else {
            return "Failed to start the game";
        }
    }
}
