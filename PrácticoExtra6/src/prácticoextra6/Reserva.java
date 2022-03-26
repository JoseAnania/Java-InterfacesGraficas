package prácticoextra6;

public abstract class Reserva {

    private int nroHabitacion;
    protected int diasReservados;

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public void setDiasReservados(int diasReservados) {
        this.diasReservados = diasReservados;
    }

    public Reserva(int nroHabitacion, int diasReservados) {
        this.nroHabitacion = nroHabitacion;
        this.diasReservados = diasReservados;
    }

    public abstract float calcularTarifa();

    @Override
    public String toString() {
        return "Número de Habitación=" + nroHabitacion + " Días Reservados=" + diasReservados + " Tarifa="+calcularTarifa();
    }

}
