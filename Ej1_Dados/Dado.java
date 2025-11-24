package ooudea.taller2.ej1;

import javax.swing.*;
import java.util.Random;

public class Dado {
    private int numero = 1;

    public Dado() {}

    public void lanzar(Random r) {
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lblDado) {
        lblDado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/" + numero + ".jpg")));
    }

    public int obtenerNumero() {
        return numero;
    }

    // Utilidad para mostrar cara inicial
    public void setNumero(int n) { this.numero = n; }
}
