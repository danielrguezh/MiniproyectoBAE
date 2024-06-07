package es.ies.puerto.modelo.dao;

import java.util.Objects;

public class CitaDto {
    int id_cita;
    String fecha;
    private int dni_paciente;
    private int dni_medico;
    private String valoracion;

    public CitaDto() {
    }

    public CitaDto(int id_cita) {
        this.id_cita = id_cita;
    }

    public CitaDto(int id_cita, String fecha, int dni_paciente, int dni_medico, String valoracion) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitaDto citaDto = (CitaDto) o;
        return id_cita == citaDto.id_cita;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_cita);
    }

    @Override
    public String toString() {
        return "CitaDto{" +
                "id_cita=" + id_cita +
                ", fecha='" + fecha + '\'' +
                ", dni_paciente=" + dni_paciente +
                ", dni_medico=" + dni_medico +
                ", valoracion='" + valoracion + '\'' +
                '}';
    }
}
