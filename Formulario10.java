import javax.swing.*;
import java.awt.event.*;

public class Formulario10 extends JFrame implements ItemListener{
    
    private JComboBox caja1;

    public Formulario10(){
        setLayout(null);
        caja1 = new JComboBox();
        caja1.setBounds(10, 10, 80, 20);
        add(caja1);

        caja1.addItem("rojo");
        caja1.addItem("verde");
        caja1.addItem("azul");
        caja1.addItem("amarillo");
        caja1.addItem("negro");
        caja1.addItemListener(this);
        
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==caja1){
            String seleccion = caja1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    public static void main(String[] args) {
        Formulario10 form1 = new Formulario10();
        form1.setBounds(0,0,200,150);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setLocationRelativeTo(null);
    }
}
