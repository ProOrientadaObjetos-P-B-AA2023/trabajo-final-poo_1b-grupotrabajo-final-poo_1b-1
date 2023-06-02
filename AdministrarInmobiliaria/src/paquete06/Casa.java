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

    private Propietario propietario;
    private int numeroCuartos;
    private Barrio barrio;
    private Ciudad ciudad;
    private Constructora constructora;

    public Casa(Propietario propietario, int numeroCuartos, Barrio barrio, Ciudad ciudad, Constructora constructora) {
        this.propietario = propietario;
        this.numeroCuartos = numeroCuartos;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.constructora = constructora;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Constructora getConstructora() {
        return constructora;
    }

    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    @Override
    public String toString() {
        return String.format("Propietario: %s"
                + "\nNumero de cuartos: %s"
                + "\nBarrio: %s"
                + "\nCiudad: %s"
                + "\nConstructora: %s",
                this.propietario,
                this.numeroCuartos,
                this.barrio,
                this.ciudad,
                this.constructora);
    }

}
