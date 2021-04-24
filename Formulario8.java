import javax.swing.*;

public class Formulario8 extends JFrame{

    private JTextField textfield1;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;

    public Formulario8(){
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,50,400,300);
        add(scrollpane1);
    }

    public static void main(String[] args) {
        Formulario8 form1 = new Formulario8();
        form1.setBounds(0,0,540,400);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setLocationRelativeTo(null);
    }
    
}
