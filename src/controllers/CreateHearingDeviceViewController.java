package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.HearingDevices;
import models.Patient;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateHearingDeviceViewController implements Initializable {

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField companyTextField;

    @FXML
    private TextField modelTextField;

    @FXML
    private TextField versionTextField;

    @FXML
    private TextField powerLevelTextField;

    @FXML
    private TextField hearingLevelCompatibleTextField;

    @FXML
    private Label msg;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        msg.setText("");
    }

    @FXML
    private void createNewHearingDevice()
    {
        HearingDevices newHearingDevice;
        try {
            newHearingDevice = new HearingDevices(typeTextField.getText(), companyTextField.getText(), modelTextField.getText(), versionTextField.getText(),powerLevelTextField.getText(),hearingLevelCompatibleTextField.getText());
            msg.setText("New Hearing Device: " + newHearingDevice.toString());
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