
package partepráctica2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Biblioteca {
    
    private ArrayList<Libro>libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }
    
    public void agregarLibro(Libro nuevoLibro)
    {
        libros.add(nuevoLibro);
    }

    @Override
    public String toString() {
        
        String listado="";
        
        for (Libro L : libros) {
            
            listado+=L.toString()+"\n";
        }
        return listado;
    }
    
    public float precioPromedio()
    {
        float acumPrecio=0;
        
        for (Libro L : libros) {
            
            acumPrecio+=L.getPrecio();
        }
        
        return (acumPrecio/libros.size());
    }
    
    public String libroMayor()
    {
        float mayor=0;
        String nomMayor="";
        
        for (Libro L : libros) {
            if(L.getPrecio()>mayor)
            {
                mayor=L.getPrecio();
                nomMayor=L.getNombre();
            }
        }
        return nomMayor;
    }
    
    public String libroMenor()
    {
        float menor=0;
        String nomMenor="";
        
        for (int i = 0; i < libros.size(); i++) {
            
            Libro L=(Libro) libros.get(i);
            
            if(i==0 || L.getPrecio()<menor)
            {
                menor=L.getPrecio();
                nomMenor=L.getNombre();
            }
        }
        return nomMenor;
    }
    
    public String busquedaLibro(int cod)
    {
        String datosLibro="";
        
        for (Libro L : libros) {
            if(L.getCodigo()==cod)
            {
                datosLibro=L.toString();
            }
        }
        return datosLibro;
    }
    
}
