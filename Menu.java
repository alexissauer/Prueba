package menu;

import biblioteca.ComandoBiblioteca;
import java.util.Scanner;

/**
 * Clase que representa el menu de interaccion con el usuario
 *
 * @author alexis
 */
public class Menu {

    private ComandoBiblioteca comando = null; // Ejecuta los comandos dados por el usuario
    private boolean continuar; // Determina si el programa sigue en ejecucion
    private Scanner input = null; // Lee los datos ingresados por el teclado
    private String comandoIntroducido = null; // Comando introducido por el usuario

    /**
     * Inicializa el menu
     */
    public Menu() {
        comando = new ComandoBiblioteca();
        continuar = true;
        input = new Scanner(System.in);

        do {
            imprimirComandos();
            comandoIntroducido = input.nextLine();
            continuar = ejecutarComando(comandoIntroducido);
            limpiarPantalla();
        } while (continuar);

    }

    /**
     * Muestra los comandos disponibles al usuario
     */
    private void imprimirComandos() {
        String comandos = "Ingrese el comando que quiere ejecutar:\n"
                + "********************************\n"
                + "1) Agregar libro\n"
                + "2) Remover libro\n"
                + "3) Listar libros\n"
                + "4) Salir\n"
                + "********************************\n";
        System.out.println(comandos);
    }

    /**
     * Ejecuta el comando dado por el usuario
     *
     * @param comandoIntroducido comando dado
     * @return boolean
     */
    private boolean ejecutarComando(String comandoIntroducido) {
        switch (comandoIntroducido) {
            case "1":
                comando.accionAgregar();
                presionarEnter();
                break;
            case "2":
                comando.accionRemover();
                presionarEnter();
                break;
            case "3":
                comando.accionListar();
                presionarEnter();
                break;
            case "4":
                System.out.println("Gracias por usar el programa!");
                return false;
        }
        return true;
    }

    /**
     * Solicita al usuario que presione enter para continuar
     */
    private void presionarEnter() {
        System.out.println("Presione enter para continuar...");
        input.nextLine();
    }

    /**
     * Limpia la pantalla de la consola
     */
    private void limpiarPantalla() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
