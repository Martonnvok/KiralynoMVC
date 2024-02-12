package main;

import View.KiralynoCmd;


public class Kiralynok {

    
    public static void main(String[] args) {
        kiir();
       
    }

    private static void kiir() {
        KiralynoCmd megjelenitCmd = new KiralynoCmd();
        megjelenitCmd.megjelenitSakkTabla();
        megjelenitCmd.megjelenitUresOszlopokSzama();
        megjelenitCmd.megjelenitUresSorokSzama();
    }
    
}
