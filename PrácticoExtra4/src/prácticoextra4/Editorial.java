package prácticoextra4;

import java.util.ArrayList;

public class Editorial {

    private ArrayList<Libro> libros;

    public Editorial() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro nuevoLibro) {
        libros.add(nuevoLibro);
    }

    @Override
    public String toString() {
        String listado = "";

        for (Libro L : libros) {

            listado += L.toString() + "\n";
        }
        return listado;
    }

    public float calcularPrecio(int tipoLibro) {
        float precioVenta = 0;

        for (Libro L : libros) {

            if (tipoLibro == L.tipoLibro) {
                if (L instanceof LibroNacional) {
                    precioVenta = L.calcularPrecio();
                }
                if (L instanceof LibroInternacional) {
                    precioVenta = L.calcularPrecio();
                }
            }
        }
        return precioVenta;
    }

    public float stockInternacionales() {
        float acumStockI = 0;

        for (Libro L : libros) {

            if (L instanceof LibroInternacional) {
                acumStockI += ((LibroInternacional) L).stock;
            }
        }
        return acumStockI;
    }

    public int cantidadLIporTipo(int tipoLibro) {
        int contLI = 0;

        for (Libro L : libros) {
            if (L instanceof LibroInternacional && tipoLibro == L.tipoLibro) {
                contLI++;
            }
        }
        return contLI;
    }

}
