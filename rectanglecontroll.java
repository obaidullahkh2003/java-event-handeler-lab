package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class rectanglecontroll extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button rotateclockwise = new Button("↻");
        Button rotatecounterclockwise = new Button("↺");


        rotateclockwise.setPrefSize(100, 60);
        rotatecounterclockwise.setPrefSize(100, 60);

        Rectangle rectangle = new Rectangle(100, 50);

        rotateclockwise.setOnAction(e -> {
            rectangle.setRotate(rectangle.getRotate() + 15);
        });
        rotatecounterclockwise.setOnAction(e -> {
            rectangle.setRotate(rectangle.getRotate() - 15);
        });

        HBox buttoncontainer = new HBox(20);
        buttoncontainer.getChildren().addAll(rotateclockwise, rotatecounterclockwise);
        buttoncontainer.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(rectangle);
        borderPane.setTop(buttoncontainer);

        Scene scene = new Scene(borderPane, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectangle Control");
        primaryStage.show();
    }
}
