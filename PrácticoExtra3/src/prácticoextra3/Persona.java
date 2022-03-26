
package prácticoextra3;

public class Persona {
    
    protected String nombre;
    protected int dni;
    protected boolean sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Persona(String nombre, int dni, boolean sexo) {
        this.nombre = nombre;
        this.dni = dni;
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
        return "Nombre=" + nombre + " Dni=" + dni + " Sexo=" + tipoSexo();
    }
    
}
