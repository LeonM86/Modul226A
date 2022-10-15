package ch.csbe.modul226A;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Calc {
    static int operand1;
    static int operand2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Willkommen beim Calculator.");
        gofurther();
    }

    private static void explanation() {
        System.out.println();
        System.out.println("Bitte waehlen Sie die gewuenschte Funktion:");
        System.out.println("0: Fuehrt einen Maintest durch.");
        System.out.println("1: Addition Operand1 und Operand2");
        System.out.println("2: Subtraktion Operand1 und Operand2");
        System.out.println("3: Multiplikation Operand1 und Operand2");
        System.out.println("4: Division Operand1 und Operand2");
        System.out.println("5: Modulo Berechnung Operand 1 und Operand 2");
        System.out.println("9: Beendet das Programm.");
    }

    private static void userInput() {
        System.out.println();
        System.out.println("Bitte geben Sie einen Ganzzahlen Wert fuer Operand 1 ein: ");
        operand1 = parseInt(scanner.nextLine());

        System.out.println("Bitte geben Sie einen Ganzzahlen Wert fuer Operand 2 ein: ");
        operand2 = parseInt(scanner.nextLine());
        System.out.println("Ihre Eingaben: Operand1 = " + operand1 + ". Operand 2 = " + operand2 + ".");
    }

    static void gofurther() {
        userInput();
        explanation();
        calc();
    }

    static void calc() {
        int operator;
        Scanner opInput = new Scanner(System.in);
        operator = opInput.nextInt();

        switch (operator) {
            case 1:
                int reslutat = add();
                System.out.println("Ergebnis= " + reslutat);
                gofurther();

            case 2:
                reslutat = subtract();
                System.out.println("Ergebnis= " + reslutat);
                gofurther();

            case 3:
                reslutat = multiply();
                System.out.println("Ergebnis= " + reslutat);
                gofurther();

            case 4:
                reslutat = divide();
                System.out.println("Ergebnis= " + reslutat);
                gofurther();

            case 5:
                reslutat = modulo();
                System.out.println("Ergebnis= " + reslutat);
                gofurther();

            case 0:
                maintest();
                gofurther();

            case 9:
                System.exit(0);

            default:
                System.err.println("Sie haben einen ungueltigen Wert eingegeben, bitte waehlen Sie eine Zahl zwischen 0 und 5 oder 9:");
                calc();
        }

    }

    static int add() {
        int r = operand1 + operand2;
        return r;
    }

    static int subtract() {
        int r = operand1 - operand2;
        return r;
    }

    static int multiply() {
        int r = operand1 * operand2;
        return r;
    }

    static int divide() {
        int r = operand1 / operand2;
        return r;
    }

    static int modulo() {
        int r = operand1 % operand2;
        return r;
    }


    static void maintest() {
        addTest();
        subTest();
        multiplyTest();
        divideTest();
        moduloTest();
        gofurther();
    }

    static void addTest() {
        System.out.println("Test Additionen:");
        for (operand1 = 4; operand1 <=8; operand1+=2) {
            for (operand2 =9; operand2 <=47; operand2+=13) {
                int rA = add();
                System.out.println("Berechnung von: " + operand1 + " + " + operand2 + " = " + rA + "\t");
            }
            System.out.println();
        }
    }

    static void subTest() {
        System.out.println("Test Substraktionen:");
        for (operand1 = 40; operand1 <=42; operand1++) {
            for (operand2 =16; operand2 <=32; operand2+=7) {
                int rS = subtract();
                System.out.println("Berechnung von: " + operand1 + " - " + operand2 + " = " +  rS + "\t");
            }
            System.out.println();
        }
    }

    static void multiplyTest() {
        System.out.println("Test Multiplikationen:");
        for (operand1 = 13; operand1 <=21; operand1+=4) {
            for (operand2 =7; operand2 <=21; operand2+=5) {
                int rM = multiply();
                System.out.println("Berechnung von: " + operand1 + " * " + operand2 + " = " +  rM + "\t");
            }
            System.out.println();
        }
    }

    static void divideTest() {
        System.out.println("Test Divisionen:");
        for (operand1 = 83; operand1 <=85; operand1++) {
            for (operand2 =20; operand2 <70; operand2+=17) {
                int rD = divide();
                System.out.println("Berechnung von: " + operand1 + " / " + operand2 + " = " +  rD + "\t");
            }
            System.out.println();
        }
    }

    static void moduloTest() {
        System.out.println("Test Modulo:");
        for (operand1 = 64; operand1 <=78; operand1+=6) {
            for (operand2 =7; operand2 <=30; operand2+=8) {
                int rMod = modulo();
                System.out.println("Berechnung von: " + operand1 + " % " + operand2 + " = " +  rMod + "\t");
            }
            System.out.println();
        }
    }

}

