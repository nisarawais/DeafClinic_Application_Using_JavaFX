package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.HearingDevices;
import models.Patient;
import utilities.DBUtility;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardViewController implements Initializable {

    @FXML
    private ListView<Patient> patientListView;

    @FXML
    private ListView<HearingDevices> hearingDeviceListView;

    @FXML
    private Label patientsLabel;

    @FXML
    private Label hearingDevicesLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        patientListView.getItems().addAll(DBUtility.getPatientsFromDB());
        hearingDeviceListView.getItems().addAll(DBUtility.getHearingDevicesFromDB());
        patientsLabel.setText("Patients: " + patientListView.getItems().size());
        hearingDevicesLabel.setText("Hearing Devices: " + hearingDeviceListView.getItems().size());
    }

    @FXML
    private void addNewPatientButtonPushed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/CreatePatientView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Deaf Clinic");
        stage.show();
    }

    @FXML
    private void addNewHearingDeviceButtonPushed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/CreateHearingDeviceView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Deaf Clinic");
        stage.show();
    }
}
