
package vista;

import java.util.Scanner;
import modelo.AlumnoModelo;

public class VistaConstancia {

    Scanner teclado = new Scanner(System.in);

    public String pedirMatricula() {
        System.out.print("Escribe la matricula del alumno: ");
        return teclado.nextLine().trim();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarAlumno(int numero, AlumnoModelo alumno) {
        System.out.println(numero + ". " + alumno);
    }

    public int pedirSeleccion() {
        System.out.print("\nEscribe el numero del alumno: ");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String preguntarConstancia() {
        System.out.print(
                "\nDeseas generar la constancia? (si/no): ");
        return teclado.nextLine().trim();
    }

    public void cerrar() {
        teclado.close();
    }
}
