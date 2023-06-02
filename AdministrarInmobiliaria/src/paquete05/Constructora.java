package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {

    private String nombreConstructora;
    private String idEmpresa;

    public Constructora(String nombreConstructora, String idEmpresa) {
        this.nombreConstructora = nombreConstructora;
        this.idEmpresa = idEmpresa;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public String toString() {
        return String.format("Nombre de la constructura: %s"
                + "\nID de la empresa: %s",
                this.nombreConstructora,
                this.idEmpresa);
    }

}
