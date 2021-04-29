import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{

    private JMenuBar menu;
    private JMenu menu1;
    private JMenuItem componente1, componente2, componente3;

    public Menu(){
        setLayout(null);
        menu = new JMenuBar();
        setJMenuBar(menu);

        menu1 = new JMenu("Opciones");
        menu.add(menu1);

        componente1 = new JMenuItem("Rojo");
        componente1.addActionListener(this);
        menu1.add(componente1);

        componente2 = new JMenuItem("Verde");
        componente2.addActionListener(this);
        menu1.add(componente2);

        componente3 = new JMenuItem("Azul");
        componente3.addActionListener(this);
        menu1.add(componente3);
    }

    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();
        
        if(e.getSource()==componente1){
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource()==componente2){
            fondo.setBackground(new Color(0,255,0));            
        }
        if(e.getSource()==componente3){
            fondo.setBackground(new Color(0,0,255));            
        }
    }
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        menu1.setBounds(0,0,400,300);
        menu1.setVisible(true);
        menu1.setLocationRelativeTo(null);
        
    }    
    
}
