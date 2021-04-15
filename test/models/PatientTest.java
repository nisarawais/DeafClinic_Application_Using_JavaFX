package models;

import models.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


class PatientTest {
    Patient patient1;
    @BeforeEach
    void setUp() {patient1 = new Patient("Asar","Venus","567 Finch Ave W","Sacramanto","California",45832,"severe","severe-profound", LocalDate.of(1985, 6,29));}

    @Test
    void setFirstName() {
        patient1.setFirstName("Awais");
        assertEquals("Awais", patient1.getFirstName());
    }

    @Test
    void setLastName(){
        patient1.setLastName(("Nisar"));
        assertEquals("Nisar", patient1.getLastName());
    }

    @Test
    void setStreetAddress() {
        patient1.setStreetAddress("8 York Street");
        assertEquals("8 York Street",patient1.getStreetAddress());
    }
}