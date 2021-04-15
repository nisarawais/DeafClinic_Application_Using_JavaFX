package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HearingDevicesTest {

    HearingDevices ha1;

    @BeforeEach
    void setUp() {ha1 = new HearingDevices("Hearing Aid","Phonak","Naida","Paradise","U","severe-profound");}

    @Test
    void setType() {
        ha1.setType("Hearing Aid");
        assertEquals("HEARING AID", ha1.getType());
    }

    @Test
    void setCompany() {
        ha1.setCompany("Oticon");
        assertEquals("Oticon", ha1.getCompany());
    }

    @Test
    void setModel() {
        ha1.setModel("Opn");
        assertEquals("Opn",ha1.getModel());
    }
}