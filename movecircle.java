package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class movecircle extends Application {
    @Override
    public void start(Stage stage) {
        Button  up= new Button("Up");
        Button  down= new Button("Down");
        Button  left= new Button("Left");
        Button  right= new Button("Right");

        Circle circle = new Circle(25);


        VBox topBox = new VBox(up);
        topBox.setAlignment(Pos.CENTER);

        VBox bottomBox = new VBox(down);
        bottomBox.setAlignment(Pos.CENTER);

        VBox leftBox = new VBox(left);
        leftBox.setAlignment(Pos.CENTER);

        VBox rightBox = new VBox(right);
        rightBox.setAlignment(Pos.CENTER);


        BorderPane layout = new BorderPane();
        layout.setTop(topBox);
        layout.setBottom(bottomBox);
        layout.setLeft(leftBox);
        layout.setRight(rightBox);
        layout.setCenter(circle);

        up.setOnAction(moveup -> {
           circle.setTranslateY(circle.getTranslateY() - 2);
        });
        down.setOnAction(movedown -> {
            circle.setTranslateY(circle.getTranslateY() + 2);
        });
        left.setOnAction(moveleft -> {
            circle.setTranslateX(circle.getTranslateX() - 2);
        });
        right.setOnAction(moveright -> {
            circle.setTranslateX(circle.getTranslateX() + 2);
        });


        Scene scene = new Scene(layout,480,480);
        stage.setScene(scene);
        stage.setTitle("Move the circle");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}