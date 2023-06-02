package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {

    private String nombres;
    private String apellidos;
    private String identificacion;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double cuotaMensual;
    private double costoFinal;

    public Propietario(String nombres, String apellidos, String identificacion, double precioMetroCuadrado, double numeroMetrosCuadrados, double cuotaMensual, double costoFinal) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
        this.cuotaMensual = cuotaMensual;
        this.costoFinal = costoFinal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    @Override
    public String toString() {
        return String.format("Nombres: %s"
                + "\nApellidos: %s"
                + "\nIdentificacion: %s"
                + "\nPrecio por metro Cuadrado: %.2f"
                + "\nNumero de metros Cuadrados: %.2f"
                + "\nCuota Mensual: %.2f"
                + "\nCosto Final: %.2f",
                this.nombres,
                this.apellidos,
                this.identificacion,
                this.precioMetroCuadrado,
                this.numeroMetrosCuadrados,
                this.cuotaMensual,
                this.costoFinal);
    }

}
