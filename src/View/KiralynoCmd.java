package View;

import modell.Tabla;

public class KiralynoCmd {

    private Tabla model;

    public KiralynoCmd() {
        char uresCella = '-';
        model = new Tabla(uresCella);
        model.Elhelyez(8);
    }

    public void megjelenitSakkTabla() {
         model.Megjelenit();
    }

    public void megjelenitUresOszlopokSzama() {

    }

    public void megjelenitUresSorokSzama() {

    }
}
