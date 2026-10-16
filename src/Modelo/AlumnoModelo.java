
package modelo;

public class AlumnoModelo {

    public String id;
    public String nombre;
    public int semestre;
    public int materias;
    public String estado;

    public AlumnoModelo(String id, String nombre,
            int semestre, int materias, String estado) {

        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.materias = materias;
        this.estado = estado;
    }

    public String toString() {
        return id + " - " + nombre;
    }
}
