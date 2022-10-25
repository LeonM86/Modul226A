package ch.csbe.modul226A;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestKonto {
    private Konto one = new Konto(1.5, "Mayer");
    private Konto two = new Konto(1, "Schuerch");
    private Konto three = new Konto(3.7, "Meier");

    private Kunde mei = new Kunde("Herr","Rolf", "Meier", 10, "Meier");
    private Kunde may = new Kunde("Frau","Eva", "Mayer", 12, "Mayer");
    private Kunde sch = new Kunde("Frau","Helga", "Schuerch", 13, "Schuerch");


    @DisplayName("Einzahlung Konto one - Mayer")
    @Test
    void einzahlen() {
        assertEquals(720.50, one.einzahlen(720.50));
    }


    @DisplayName("Verzinsen Konto one - Mayer")
    @Test
    void verzinsen() {
        one.setSaldo(720.50);
        assertEquals(2220.719178082192, one.verzinsen(750));
    }

//_________________________________________________________________________________________

    @DisplayName("Einzahlung Konto two - Schuerch")
    @Test
    void einzahlenTwo() {
        assertEquals(1250037.35, two.einzahlen(1250037.35));
    }


    @DisplayName("Verzinsen Konto two")
    @Test
    void verzinsenTwo() {
        two.setSaldo(1250037.35);
        assertEquals(0, two.verzinsen(180));
    }


    //_________________________________________________________________________________

    @DisplayName("Einzahlung Konto three - Meier")
    @Test
    void einzahlenThree() {
        assertEquals(500.75, three.einzahlen(500.75));
    }


    @DisplayName("Verzinsen Konto three - Meier")
    @Test
    void verzinsenThree() {
        three.setSaldo(500.75);
        assertEquals(1852.775, three.verzinsen(365));
        System.out.println("Konto three Ihr neuer Saldo: " + three.getSaldo());
    }

    void einzahlenThreeA() {
        assertEquals(2766.675, three.einzahlen(413.15));
    }


    @DisplayName("Verzinsen Konto three - Meier")
    @Test
    void verzinsenThreeA() {
        three.setSaldo(2766.675);
        assertEquals(3365.489589041096, three.verzinsen(120));
        System.out.println("Konto three Ihr neuer Saldo: " + three.getSaldo());
    }

    // Instanzvariablen in Klasse Konto können nicht von hier direkt bearbeitet werden, da sie private gesetzt sind.


}

