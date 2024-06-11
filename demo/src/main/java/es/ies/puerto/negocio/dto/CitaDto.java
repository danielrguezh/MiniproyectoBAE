package es.ies.puerto.negocio.dto;

import java.util.Objects;

public class  CitaDto {
    private String id_cita;
    private String fecha;
    private String dni_paciente;
    private String dni_medico;
    private String valoracion;

    public CitaDto() {
    }

    public CitaDto(String id_cita) {
        this.id_cita = id_cita;
    }

    public CitaDto(String id_cita, String fecha, String dni_paciente, String dni_medico, String valoracion) {
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.dni_paciente = dni_paciente;
        this.dni_medico = dni_medico;
        this.valoracion = valoracion;
    }

    public String getId_cita() {
        return id_cita;
    }

    public void setId_cita(String id_cita) {
        this.id_cita = id_cita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public String getDni_medico() {
        return dni_medico;
    }

    public void setDni_medico(String dni_medico) {
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
