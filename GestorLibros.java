package biblioteca;

import java.util.HashMap;

/**
 * Clase gestiona los libros de la biblioteca
 *
 * @author alexis
 */
public class GestorLibros {

    private HashMap<String, Libro> libros = null;

    /**
     * Inicializa el gestor de libros
     */
    public GestorLibros() {
        this.libros = new HashMap<>();
    }

    /**
     * Añade un libro a la biblioteca
     *
     * @param clave clave del libro
     * @param libro Libro a añadir
     * @return mensaje de exito
     */
    public String add(String clave, Libro libro) {
        this.libros.put(clave, libro);
        return "Libro agragado exitosamente";
    }

    /**
     * Elimina un libro de la biblioteca
     *
     * @param clave clave del libro a eliminar
     * @return mensaje de exito o error
     */
    public String remove(String clave) {
        if (!this.libros.containsKey(clave)) {
            return "No existe este libro en la biblioteca";
        }
        this.libros.remove(clave);
        return "Libro removido exitosamente";
    }

    /**
     * Lista los libros de la biblioteca
     */
    public void list() {
        libros.forEach((cod, libro) -> System.out.println(libro));
    }

}
