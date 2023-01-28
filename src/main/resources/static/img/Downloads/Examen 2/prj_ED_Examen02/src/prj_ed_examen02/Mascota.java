package prj_ed_examen02;

public class Mascota {

    /* ------------------ Atributos ------------------ */
    private int id;
    private String Nombre;
    private String Tipo;
    private String estadoAdopción;
    private String nuevoDueño;
    private String fechaAdopcion;
    private int Edad;

    /* ------------------ Constructor ------------------ */
    public Mascota(int id, String Nombre, String Tipo, int Edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Edad = Edad;
        this.estadoAdopción = "Adopcion";
    }

    /* ------------------ Getters & Setters ------------------ */
    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public String getEstadoAdopción() {
        return estadoAdopción;
    }

    public void setEstadoAdopción(String estadoAdopción) {
        this.estadoAdopción = estadoAdopción;
    }

    public String getNuevoDueño() {
        return nuevoDueño;
    }

    public void setNuevoDueño(String nuevoDueño) {
        this.nuevoDueño = nuevoDueño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "id = " + id + ", Nombre = " + Nombre + ", Tipo = " + Tipo + ", Estado Adopcion = " + estadoAdopción + ", Edad = " + Edad + "\n";
    }

}
