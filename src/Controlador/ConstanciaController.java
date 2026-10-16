
package controlador;

import modelo.AlumnoModelo;
import modelo.ConstanciaModelo;
import vista.VistaConstancia;
import java.util.ArrayList;

public class ConstanciaController {

    public static void main(String[] args) {

        VistaConstancia vista = new VistaConstancia();
        ArrayList<AlumnoModelo> alumnos = new ArrayList<>();
        ConstanciaModelo constancia = new ConstanciaModelo();

        alumnos.add(new AlumnoModelo(
                "267416", "Ivana Peralta", 3, 6, "Inscrita"));

        alumnos.add(new AlumnoModelo(
                "267514", "Victoria Enriquez", 5, 7, "Inscrita"));

        alumnos.add(new AlumnoModelo(
                "278615", "Jose Garcia", 1, 5, "Inscrito"));

        vista.mostrarMensaje(
                "====================================");
        vista.mostrarMensaje(
                " SISTEMA DE CONSTANCIAS ESCOLARES");
        vista.mostrarMensaje(
                "====================================");

        String id = vista.pedirMatricula();
        ArrayList<AlumnoModelo> encontrados = new ArrayList<>();

        for (AlumnoModelo alumno : alumnos) {
            if (!id.isEmpty() && alumno.id.contains(id)) {
                encontrados.add(alumno);
            }
        }

        if (encontrados.isEmpty()) {
            vista.mostrarMensaje("No se encontraron alumnos.");
            vista.cerrar();
            return;
        }

        vista.mostrarMensaje("\nALUMNOS ENCONTRADOS:");

        for (int i = 0; i < encontrados.size(); i++) {
            vista.mostrarAlumno(i + 1, encontrados.get(i));
        }

        int opcion = vista.pedirSeleccion();

        if (opcion < 1 || opcion > encontrados.size()) {
            vista.mostrarMensaje("Seleccion no valida.");
            vista.cerrar();
            return;
        }

        AlumnoModelo alumno = encontrados.get(opcion - 1);

        vista.mostrarMensaje("\nDATOS DE INSCRIPCION");
        vista.mostrarMensaje("Matricula: " + alumno.id);
        vista.mostrarMensaje("Nombre: " + alumno.nombre);
        vista.mostrarMensaje("Semestre: " + alumno.semestre);
        vista.mostrarMensaje("Materias: " + alumno.materias);
        vista.mostrarMensaje("Estado: " + alumno.estado);

        String respuesta = vista.preguntarConstancia();

        if (respuesta.equalsIgnoreCase("si")) {
            String documento = constancia.generarConstancia(alumno);
            vista.mostrarMensaje(documento);
        } else {
            vista.mostrarMensaje("No se genero la constancia.");
        }

        vista.cerrar();
    }
}
