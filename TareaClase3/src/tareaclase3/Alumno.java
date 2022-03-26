package tareaclase3;

import java.util.ArrayList;


public class Alumno {
    
    private String nombre;
    private int legajo;
    private ArrayList notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new ArrayList();
    }
    
    public void agregarNota(int nuevaNota)
    {
        notas.add(nuevaNota);
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " Legajo=" + legajo;
    }
    
    public float calcularPromedio()
    {
        float promedio=0;
        
        for (int i = 0; i < notas.size(); i++) {
            
            Integer I=(Integer)notas.get(i);
            promedio+=I;
        }
        
        return (promedio/notas.size());
    }
    
}
