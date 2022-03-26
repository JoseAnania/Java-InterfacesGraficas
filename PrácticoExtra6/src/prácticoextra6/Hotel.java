package prácticoextra6;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Reserva> reservas;

    public Hotel() {
        this.reservas = new ArrayList<Reserva>();
    }

    public void agregarReserva(Reserva nuevaReserva) {
        reservas.add(nuevaReserva);
    }

    @Override
    public String toString() {

        String listado = "";

        for (Reserva R : reservas) {

            listado += R.toString() + "\n";
        }
        return listado;
    }

    public float calcularTarifa() {
        float tarifa = 0;

        for (Reserva R : reservas) {

            if (R instanceof ReservaVacaciones) {
                tarifa += R.calcularTarifa();
            }
            if (R instanceof ReservaNegocios) {
                tarifa += R.calcularTarifa();
            }
        }
        return tarifa;
    }

    public int cantidadPorTipo(int tipoReserva) {
        int contReservas = 0;

        for (Reserva R : reservas) {
            
            if(R instanceof ReservaVacaciones && tipoReserva==0)
            {
                    contReservas++;
            }
            if(R instanceof ReservaNegocios && tipoReserva==1)
            {
                    contReservas++;
            }
        }
        return contReservas;
    }

}
