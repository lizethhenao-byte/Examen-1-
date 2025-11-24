package ooudea.taller2.ej1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FrmLanzamientosDados extends JFrame {

    private JPanel panel;
    private JLabel lblDado1;
    private JLabel lblDado2;
    private JButton btnLanzar;
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();
    private Random random = new Random();

    public FrmLanzamientosDados() {
        setTitle("Lanzamiento de Dados");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        lblDado1 = new JLabel();
        lblDado2 = new JLabel();
        btnLanzar = new JButton("Lanzar");

        panel.add(lblDado1);
        panel.add(lblDado2);
        panel.add(btnLanzar);

        add(panel);

        dado1.setNumero(1);
        dado2.setNumero(1);
        dado1.mostrar(lblDado1);
        dado2.mostrar(lblDado2);

        btnLanzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dado1.lanzar(random);
                dado2.lanzar(random);
                dado1.mostrar(lblDado1);
                dado2.mostrar(lblDado2);
            }
        });
    }

    public static void main(String[] args) {
        FrmLanzamientosDados ventana = new FrmLanzamientosDados();
        ventana.setVisible(true);
    }
}
