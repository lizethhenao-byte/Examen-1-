package ooudea.taller2.ej2;

import javax.swing.*;
import java.util.Random;

public class Cantor {
    private boolean[] usados = new boolean[75];
    private Random random = new Random();

    public int cantar() {
        int n;
        do {
            n = random.nextInt(75) + 1;
        } while (usados[n - 1]);
        usados[n - 1] = true;
        return n;
    }

    public void mostrar(JLabel lbl, int n) {
        lbl.setText("Número: " + n);
    }
}
