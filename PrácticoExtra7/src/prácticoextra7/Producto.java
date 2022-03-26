
package prácticoextra7;

public abstract class Producto {
    
    private int marca;
    private int codigo;
    private int modelo;
    protected int procedencia;
    protected float precio;

    public int getMarca() {
        return marca;
    }

    public void setMarca(int Marca) {
        this.marca = Marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(int procedencia) {
        this.procedencia = procedencia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto(int Marca, int codigo, int modelo, int procedencia, float precio) {
        this.marca = Marca;
        this.codigo = codigo;
        this.modelo = modelo;
        this.procedencia = procedencia;
        this.precio = precio;
    }
    
    public String nombreMarca()
    {
        String nombre="";
        if(marca==1)
        {
            nombre="Mac";
        }
        if(marca==2)
        {
            nombre="HP";
        }
        if(marca==3)
        {
            nombre="Samsung";
        }
        if(marca==4)
        {
            nombre="Lenovo";
        }
        return nombre;
    }
    
    public String nombreProcedencia()
    {
        String nombre="";
        if(procedencia==1)
        {
            nombre="Argentina";
        }
        if(procedencia==2)
        {
            nombre="Estados Unidos";
        }
        if(procedencia==3)
        {
            nombre="China";
        }
        return nombre;
    }
    
    public abstract float precioVenta();

    @Override
    public String toString() {
        return "Marca= " + nombreMarca() + " Código= " + codigo + " Modelo= " + modelo + " Procedencia= " + nombreProcedencia() + " Precio= " + precio + " Precio de Venta= " + precioVenta();
    }
}
