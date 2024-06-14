package com.example.labo9diegomejia;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private CheckBox matutinoCheckBox;

    @FXML
    private CheckBox vespertinoCheckBox;

    @FXML
    private CheckBox nocturnoCheckBox;

    @FXML
    private CheckBox sanSalvadorCheckBox;

    @FXML
    private CheckBox santaAnaCheckBox;

    @FXML
    private CheckBox sanMiguelCheckBox;

    @FXML
    private TextField turnosTextField;

    @FXML
    private TextField ciudadTextField;

    @FXML
    public void initialize() {
        matutinoCheckBox.setOnAction(e -> updateTurnosTextField());
        vespertinoCheckBox.setOnAction(e -> updateTurnosTextField());
        nocturnoCheckBox.setOnAction(e -> updateTurnosTextField());

        sanSalvadorCheckBox.setOnAction(e -> updateCiudadTextField());
        santaAnaCheckBox.setOnAction(e -> updateCiudadTextField());
        sanMiguelCheckBox.setOnAction(e -> updateCiudadTextField());
    }

    private void updateTurnosTextField() {
        StringBuilder turnos = new StringBuilder();

        if (matutinoCheckBox.isSelected()) {
            turnos.append("Matutino ");
        }
        if (vespertinoCheckBox.isSelected()) {
            turnos.append("Vespertino ");
        }
        if (nocturnoCheckBox.isSelected()) {
            turnos.append("Nocturno ");
        }

        turnosTextField.setText(turnos.toString().trim());
    }

    private void updateCiudadTextField() {
        StringBuilder ciudad = new StringBuilder();

        if (sanSalvadorCheckBox.isSelected()) {
            ciudad.append("San Salvador");
        }
        if (santaAnaCheckBox.isSelected()) {
            if (ciudad.length() > 0) {
                ciudad.append(", ");
            }
            ciudad.append("Santa Ana");
        }
        if (sanMiguelCheckBox.isSelected()) {
            if (ciudad.length() > 0) {
                ciudad.append(", ");
            }
            ciudad.append("San Miguel");
        }

        ciudadTextField.setText(ciudad.toString());
    }
}
