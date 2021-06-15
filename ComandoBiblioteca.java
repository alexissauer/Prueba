package biblioteca;

import java.util.Scanner;

/**
 * Clase que Pide al usuario los datos según el comando dado
 *
 * @author alexis
 */
public class ComandoBiblioteca {

    GestorLibros gestor = null;
    private Scanner input = null;

    /**
     * Inicializa la instancia
     */
    public ComandoBiblioteca() {
        input = new Scanner(System.in);
        gestor = new GestorLibros();
    }

    /**
     * Ejecuta el comando Agregar Libro
     */
    public void accionAgregar() {
        String clave = pedirAlUsuario("Ingrese la clave del libro");
        String nombre = pedirAlUsuario("Ingrese el nombre del libro:");
        String autor = pedirAlUsuario("Ingrese el autor del libro:");

        Libro libro = new Libro(nombre, autor, clave);
        System.out.println(gestor.add(clave, libro));
    }

    /**
     * Ejecuta el comando Remover Libro
     */
    public void accionRemover() {
        String clave = pedirAlUsuario("Ingrese la clave del libro");
        System.out.println(gestor.remove(clave));
    }

    /**
     * Ejecuta el comando Listar
     */
    public void accionListar() {
        gestor.list();
    }

    /**
     * Pide al usuario que ingrese un valor por teclado con un mensaje dado
     *
     * @param mensaje mensaje dirigido al usuario
     * @return valor introducido
     */
    private String pedirAlUsuario(String mensaje) {
        System.out.println(mensaje);
        return input.nextLine();
    }

}
