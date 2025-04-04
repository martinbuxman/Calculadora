package application;

import controllers.CalculadoraController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;

import static javafx.application.Application.launch;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.CALCULADORA_PATH));

        AnchorPane pane = loader.load();
        Scene scene = new Scene(pane);
        CalculadoraController controller = (CalculadoraController) loader.getController();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

