package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

// Agregar una funcionalidad nueva a la app que permita mostrar la totalidad de ventas hechas por un vendedor, en orden ascendente.  Este reporte debe incluir la información de cada carro vendido junto a a las ganancias que la venta de ese carro representan para el empleado.

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btCalcular;
    private JButton btEleminar;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton Calcular y Guardar
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(10,20,170,20);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        //Crear y agregar boton Eliminar
        btEleminar = new JButton("Eliminar");
        btEleminar.setBounds(190,20,170,20);
        btEleminar.setActionCommand("eliminar");
        this.add(btEleminar);
        

        // Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);


        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Método para agregar oyentes a los botones
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btCalcular.addActionListener(pAL);
        btEleminar.addActionListener(pAL);
        btSalir.addActionListener(pAL);

    }


}
