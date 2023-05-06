package vista;

import java.awt.Color;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbNumeroCelular;
    private JLabel lbOperador;
    private JLabel lbCantidadMinutos;
    private JLabel lbValorMinuto;
    private JLabel lbCostoPlan;

    private TextField tfNumeroCelular;
    private TextField tfCantidadMinutos;
    private TextField tfValorMinuto;
    private TextField tfCostoPlan;


    private JComboBox cbOperador;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbTitulo = new JLabel("Plan de Telefonia ", JLabel.RIGHT);
        lbTitulo.setBounds(120,30,120,20);
        this.add(lbTitulo);

        //Crear y agregar etiqueta numero celular
        lbNumeroCelular = new JLabel("Numero Celular ", JLabel.RIGHT);
        lbNumeroCelular.setBounds(30,70,120,20);
        this.add(lbNumeroCelular);

        //Crear y agregar etiqueta operador
        lbOperador = new JLabel("Operador ", JLabel.RIGHT);
        lbOperador.setBounds(30,110,120,20);
        this.add(lbOperador);

        //Crear y agregar etiqueta cantidad minutos
        lbCantidadMinutos = new JLabel("Cantidad Minutos ", JLabel.RIGHT);
        lbCantidadMinutos.setBounds(30,150,120,20);
        this.add(lbCantidadMinutos);

        //Crear y agregar etiqueta valor minuto
        lbValorMinuto = new JLabel("Valor Minuto ", JLabel.RIGHT);
        lbValorMinuto.setBounds(30,190,120,20);
        this.add(lbValorMinuto);

        //Crear y agregar etiqueta costo plan
        lbCostoPlan = new JLabel("Costo Plan ", JLabel.RIGHT);
        lbCostoPlan.setBounds(30,230,120,20);
        this.add(lbCostoPlan);

        //Crear y agregar campo de texto numero celular
        tfNumeroCelular = new TextField();
        tfNumeroCelular.setBounds(160,70,120,20);
        this.add(tfNumeroCelular);

        //Crear y agregar campo de texto operador
        cbOperador = new JComboBox();
        cbOperador.setBounds(160,110,120,20);
        cbOperador.addItem("Claro");
        cbOperador.addItem("Movistar");
        cbOperador.addItem("Tigo");
        cbOperador.addItem("Wom");
        this.add(cbOperador);

        //Crear y agregar campo de texto cantidad minutos
        tfCantidadMinutos = new TextField();
        tfCantidadMinutos.setBounds(160,150,120,20);
        this.add(tfCantidadMinutos);

        //Crear y agregar campo de texto valor minuto
        tfValorMinuto = new TextField();
        tfValorMinuto.setBounds(160,190,120,20);
        this.add(tfValorMinuto);

        //Crear y agregar campo de texto costo plan, estara deshabilitado
        tfCostoPlan = new TextField();
        tfCostoPlan.setBounds(160,230,120,20);
        tfCostoPlan.setEnabled(false);
        this.add(tfCostoPlan);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso

    public String getTxtNumeroCelular()
    {
        return tfNumeroCelular.getText();
    }

    public String getTxtOperador()
    {
        return (String) cbOperador.getSelectedItem();
    }

    public String getTxtCantidadMinutos()
    {
        return tfCantidadMinutos.getText();
    }

    public String getTxtValorMinuto()
    {
        return tfValorMinuto.getText();
    }

    public String getTxtCostoPlan()
    {
        return tfCostoPlan.getText();
    }

    public void setTxtCostoPlan(String costo)
    {
        tfCostoPlan.setText(costo);
    }

    public void setTxtNumeroCelular(String numero)
    {
        tfNumeroCelular.setText(numero);
    }

    public void setTxtCantidadMinutos(String minutos)
    {
        tfCantidadMinutos.setText(minutos);
    }

    public void setTxtValorMinuto(String valor)
    {
        tfValorMinuto.setText(valor);
    }

    public void limpiar()
    {
        tfNumeroCelular.setText("");
        tfCantidadMinutos.setText("");
        tfValorMinuto.setText("");
        tfCostoPlan.setText("");
    }
}
