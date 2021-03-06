package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Patient;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class CreatePatientViewController implements Initializable {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField streetAddressTextField;

    @FXML
    private TextField cityTextField;

    @FXML
    private TextField stateTextField;

    @FXML
    private TextField zipCodeTextField;

    @FXML
    private TextField leftHearingLevelTextField;

    @FXML
    private TextField rightHearingLevelTextField;

    @FXML
    private DatePicker birthday;

    @FXML
    private Label msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msg.setText("");
    }

    @FXML
    private void createNewPatient()
    {
        Patient newPatient;
        try {
            newPatient = new Patient(firstNameTextField.getText(), lastNameTextField.getText(), streetAddressTextField.getText(), cityTextField.getText(), stateTextField.getText(), 10001, leftHearingLevelTextField.getText(), rightHearingLevelTextField.getText(), birthday.getValue());
            msg.setText("New Patient: " + newPatient.toString());
        }
        catch(IllegalArgumentException e){
            msg.setText(e.getMessage());
    }

    }
    @FXML
    private void goBack (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/DashboardView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Deaf Clinic");
        stage.show();
    }
}