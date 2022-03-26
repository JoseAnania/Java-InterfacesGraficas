
package prácticoextra7;

public class Impresora extends Producto{
    
    private boolean color;
    private int papel;

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public Impresora(boolean color, int papel, int Marca, int codigo, int modelo, int procedencia, float precio) {
        super(Marca, codigo, modelo, procedencia, precio);
        this.color = color;
        this.papel = papel;
    }
    
    public String nombreColor()
    {
        String nombre="";
        if(color==true)
        {
            nombre="Blanca";
        }
        else
        {
            nombre="Negra";
        }
        return nombre;
    }
    
    public String nombrePapel()
    {
        String nombre="";
        
        if(papel==1)
        {
            nombre="A4";
        }
        if(papel==2)
        {
            nombre="A3";
        }
        if(papel==3)
        {
            nombre="A2";
        }
        return nombre;
    }
    
    @Override
    public float precioVenta()
    {
        float venta=precio;
        if(procedencia==1)
        {
            venta=precio*0.90f;
        }
        return venta;
    }

    @Override
    public String toString() {
        return super.toString() + " Color= " + nombreColor() + " Papel que Soprta= " + nombrePapel();
    }
    
}
