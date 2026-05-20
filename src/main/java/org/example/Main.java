package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
//import java.awt.Button;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Botón abre alerta, Ejercicio 20");

        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Confirmacion");
        alerta.setHeaderText(null);
        alerta.setContentText("Ha pulsado un botón");

        Button abrirVentana = new Button("Abrir ventana");
        abrirVentana.setOnAction(e -> {alerta.showAndWait();});

        VBox vBox = new VBox(abrirVentana);
        Scene scene = new Scene(vBox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}