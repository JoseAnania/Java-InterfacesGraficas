
package prácticoextra7;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Producto>productos;

    public Empresa() {
        this.productos = new ArrayList<Producto>();
    }
    
    public void agregarProducto(Producto nuevoProducto)
    {
        productos.add(nuevoProducto);
    }

    @Override
    public String toString() {
        
        String listado="";
        
        for (Producto P : productos) {
            
            listado+=P.toString()+"\n";
        }
        return listado;
    }
    
    public int cantPorTipo(int tipoProducto)
    {
        int contCant=0;
        
        for (Producto P : productos) {
            if(P instanceof Computadora && tipoProducto==0)
            {
                contCant++;
            }
            if(P instanceof Impresora && tipoProducto==1)
            {
                contCant++;
            }
        }
        return contCant;
    }
    
    public float precioTotal()
    {
        float acumPrecio=0;
        
        for (Producto P : productos) {
            
            acumPrecio+=P.precioVenta();
        }
        return acumPrecio;
    }
    
    public int cantPorAno()
    {
        int contCantAno=0;
        
        for (Producto P : productos) {
            if(P instanceof Computadora)
            {
            if(P.getModelo()>=2015 && P.getModelo()<=2017)
            {
                contCantAno++;
            }
            }
        }
        return contCantAno;
    }
    
    public float precioPromedio(boolean colors)
    {
        float acumPrecio=0;
        int contImpresoras=0;
        
        for (Producto P : productos) {
            if(P instanceof Impresora)
            {
                if(((Impresora) P).isColor()==colors)
                {
                    acumPrecio+=P.precioVenta();
                    contImpresoras++;
                }
            }
        }
        return (acumPrecio/contImpresoras);
    }
    
    public String marcaMasVendida()
    {
        int mayor=0;
        String nomMayor="";
        
        for (Producto P : productos) {
            if(P.getMarca()>mayor)
            {
                mayor=P.getMarca();
                nomMayor=P.nombreMarca();
            }
        }
        return nomMayor;
    }
    
    public float precioEspecial()
    {
        float mayor=0;
        float precioEsp=0;
        
        for (Producto P : productos) {
            if(P instanceof Impresora)
            {
                if(P.precioVenta()>mayor)
                {
                    mayor=P.precioVenta();
                    precioEsp=P.precioVenta()*0.90f;
                }
            }
        }
        return precioEsp;
    }
}
