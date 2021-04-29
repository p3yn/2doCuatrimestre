import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Form11 extends JFrame implements ActionListener{
    
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JComboBox caja1, caja2, caja3;
    private JButton boton1;

    public Form11(){
        setLayout(null);
        etiqueta1 = new JLabel("Rojo");
        etiqueta1.setBounds(10,10,100,20);
        add(etiqueta1);

        caja1 = new JComboBox();
        caja1.setBounds(120,10,100,30);
        for(int i=0; i<=255; i++){
            caja1.addItem(String.valueOf(i));
        }
        add(caja1);

        etiqueta2 = new JLabel("Verde");
        etiqueta2.setBounds(10,50,100,20);
        add(etiqueta2);

        caja2 = new JComboBox();
        caja2.setBounds(120,50,100,30);
        for(int i=0; i<=255; i++){
            caja2.addItem(String.valueOf(i));
        }
        add(caja2);
        
        etiqueta3 = new JLabel("Azul");
        etiqueta3.setBounds(10,90,100,20);
        add(etiqueta3);

        caja3 = new JComboBox();
        caja3.setBounds(120,90,100,30);
        for(int i=0; i<=255; i++){
            caja3.addItem(String.valueOf(i));
        }
        add(caja3);

        boton1 = new JButton("Fijar color");
        boton1.setBounds(10,130,100,30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            String cad1 = caja1.getSelectedItem().toString();
            String cad2 = caja2.getSelectedItem().toString();
            String cad3 = caja3.getSelectedItem().toString();

            int rojo = Integer.parseInt(cad1);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);

            Color mix = new Color(rojo, verde, azul);
            boton1.setBackground(mix);
            boton1.setBorderPainted(false);
            boton1.setOpaque(true);

        }
    }

    public static void main(String[] args) {
        Form11 form1 = new Form11();
        form1.setBounds(0,0, 250, 220);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setLocationRelativeTo(null);
    }

}
