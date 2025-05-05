package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class controllcircle extends Application {
    @Override
    public void start(Stage stage) {
        Button  enlarge= new Button("Enlarge");
        Button  shrink= new Button("Shrink");



        Circle circle = new Circle(25);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);


        HBox buttonscontainer = new HBox(5);
        buttonscontainer.setAlignment(Pos.CENTER);
        buttonscontainer.getChildren().addAll(enlarge,shrink);

        BorderPane layout = new BorderPane();
        layout.setBottom(buttonscontainer);
        layout.setCenter(circle);

        enlarge.setOnAction(growup -> {
            if (circle.getRadius()<150) {
                circle.setRadius(circle.getRadius() + 2);
            } else
                enlarge.setDisable(true);
            shrink.setDisable(false);

        });
        shrink.setOnAction(shrinkdown -> {
            if (circle.getRadius()>20) {
                circle.setRadius(circle.getRadius() - 2);
                enlarge.setDisable(false);
            }else {
                shrink.setDisable(true);
            }

        });


        Scene scene = new Scene(layout,480,480);
        stage.setScene(scene);
        stage.setTitle("Controlling Circle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}