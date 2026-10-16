
package modelo;

public class ConstanciaModelo {

    public String generarConstancia(AlumnoModelo alumno) {

        String texto = "\n===== CONSTANCIA DE ALUMNO INSCRITO =====\n";

        texto += "Nombre: " + alumno.nombre + "\n";
        texto += "Matricula: " + alumno.id + "\n";
        texto += "Semestre: " + alumno.semestre + "\n";
        texto += "Materias inscritas: " + alumno.materias + "\n";
        texto += "Estado: " + alumno.estado + "\n";
        texto += "=========================================\n";
        texto += "Control Escolar\n";

        return texto;
    }
}
