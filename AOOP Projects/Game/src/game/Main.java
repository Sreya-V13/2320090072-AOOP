package game;

public class Main {
    public static void main(String[] args) {
        GameSetupFacade gameFacade = new GameSetupFacade();
        String result = gameFacade.setupAndStartGame();
        System.out.println(result);
    }
}