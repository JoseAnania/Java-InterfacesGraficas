package partepráctica1;

import java.util.ArrayList;

public class ArregloAlumno {

    private ArrayList<Alumno> alumnos;

    public ArregloAlumno() {
        this.alumnos = new ArrayList<Alumno>();
    }

    public void agregarAlumno(Alumno nuevoAlumno) {
        alumnos.add(nuevoAlumno);
    }

    public float promedioGeneral() {
        float prom = 0;

        for (Alumno A : alumnos) {

            prom += A.getPromedio();
        }
        return (prom / alumnos.size());
    }

    @Override
    public String toString() {

        String listado = "";

        for (Alumno A : alumnos) {

            listado += A.toString() + "\n";
        }
        return listado;
    }

    public String busquedaAlumno(int leg) {
        String busqueda = "";

        for (Alumno A : alumnos) {

            if (A.getLegajo() == leg) {
                busqueda = A.toString();
            }
        }
        return busqueda;
    }

}
