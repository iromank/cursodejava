package formulario;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
public class form extends JFrame {

    public form() {
        this.setExtendedState(form.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        this.setLocation(0, 0);
        this.setSize(1200, 800);
        this.setVisible(true);
        panel mipanel = new panel();
        add(mipanel);
    }

    public static void main(String[] args) {
        form form = new form();

    }

}

class panel extends JPanel  {

    JLabel usuario = new JLabel("usuario");
    JTextField caja1 = new JTextField("INGRESA USUARIO");

    JLabel clave = new JLabel("clave");
    JTextField clave1 = new JTextField("               ");
    JButton boton = new JButton("iniciar secion");

    public panel() {
        this.setBackground(Color.red);
        this.setSize(1000, 1000);
        this.setLocation(20, 20);
        usuario.setVisible(true);
        usuario.setLocation(80, 80);
        usuario.setSize(70, 30);
        add(usuario);
        caja1.setVisible(true);
        caja1.setLocation(100, 100);
        caja1.setSize(70, 30);
        add(caja1);
        clave.setVisible(true);
        clave.setLocation(80, 100);
        clave.setSize(70, 30);
        add(clave);
        clave1.setLocation(200, 200);
        clave1.setSize(70, 30);
          clave1.setVisible(true);
        add(clave1);
      
      
        boton.setLocation(0, 10);
        boton.setSize(70, 30);
          boton.setVisible(true);
        add(boton);
        
        
       
    }                                        
    

}
