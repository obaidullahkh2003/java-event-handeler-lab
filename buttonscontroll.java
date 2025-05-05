package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class buttonscontroll extends Application {

    boolean isclicked=false;

    @Override
    public void start(Stage primaryStage) {

        Button button1 = new Button("Print");
        Button button2 = new Button("Disable");

        button1.setOnAction(print -> {
            System.out.println("Hello World!");
        });

        button2.setOnAction(changestats -> {
            if (!isclicked) {
                button1.setDisable(true);
                button2.setText("Enable");
                isclicked=true;
            }else {
                button1.setDisable(false);
                button2.setText("Disable");
                isclicked=false;
            }
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(button1,button2);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox,480,480);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Buttons Controll");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
