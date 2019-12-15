import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FxApplication extends Application {

    private static final int WIN_WIDTH = 300;
    private static final int WIN_HEIGH = 200;

    public void start(final Stage stage) throws Exception {
        initMainWindow(stage);
    }

    private final void initMainWindow(final Stage parStage) {
        final BorderPane locPanel = new BorderPane();

        initMenu(locPanel);

        parStage.setScene(new Scene(locPanel, WIN_WIDTH, WIN_HEIGH));
        parStage.setTitle("FxApplication");
        parStage.show();
    }

    private final void initMenu(final BorderPane parBorderPanel) {
        final MenuBar locMenuBar = new MenuBar();
        parBorderPanel.setTop(locMenuBar);

        final Menu locMenu = new Menu("General");
        locMenuBar.getMenus().add(locMenu);

        final MenuItem locMenuItem = new MenuItem("Game");
        locMenu.getItems().add(locMenuItem);
    }

    public static void main(String[] args) {
        launch(args);
    }
}