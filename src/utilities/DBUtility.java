package utilities;

import models.HearingDevices;
import models.Patient;

import java.time.LocalDate;
import java.util.ArrayList;

public class DBUtility {
    public static ArrayList<Patient> getPatientsFromDB(){
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Samantha","Georgia","89 Ireland St","Tenisat","Utah",83201,"mild","moderate-profound", LocalDate.of(2011,3,5)));
        patients.add(new Patient("Ramen","Haduka","547 Manhattan Ave W","Rochester","New York",20163,"profound","profound",LocalDate.of(2021,2,13)));
        patients.add(new Patient("Trey","Wilson","32 Ryerson St","Austin","Texas",41935,"moderate-profound","severe",LocalDate.of(2017,12,30)));
        patients.add(new Patient("Tyler","Perry","2974 Queenston Ave SE","Jacksonville","Florida",21060,"severe","profound",LocalDate.of(2016,5,26)));
        patients.add(new Patient("Jupiter","Derulo","5 Ire Street","Boulder","Colorado",80345,"mild","severe-profound",LocalDate.of(2013,8,19)));
        patients.add(new Patient("Rachel","Mendez", "838 Georgia Blvd","Pheonix","Arizona",80410,"moderate","mild-severe",LocalDate.of(2018,7,16)));
        patients.add(new Patient("Alayna","Harper","Sixth Ave SW", "Washington","District Of Columbia",20004,"profound","moderate",LocalDate.of(2015,8,1)));
       return patients;
    }
    public static ArrayList<HearingDevices> getHearingDevicesFromDB(){
        ArrayList<HearingDevices> hearingDevices = new ArrayList<>();
        hearingDevices.add(new HearingDevices("Cochlear Implant","Cochlear","Nucleus","7","NA","severe-profound"));
        hearingDevices.add(new HearingDevices("Hearing Aid","Phonak","Naida","Paradise","U","severe-profound"));
        hearingDevices.add(new HearingDevices("Hearing Aid","Phonak","Audeo","Paradise","P","mild-profound"));
        hearingDevices.add(new HearingDevices("Hearing Aid","Phonak","Sky","Marvel","M","mild-moderate"));
        hearingDevices.add(new HearingDevices("Cochlear Implant","Advanced Bionics","Naida","Marvel","NA","severe-profound"));
        hearingDevices.add(new HearingDevices("Hearing Aid","Oticon","Play","Opn","mild-severe","M"));
        return hearingDevices;
    }
}

