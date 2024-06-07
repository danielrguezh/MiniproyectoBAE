package es.ies.puerto.modelo.entities;

public class Cita {
    int id_cita;
    String fecha;
    private int dni_paciente;
    private int dni_medico;
    private String valoracion;

    public Cita() {}



    public Cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public Cita(int id_cita, String fecha, int dni_paciente, int dni_medico, String valoracion) {
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.dni_paciente = dni_paciente;
        this.dni_medico = dni_medico;
        this.valoracion = valoracion;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(int dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public int getDni_medico() {
        return dni_medico;
    }

    public void setDni_medico(int dni_medico) {
        this.dni_medico = dni_medico;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Cita cita = (Cita) object;
        return id_cita == cita.id_cita;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id_cita);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cita{" +
                "id_cita=" + id_cita +
                ", fecha='" + fecha + '\'' +
                ", dni_paciente=" + dni_paciente +
                ", dni_medico=" + dni_medico +
                ", valoracion='" + valoracion + '\'' +
                '}';
    }
}
