package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private AnchorPane rootLayout;
    private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Шахматы");
        this.primaryStage.setResizable(false);

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("res/sample.fxml"));
        rootLayout = (AnchorPane) loader.load();

        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller controller = loader.getController();
        controller.init();
        controller.paint();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
