package biblioteca;

/**
 * Clase que representa un libro
 *
 * @author alexis
 */
public class Libro {

    private String nombre;
    private String autor;
    private String clave;

    /**
     * Inicializa el objeto Libro
     *
     * @param nombre nombre del libro
     * @param autor autor del libro
     * @param fechaPublicacion año de publicacion
     */
    public Libro(String nombre, String autor, String fechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.clave = fechaPublicacion;
    }

    //---- GETTERS ----
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getClave() {
        return clave;
    }

    // ---- SETTERS ----
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", autor: " + this.autor + ", clave: " + this.clave;
    }

}
