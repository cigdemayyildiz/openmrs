package data;

import java.util.*;

public class BusinessData {

    public static List<String> getExpectedAppNames(){
        return Arrays.asList("Find Patient Record","Active Visits","Register a patient",
                "Capture Vitals","Appointment Scheduling","Reports","Data Management",
                "Configure Metadata","System Administration");
    }

    public static List<String> getExpectedPatientData(){
        return Arrays.asList("Name: David, Hunt","Gender: Male","Birthdate: 16, March, 1997",
                "Address: 2200 Devon","Phone Number: 2456667788","Relatives: John White - Doctor");
    }
}
