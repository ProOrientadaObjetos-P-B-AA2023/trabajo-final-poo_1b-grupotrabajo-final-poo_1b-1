package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {

    private String nombreCiudad;
    private String nombreProvincia;

    public Ciudad(String nombreCiudad, String nombreProvincia) {
        this.nombreCiudad = nombreCiudad;
        this.nombreProvincia = nombreProvincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public String toString() {
        return String.format("Nombre de la ciudad: %s"
                + "\nNombre de la provincia: %s",
                this.nombreCiudad,
                this.nombreProvincia);
    }

}
