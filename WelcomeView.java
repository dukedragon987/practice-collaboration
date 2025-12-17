import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class WelcomeView extends HBox {
    WelcomeView() {
        Button button = new Button();
        button.setOnAction(event -> {
            Scene currentScene = getScene();    // Get the scene this node is currently in.
            MainView newRoot = new MainView();  // Create a MainView node.
            currentScene.setRoot(newRoot);
            currentScene.getWindow().sizeToScene();
        });
    }
}