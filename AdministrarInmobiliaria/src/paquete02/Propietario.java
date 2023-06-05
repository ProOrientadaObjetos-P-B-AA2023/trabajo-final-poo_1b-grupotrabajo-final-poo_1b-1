package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Propietario {

    private String nombres;
    private String apellidos;
    private String identificacion;
    private ArrayList barrio;

    public Propietario(String nombres, String apellidos, String identificacion, ArrayList barrio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.barrio = barrio;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setBarrio(ArrayList barrio) {
        this.barrio = barrio;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public ArrayList getBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        return String.format("Nombres: %s"
                + "\nApellidos: %s"
                + "\nIdentificacion: %s"
                + "\nBarrio: %s",
                this.nombres,
                this.apellidos,
                this.identificacion,
                this.barrio);
    }

}
