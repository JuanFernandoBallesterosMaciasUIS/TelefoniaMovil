package modelo;

public class PlanTelefonia {

    //----------------------
    // Atributos
    //----------------------

    private int numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private double valorMinuto;
    private double costoPlan;

    //----------------------
    // Metodos
    //----------------------

    public PlanTelefonia() {
        numeroCelular = 0;
        operador = "";
        cantidadMinutos = 0;
        valorMinuto = 0;
        costoPlan = 0;
    }

    public PlanTelefonia(int numCel, String op, int cantMin, double valMin) {
        numeroCelular = numCel;
        operador = op;
        cantidadMinutos = cantMin;
        valorMinuto = valMin;
        costoPlan = 0;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String op) {
        operador = op;
    }

    public int getCantidadMinutos() {
        return cantidadMinutos;
    }

    public void setCantidadMinutos(int cantMin) {
        cantidadMinutos = cantMin;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valMin) {
        valorMinuto = valMin;
    }

    public double getCostoPlan() {
        return costoPlan;
    }

    public void setCostoPlan(double costPlan) {
        costoPlan = costPlan;
    }

    // Calcular costo del plan ademas si se elegio Wom se le aplica un descuento del 50%
    public double calcularCostoPlan() {
        if (operador.equals("Wom")) {
            costoPlan = (cantidadMinutos * valorMinuto) * 0.5;
        } else {
            costoPlan = cantidadMinutos * valorMinuto;
        }
        return costoPlan;
    }

    
}
