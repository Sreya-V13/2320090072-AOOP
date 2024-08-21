package game;

public class GameSetupFacade {
    private GameDataLoader dataLoader;
    private GameSettingsInitializer settingsInitializer;
    private GameplayStarter gameplayStarter;

    public GameSetupFacade() {
        this.dataLoader = new GameDataLoader();
        this.settingsInitializer = new GameSettingsInitializer();
        this.gameplayStarter = new GameplayStarter();
    }

    public String setupAndStartGame() {
        String data = dataLoader.loadData();
        String settings = settingsInitializer.initializeSettings();
        return gameplayStarter.startGame(data, settings);
    }
}
