package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Departamento {

    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private String nombreEdificio;
    private String ubicacionDepartamentoE;

    public Departamento(double precioMetroCuadrado, double numeroMetrosCuadrados, double valorAlicuotaMensual, String ubicacionDepartamentoE, String nombreEdificio) {
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.nombreEdificio = nombreEdificio;
        this.ubicacionDepartamentoE = ubicacionDepartamentoE;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public void setValorAlicuotaMensual(double valorAlicuotaMensual) {
        this.valorAlicuotaMensual = valorAlicuotaMensual;
    }

    public void calcularCostoFinal() {
        this.costoFinal = (this.numeroMetrosCuadrados * this.precioMetroCuadrado) + (valorAlicuotaMensual * 12);
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public void setUbicacionDepartamentoE(String ubicacionDepartamentoE) {
        this.ubicacionDepartamentoE = ubicacionDepartamentoE;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public double getValorAlicuotaMensual() {
        return valorAlicuotaMensual;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public String getUbicacionDepartamentoE() {
        return ubicacionDepartamentoE;
    }

    @Override
    public String toString() {
        return String.format("Precio por metro cuadrado %.2f"
                + "\nNumero de metros cuadrados: %.2f"
                + "\nValor Mensual: %.2f"
                + "\nCosto Final: %.2f"
                + "\nNombre del Edificio: %s"
                + "\nUbicacion del departamento: %s",
                this.precioMetroCuadrado,
                this.numeroMetrosCuadrados,
                this.valorAlicuotaMensual,
                this.costoFinal,
                this.nombreEdificio,
                this.ubicacionDepartamentoE);
    }

}
