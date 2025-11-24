package ooudea.taller2.ej2;

import javax.swing.*;
import java.util.Random;

public class Tabla {
    private int[][] tabla = new int[5][5];

    public Tabla() {
        generarTabla();
    }

    private void generarTabla() {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            boolean[] usados = new boolean[15];
            for (int j = 0; j < 5; j++) {
                int num;
                do {
                    num = r.nextInt(15) + 1 + i * 15;
                } while (usados[num - 1 - i * 15]);
                usados[num - 1 - i * 15] = true;
                tabla[i][j] = num;
            }
        }
    }

    public void marcar(int n) {
        int col = (n - 1) / 15;

        for (int i = 0; i < 5; i++) {
            if (tabla[col][i] == n) {
                tabla[col][i] = 0;
            }
        }
    }

    public void mostrar(JTable tbl) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                tbl.setValueAt(tabla[i][j], j, i);
    }
}
