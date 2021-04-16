package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreatePatientViewController {

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

}