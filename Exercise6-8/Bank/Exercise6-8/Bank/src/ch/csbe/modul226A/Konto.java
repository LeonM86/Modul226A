package ch.csbe.modul226A;

public class Konto {
    private double saldo;
    private double zinssatz;
    private double zins;
    private String inhaber;

    public Konto(double zinssatz, String inhaber) {
        this.zinssatz = zinssatz;
        this.inhaber = inhaber;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double einzahlen(double payIn) {
        saldo = saldo + payIn;
        System.out.println(inhaber + ", der Saldo des Kontos ist: " + getSaldo());
        System.out.println("---------------------------------------------------");
        System.out.println();
        return payIn;
    }

    public double verzinsen(int days) {
        if (saldo <= 50000.00) {
            zins = saldo * getZinssatz() * days / 365;
            System.out.println(inhaber + ", Ihre Zinsen: " + zins);
            saldo = saldo + zins;
            System.out.println(inhaber + ", Ihr neuer Saldo: " + getSaldo());
        } else if (saldo >= 500000.00) {
            System.out.println(inhaber + ", auf Ihr Kapital werden keine Zinsen bezahlt.");
        } else {
            zins = (getZinssatz() / 2) * saldo * days / 365;
            System.out.println(inhaber + ", Ihre Zinsen: " + zins);
            saldo = saldo + zins;
            System.out.println(inhaber + ", Ihr neuer Saldo: " + getSaldo());
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
        return zins;
    }
}
