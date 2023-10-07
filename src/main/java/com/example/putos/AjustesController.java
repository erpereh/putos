package com.example.putos;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class AjustesController {

    public RadioButton r2;
    public RadioButton r1;
    public int oe;
    public Button cerrar;



    public void Confirmar(ActionEvent actionEvent) {
        if(r1.isSelected()){
            oe=1;
        }
        else {
            oe = 2;
        }
        Stage puto=(Stage) this.cerrar.getScene().getWindow();
        puto.close();

    }

    public int getOe() {
        return oe;
    }

}

