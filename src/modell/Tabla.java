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
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            if (T[x][y] == UresCella) {
                T[x][y] = 'K';
            } else {
                i--;
            }
        }
    }

    public boolean UresOszlop(int oszlop) {
        for (int i = 0; i < 8; i++) {
            if (T[i][oszlop] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean UresSor(int sor) {
        for (int i = 0; i < 8; i++) {
            if (T[sor][i] == 'K') {
                return false;
            }
        }
        return true;
    }

    public int getUresOszlopokSzama() {
        int db = 8;
        for (int i = 0; i < 8; i++) {
            if (UresOszlop(i)) {
                db--;
            }
        }
        return db;
    }

    public int getUresSorokSzama() {
        int db = 8;
        for (int i = 0; i < 8; i++) {
            if (UresSor(i)) {
                db--;
            }
        }
        return db;
    }

    public void megjelenitOsz() {
        System.out.println("Üres oszlopok száma: "+getUresOszlopokSzama());
    }

    public void megjelenitSor() {
        System.out.println("Üres sorok száma: "+getUresSorokSzama());
    }
}
