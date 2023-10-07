package com.example.putos;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Controller {
    public Button bJugar;
    public Button bAjustes;
    public Text tPregunta;
    public TextField rA;
    public TextField rB;
    public TextField rC;
    public TextField rD;
    public Circle p1;
    public Circle p2;
    public Circle p3;
    public Circle p4;
    public Circle p5;
    public Circle p6;
    public Circle p7;
    public Circle p8;
    public Text pt1;
    public Text pt4;
    public Text pt3;
    public Text pt2;
    public Text pt6;
    public Text pt5;
    public Text pt7;
    public Text pt8;
    public int su=1;
    public Quest si=new Quest(su);
    public AjustesController paneo;
    public Button btLlamada;
    public Button btComodinMitad;

    public void Comenzar(ActionEvent actionEvent) {
        rA.setDisable(false);
        rB.setDisable(false);
        rC.setDisable(false);
        rD.setDisable(false);
        si=new Quest(su);
        p1.setStyle("-fx-fill: white");
        pt1.setStyle("-fx-fill: #7f40bd");
        p2.setStyle("-fx-fill: white");
        pt2.setStyle("-fx-fill: #7f40bd");
        p3.setStyle("-fx-fill: white");
        pt3.setStyle("-fx-fill: #7f40bd");
        p4.setStyle("-fx-fill: white");
        pt4.setStyle("-fx-fill: #7f40bd");
        p5.setStyle("-fx-fill: white");
        pt5.setStyle("-fx-fill: #7f40bd");
        p6.setStyle("-fx-fill: white");
        pt6.setStyle("-fx-fill: #7f40bd");
        p7.setStyle("-fx-fill: white");
        pt7.setStyle("-fx-fill: #7f40bd");
        p8.setStyle("-fx-fill: white");
        pt8.setStyle("-fx-fill: #7f40bd");
        SiguienteP();
    }

    public void Ajustes(ActionEvent actionEvent) throws IOException {
        FXMLLoader iniAjustes = new FXMLLoader(HelloApplication.class.getResource("AjustesVosta.fxml"));
        Parent root=iniAjustes.load();
        AjustesController pene=iniAjustes.getController();
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Ajustes");
        stage.showAndWait();
        su=pene.getOe();
    }

    public void DevolverRespuesta(MouseEvent mouseEvent) {
        TextField a=(TextField) mouseEvent.getSource();
        boolean acierto=si.ComprobarAcierto(a.getText());
        if(acierto) {
            ColorearVerde();
        }else if(!acierto){
            ColorearRojo();
        }
        if(si.getNumErrores()>1||si.getContPreguntas()>si.getNumPreguntas()){
            rA.setDisable(true);
            rB.setDisable(true);
            rC.setDisable(true);
            rD.setDisable(true);
            tPregunta.setText("");
            rA.setText("");
            rB.setText("");
            rC.setText("");
            rD.setText("");
        }else
            SiguienteP();
    }
    public void SiguienteP(){
        tPregunta.setText(si.DevolverPregunta());
        ArrayList<String> puede=new ArrayList<>();
        for (int i = 0; i < si.DevolverRespuestas().length; i++) {
            puede.add(si.DevolverRespuestas()[i]);
        }
        Collections.shuffle(puede);
        rA.setText(puede.get(0));
        rB.setText(puede.get(1));
        rC.setText(puede.get(2));
        rD.setText(puede.get(3));
    }
    public void ColorearVerde(){
        if(si.getContPreguntas()==1){
            p1.setStyle("-fx-fill: green");
            pt1.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==2){
            p2.setStyle("-fx-fill: green");
            pt2.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==3){
            p3.setStyle("-fx-fill: green");
            pt3.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==4){
            p4.setStyle("-fx-fill: green");
            pt4.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==5){
            p5.setStyle("-fx-fill: green");
            pt5.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==6){
            p6.setStyle("-fx-fill: green");
            pt6.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==7){
            p7.setStyle("-fx-fill: green");
            pt7.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==8){
            p8.setStyle("-fx-fill: green");
            pt8.setStyle("-fx-fill: white");
        }
    }
    public void ColorearRojo(){
        if(si.getContPreguntas()==1){
            p1.setStyle("-fx-fill: red");
            pt1.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==2){
            p2.setStyle("-fx-fill: red");
            pt2.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==3){
            p3.setStyle("-fx-fill: red");
            pt3.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==4){
            p4.setStyle("-fx-fill: red");
            pt4.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==5){
            p5.setStyle("-fx-fill: red");
            pt5.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==6){
            p6.setStyle("-fx-fill: red");
            pt6.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==7){
            p7.setStyle("-fx-fill: red");
            pt7.setStyle("-fx-fill: white");
        }else if(si.getContPreguntas()==8){
            p8.setStyle("-fx-fill: red");
            pt8.setStyle("-fx-fill: white");
        }
    }

    public void ComodinLlamada(ActionEvent actionEvent) throws IOException {
        FXMLLoader iniLlamada = new FXMLLoader(HelloApplication.class.getResource("ComodinLlamada.fxml"));
        Parent root=iniLlamada.load();
        ComodinLlamadaController pene=iniLlamada.getController();
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Comodin de la llamada");
        stage.show();
    }

    public void ComodinMitad(ActionEvent actionEvent) {
    }
}
