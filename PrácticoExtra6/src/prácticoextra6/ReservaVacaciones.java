package prácticoextra6;

public class ReservaVacaciones extends Reserva {

    private int cantNinos;

    public int getCantNinos() {
        return cantNinos;
    }

    public void setCantNinos(int cantNinos) {
        this.cantNinos = cantNinos;
    }

    public ReservaVacaciones(int cantNinos, int nroHabitacion, int diasReservados) {
        super(nroHabitacion, diasReservados);
        this.cantNinos = cantNinos;
    }

    @Override
    public float calcularTarifa() {
        float tarifa = 0;

        tarifa = (600 * diasReservados) + (100 * cantNinos);

        return tarifa;
    }

    @Override
    public String toString() {
        return super.toString() + " Cantidad de Niños=" + cantNinos;
    }

}
