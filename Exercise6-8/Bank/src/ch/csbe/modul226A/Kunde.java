package ch.csbe.modul226A;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
   private String gender;
   private String firstname;
   private String lastname;
   private int customerNumber;
   private String inhaber;

    public Kunde(String gender, String firstname, String lastname, int customerNumber, String inhaber) {
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.customerNumber = customerNumber;
        this.inhaber = inhaber;
    }

}
