package controlador;

import modelo.PlanTelefonia;


import vista.VentanaPrincipal;
import vista.PanelEntradaDatos;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private PanelEntradaDatos panEntradaDatos;
    private PlanTelefonia miPlanTelefonia;


    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PanelEntradaDatos pPanEntradaDatos) {
        this.venPrin = pVenPrin;
        this.panEntradaDatos = pPanEntradaDatos; 
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();
        
        // Calcular costo plan
        if(comando.equals("calcular"))
        {
            int numCel = Integer.parseInt(panEntradaDatos.getTxtNumeroCelular());
            String op = panEntradaDatos.getTxtOperador();
            int cantMin = Integer.parseInt(panEntradaDatos.getTxtCantidadMinutos());
            double valMin = Double.parseDouble(panEntradaDatos.getTxtValorMinuto());


            PlanTelefonia miPlanTelefonia = new PlanTelefonia(numCel, op, cantMin, valMin);

            double costoPlan = miPlanTelefonia.calcularCostoPlan();
            miPlanTelefonia.setCostoPlan(costoPlan);
            // Se muestra en el textfield el costo del plan
            panEntradaDatos.setTxtCostoPlan(String.valueOf(costoPlan));
        }

        // Eleminar text fields
        if(comando.equals("eliminar"))
        {
            panEntradaDatos.limpiar();
        }


        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
