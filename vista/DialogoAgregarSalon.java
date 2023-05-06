package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarSalon extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreSalon;
    private JTextField tfNombreSalon;

    private JLabel lbNumPersonas;
    private JTextField tfNumPersonas;

    private JLabel lbHoras;
    private JTextField tfHoras;
    
    


    private JButton btAgregarSalon;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarSalon()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreSalon = new JLabel("Nombre del salon: ");
        lbNombreSalon.setBounds(10,50,140,20);
        this.add(lbNombreSalon);

        tfNombreSalon = new JTextField();
        tfNombreSalon.setBounds(150,50,100, 25);
        this.add(tfNombreSalon);

        lbNumPersonas = new JLabel("Numero de personas: ");
        lbNumPersonas.setBounds(10,80,140,20);
        this.add(lbNumPersonas);

        tfNumPersonas = new JTextField();
        tfNumPersonas.setBounds(150,80,100, 25);
        this.add(tfNumPersonas);

        lbHoras = new JLabel("Horas: ");
        lbHoras.setBounds(10,110,140,20);
        this.add(lbHoras);

        tfHoras = new JTextField();
        tfHoras.setBounds(150,110,100, 25);
        this.add(tfHoras);
    

        btAgregarSalon = new JButton("Agregar");
        btAgregarSalon.setBounds(100,150,100,25);
        btAgregarSalon.setActionCommand("agregar");
        this.add(btAgregarSalon);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Salon");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombre()
    {
        return tfNombreSalon.getText();
    }

    public String getNumPersonas()
    {
        return tfNumPersonas.getText();
    }

    public String getHoras()
    {
        return tfHoras.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarSalon.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}

