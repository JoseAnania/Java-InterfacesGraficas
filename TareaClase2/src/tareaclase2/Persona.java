package tareaclase2;

public class Persona {

    public String nombre;
    public int edad;
    public boolean casado;
    public int hijos;
    public float sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Persona(String nombre, int edad, boolean casado, int hijos, float sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
        this.hijos = hijos;
        this.sueldo = sueldo;
    }

    public String esCasado() {
        String esCas = "";

        if (casado == true) {
            esCas = "Si";
        } else {
            esCas = "No";
        }
        return esCas;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " Edad=" + edad + " Casado=" + esCasado() + " Hijos=" + hijos + " Sueldo=" + sueldo;
    }

}
