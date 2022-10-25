package ch.csbe.modul226A;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Double.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestKonto {
    private Kunde mei = new Kunde("Herr","Rolf", "Meier", 10);

    private Konto one = new Konto(0.01, mei);

    @DisplayName("Test auf 0")
    @Test
    void Null() {
        assertEquals(0, one.einzahlen(0));

        assertEquals(0, one.verzinsen(365));
    }

//_________________________________________________________________________________________

    @DisplayName("Testen Grenzwerte")
    @Test
    void Grenzwerte() {
        assertEquals(50000, one.einzahlen(50000));

        assertEquals(500, one.verzinsen(365));

        //----------------------------------------------------//
        one.setSaldo(0);
        assertEquals(50001, one.einzahlen(50001));

        assertEquals(250.005, one.verzinsen(365));

        //----------------------------------------------------//
        one.setSaldo(0);
        assertEquals(49999, one.einzahlen(49999));

        assertEquals(499.99 , one.verzinsen(365));
        //----------------------------------------------------//
        one.setSaldo(0);
        assertEquals(499999, one.einzahlen(499999));

        assertEquals(2499.995 , one.verzinsen(365));
        //----------------------------------------------------//
        one.setSaldo(0);
        assertEquals(500000, one.einzahlen(500000));

        assertEquals(0 , one.verzinsen(365));
        //----------------------------------------------------//
        one.setSaldo(0);
        assertEquals(500001, one.einzahlen(500001));

        assertEquals(0 , one.verzinsen(365));
    }

    void Maximal() {
        one.setSaldo(0);
        one.einzahlen(MAX_VALUE);
        assertEquals(0, one.verzinsen(365));
    }
}

