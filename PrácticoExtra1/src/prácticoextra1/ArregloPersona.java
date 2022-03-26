
package prácticoextra1;

import java.util.ArrayList;

public class ArregloPersona {
    
    private ArrayList<Persona>personas;

    public ArregloPersona() {
        this.personas = new ArrayList<Persona>();
    }
    
    public void agregarPersona(Persona nuevaPersona)
    {
        personas.add(nuevaPersona);
    }

    @Override
    public String toString() {
        
        String listado="\n";
        
        for (Persona P : personas) {
            
            listado+=P.toString()+"\n";
        }
        return listado;
    }
    
}
