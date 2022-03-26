
package prácticoextra7;

public class Computadora extends Producto{
    
    private String sistOperativo;
    private int cantMemoria;

    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    public int getCantMemoria() {
        return cantMemoria;
    }

    public void setCantMemoria(int cantMemoria) {
        this.cantMemoria = cantMemoria;
    }

    public Computadora(String sistOperativo, int cantMemoria, int Marca, int codigo, int modelo, int procedencia, float precio) {
        super(Marca, codigo, modelo, procedencia, precio);
        this.sistOperativo = sistOperativo;
        this.cantMemoria = cantMemoria;
    }
    
    @Override
    public float precioVenta()
    {
        float venta=precio;
        if(procedencia==2 || procedencia==3)
        {
            venta=precio*1.20f;
        }
        return venta;
    }

    @Override
    public String toString() {
        return super.toString() + " Sistema Operativo= " + sistOperativo + " Cantidad de Memoria= " + cantMemoria;
    }
    
}
