package prometheus.com.listpersonalizado;

/**
 * Created by Prometheus on 10/04/2017.
 */
// Clase Iglesia
public class ItemIglesia
{
    private String Nombre;
    private String Descripcion;
    private String Direccion;
    private int imagen;

    public ItemIglesia(String nombre, String descripcion, String direccion, int imagen) {
        Nombre = nombre;
        Descripcion = descripcion;
        Direccion = direccion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
