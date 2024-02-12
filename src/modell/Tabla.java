package modell;

import java.util.Random;

public class Tabla {
    private char[][] T;
    private char UresCella;

    public Tabla(char uresCella) {
         this.T = new char[8][8];
        this.UresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }

    public void Megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(this.T[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void Elhelyez(int n) {

    }

    public boolean UresOszlop(int oszlop) {
        
        return true;
    }

    public boolean UresSor(int sor) {

        return true;
    }

    public int getUresOszlopokSzama() {

        return 0;
    }

    public int getUresSorokSzama() {

         return 0;
    }

    public void megjelenitOsz() {

    }

    public void megjelenitSor() {

    }
}
