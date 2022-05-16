package application;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class App extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//       Parent root = FXMLLoader.load(getClass().getResource("fxml/1.fxml"));
        primaryStage.show();
//        primaryStage.setScene(new Scene(root));

    }
}
