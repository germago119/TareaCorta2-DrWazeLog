package GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.GraphFiller;

public class Main extends Application {
  public static void main (String[] args) {
    launch(args);
  }

  @Override
  public void start (Stage primaryStage) {
    primaryStage.setTitle("DrWazeLog");
    Pane pane = new Pane();
    UINodesFactory.setMainPane(pane);
    Scene scene = new Scene(pane, 1600, 1200);
    pane.setBackground(
            new Background(new BackgroundFill(Color.web("#f8f3e6"), CornerRadii.EMPTY, Insets.EMPTY)));
    primaryStage.setScene(scene);
    GraphFiller.GraphFiller();
    primaryStage.show();
  }
}
