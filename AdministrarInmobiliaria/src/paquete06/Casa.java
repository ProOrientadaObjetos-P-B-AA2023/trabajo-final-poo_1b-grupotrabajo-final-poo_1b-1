package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {

    private double precioPorMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double costoFinal;
    private int numeroCuartos;

    public Casa(double precioPorMetroCuadrado, double numeroMetrosCuadrados, int numeroCuartos) {
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
        this.numeroCuartos = numeroCuartos;
    }

    public void setPrecioPorMetroCuadrado(double precioPorMetroCuadrado) {
        this.precioPorMetroCuadrado = precioPorMetroCuadrado;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.numeroMetrosCuadrados * precioPorMetroCuadrado;
    }

    public double getPrecioPorMetroCuadrado() {
        return precioPorMetroCuadrado;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    @Override
    public String toString() {
        return String.format("Precio por metro cuadrado %.2f"
                + "\nNumero de metros cuadrados: %.2f"
                + "\nCosto Final: %.2f"
                + "\nNumero de cuartos: %d",
                this.precioPorMetroCuadrado,
                this.numeroMetrosCuadrados,
                this.costoFinal,
                this.numeroCuartos);
    }

}
