package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.HearingDevices;
import models.Patient;
import utilities.DBUtility;

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
}
