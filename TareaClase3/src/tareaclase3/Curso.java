
package tareaclase3;

import java.util.ArrayList;

public class Curso {
    
    private ArrayList<Alumno>alumnos;

    public Curso() {
        this.alumnos = new ArrayList<Alumno>();
    }
    
    public void agregarAlumno(Alumno nuevoAlumno)
    {
        alumnos.add(nuevoAlumno);
    }

    @Override
    public String toString() {
        
        String listado="";
        
        for (Alumno A : alumnos) {
            
            listado+=A.toString()+"\n"; 
        }
        return listado;
    }
    
    public float calcularPromedioG()
    {
        float promedioG=0;
        
        for (Alumno A : alumnos) {
            
            promedioG+=A.calcularPromedio();
        }
        return (promedioG/alumnos.size());
    }
    
}
