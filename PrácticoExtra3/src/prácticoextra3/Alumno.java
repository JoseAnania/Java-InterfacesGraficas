
package prácticoextra3;

public class Alumno extends Persona{
    
    private int nota1;
    private int nota2;

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public Alumno(int nota1, int nota2, String nombre, int dni, boolean sexo) {
        super(nombre, dni, sexo);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return super.toString() + " Nota 1=" + nota1 + " Nota2=" + nota2;
    }
    
    public float calcularPromedio()
    {
        float promedio=0;
        
        promedio=(nota1+nota2)/2f;
        
        return promedio;
    }
    
}
