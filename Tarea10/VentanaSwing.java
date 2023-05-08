/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea10;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gateway
 */
public class VentanaSwing extends JFrame {
    
    private JLabel etiqueta1;
    private JTextField txtGrados;
    private JButton boton;
    private JLabel lblResultado;
    private FlowLayout layout;
    
    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);
        etiqueta1 = new JLabel("Grados C.");
        this.getContentPane().add(etiqueta1);
        txtGrados = new JTextField(10);
        this.getContentPane().add(txtGrados);
        boton = new JButton("Convertir");
        this.getContentPane().add(boton);
        lblResultado = new JLabel("0.0F");
        this.getContentPane().add(lblResultado);
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtGrados.getText());
                double farenheid = (centigrados*9.0 / 5.0 )+ 32.0;
                lblResultado.setText(farenheid + " F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adioss..");
                System.exit(0);
            }
            
        });
        this.setVisible(true);
    }
    
}
