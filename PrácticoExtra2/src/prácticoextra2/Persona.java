
package prácticoextra2;

public class Persona {
    
    private String nombre;
    private int edad;
    private boolean sexo;

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

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public String tipoSexo()
    {
        String tipo="";
        if(sexo==true)
        {
            tipo="Masculino";
        }
        else
        {
            tipo="Femenino";
        }
        return tipo;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " Edad=" + edad + " Sexo=" + tipoSexo();
    }
    
}
