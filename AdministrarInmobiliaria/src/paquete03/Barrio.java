package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {

    private String nombreBarrio;
    private String referencia;

    public Barrio(String nombreBarrio, String referencia) {
        this.nombreBarrio = nombreBarrio;
        this.referencia = referencia;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return String.format("Nombre del Barrio: $s"
                + "\nReferencia: %s",
                this.nombreBarrio,
                this.referencia);
    }

}
