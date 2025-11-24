package ooudea.taller2.ej2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmBingo extends JFrame {

    private JPanel panel;
    private JTable tblBingo;
    private JButton btnCantar;
    private JLabel lblNumero;

    private Cantor cantor = new Cantor();
    private Tabla tabla = new Tabla();

    public FrmBingo() {
        setTitle("Bingo");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        tblBingo = new JTable(5, 5);
        btnCantar = new JButton("Cantar número");
        lblNumero = new JLabel("Número: -");

        tabla.mostrar(tblBingo);

        panel.add(new JScrollPane(tblBingo));
        panel.add(btnCantar);
        panel.add(lblNumero);

        add(panel);

        btnCantar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = cantor.cantar();
                cantor.mostrar(lblNumero, n);
                tabla.marcar(n);
                tabla.mostrar(tblBingo);
            }
        });
    }

    public static void main(String[] args) {
        FrmBingo f = new FrmBingo();
        f.setVisible(true);
    }
}
