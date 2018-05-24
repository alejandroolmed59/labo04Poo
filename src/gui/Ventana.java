/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Aritmetico.Aritmetico;
import Conversor.conversor;

/**
 *
 * @author uca
 */
public class Ventana extends JFrame {

    private JTextField caja1, caja2;
    private JButton boton, boton2, boton3, boton4, boton5;

    public Ventana(){
        super("Operaciones");
        initComponent();
    }

    public void initComponent(){
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 = new JTextField("");
        caja1.setBounds(50, 50, 120, 50);

        caja2 = new JTextField("");
        caja2.setBounds(200, 50, 120, 50);

        boton = new JButton("Suma");
        boton.setBounds(50, 200, 120, 50);

        boton2 = new JButton("Resta");
        boton2.setBounds(50, 250, 120, 50);

        boton3 = new JButton("Multiplicacion");
        boton3.setBounds(50, 300, 120, 50);

        boton4 = new JButton("Division");
        boton4.setBounds(50, 350, 120, 50);

        boton5 = new JButton("Binario");
        boton5.setBounds(200, 200, 120, 50);

        Container contenedor = getContentPane();

        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(boton);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico suma = factory.getAritmetico("suma");
                int resultado = suma.operar(a,b);
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        boton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico resta = factory.getAritmetico("resta");
                int resultado = resta.operar(a, b);
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        boton3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico A = factory.getAritmetico("multiplicacion");
                int resultado = A.operar(a, b);
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        boton4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(caja1.getText());
                int b = Integer.parseInt(caja2.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("aritmetico");
                Aritmetico A = factory.getAritmetico("division");
                int resultado = A.operar(a, b);
                JOptionPane.showMessageDialog(null, resultado);
            }
        });
        boton5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(caja1.getText());
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("conversor");
                conversor c = factory.getConversor("binario");
                int resultado = c.operar(a);
                JOptionPane.showMessageDialog(null, resultado);
            }
        });

    }



public static void main(String[] args){
     java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
        public void run() {
             new Ventana().setVisible(true);
         }
     });
    }
}
