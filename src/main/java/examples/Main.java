package examples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);
        text.setLayoutX(100);

        Group group = new Group(text);

//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Scene scene = new Scene(group);
        stage.setTitle("First Application");
        stage.setScene(scene);
        stage.show();
        stage.setWidth(300);
        stage.setHeight(250);
    }

    public static void main(String[] args) {
        launch();
    }
}