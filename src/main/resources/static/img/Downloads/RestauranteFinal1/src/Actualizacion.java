import java.io.Serializable;
public class Actualizacion implements Serializable{
 String nombre;
 String descripcion;
 int version;
 boolean importante;

    public Actualizacion(String nombre, String descripcion, int version, boolean importante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.version = version;
        this.importante = importante;
    }
}
