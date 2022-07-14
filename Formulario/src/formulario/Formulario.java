/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rfleiva
 */
public class Formulario extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Enviar");
        btn.setLayoutX(50);
        btn.setLayoutY(120);
        Label lbl = new Label("Nombre:");
        lbl.setLayoutX(10);
        lbl.setLayoutY(10);
        Label lbl2 = new Label("Apellidos:");
        lbl2.setLayoutX(10);
        lbl2.setLayoutY(30);
        Label lbl3 = new Label("Teléfono:");
        lbl3.setLayoutX(10);
        lbl3.setLayoutY(50);
        Label lbl4 = new Label("Email:");
        lbl4.setLayoutX(10);
        lbl4.setLayoutY(70);
        Label lbl5 = new Label("Fecha nacimiento:");
        lbl5.setLayoutX(10);
        lbl5.setLayoutY(90);
        TextField txf = new TextField();
        txf.setLayoutX(120);
        txf.setLayoutY(10);
        TextField txf2 = new TextField();
        txf2.setLayoutX(120);
        txf2.setLayoutY(30);
        TextField txf3 = new TextField();
        txf3.setLayoutX(120);
        txf3.setLayoutY(50);
        TextField txf4 = new TextField();
        txf4.setLayoutX(120);
        txf4.setLayoutY(70);
        TextField txf5 = new TextField();
        txf5.setLayoutX(120);
        txf5.setLayoutY(90);
        
        Group grupoElementos = new Group();
        grupoElementos.getChildren().add(lbl);
        grupoElementos.getChildren().add(lbl2);
        grupoElementos.getChildren().add(lbl3);
        grupoElementos.getChildren().add(lbl4);
        grupoElementos.getChildren().add(lbl5);
        grupoElementos.getChildren().add(txf);
        grupoElementos.getChildren().add(txf2);
        grupoElementos.getChildren().add(txf3);
        grupoElementos.getChildren().add(txf4);
        grupoElementos.getChildren().add(txf5);
        grupoElementos.getChildren().add(btn);
        grupoElementos.setLayoutX(50);
        grupoElementos.setLayoutY(50);
        
        
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(grupoElementos);
        
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Formulario cálculo edad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
