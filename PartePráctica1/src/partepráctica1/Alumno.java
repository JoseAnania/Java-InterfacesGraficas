package partepráctica1;

public class Alumno {

    private int legajo;
    private String nombre;
    private float promedio;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Alumno(int legajo, String nombre, float promedio) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Legajo=" + legajo + " Nombre=" + nombre + " Promedio=" + promedio;
    }

}
