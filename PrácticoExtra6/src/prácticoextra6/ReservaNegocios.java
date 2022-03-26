package prácticoextra6;

public class ReservaNegocios extends Reserva {

    private boolean conferencia;

    public boolean isConferencia() {
        return conferencia;
    }

    public void setConferencia(boolean conferencia) {
        this.conferencia = conferencia;
    }

    public ReservaNegocios(boolean conferencia, int nroHabitacion, int diasReservados) {
        super(nroHabitacion, diasReservados);
        this.conferencia = conferencia;
    }

    public String asisteConferencia() {
        String asiste = "";

        if (conferencia == true) {
            asiste = "Sí";
        } else {
            asiste = "No";
        }
        return asiste;
    }

    @Override
    public float calcularTarifa() {
        float tarifa = 0;

        if (conferencia == true) {
            tarifa = (500 * diasReservados) + 700;
        } else {
            tarifa = (500 * diasReservados);
        }
        return tarifa;
    }

    @Override
    public String toString() {
        return super.toString() + " Asiste a Conferencia=" + asisteConferencia();
    }

}
