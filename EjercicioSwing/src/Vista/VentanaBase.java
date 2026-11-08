
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author UCF20405
 */
public class VentanaBase extends JFrame implements ActionListener{
    private JLabel mensaje;
    private JTextField caja;
    private JButton ver;

    public VentanaBase() {
        inicializarControles();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra el programa
        setSize(400,500); //Define el ancho y largo
        setLocationRelativeTo(null); //Coloca la ventana en el centro
        setLayout(null); //Desactiva el diseño automático
        setResizable(true); //Permite cambiar el tamaño
        setVisible(true); //Muestra la ventana
        setTitle("Ventana base"); //Coloca el título superior
            this.getContentPane().setBackground(new java.awt.Color(255, 182, 193));
    }
    
    public void inicializarControles(){
        mensaje = new JLabel();
        mensaje.setBounds(110, 50, 180, 25);
        mensaje.setText("MENSAJE");//Texro
        add(mensaje);//Agregar
        
        caja=new JTextField();
        caja.setBounds(110, 70, 180, 25);
        caja.setText("");
        add(caja);
        
        ver=new JButton();
        ver.setBounds(110, 100, 180, 25);
        ver.setText("VER");
        ver.addActionListener(this);
        add(ver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ver));
        caja.setText("Hola Anderson");
    }
}
