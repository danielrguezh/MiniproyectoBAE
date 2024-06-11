package es.ies.puerto.negocio.dto;

import java.util.Objects;

public class PacienteDto {
    private String dni_paciente;
    private String nombre;
    private String historial;

    public PacienteDto() {
    }

    public PacienteDto(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public PacienteDto(String dni_paciente, String nombre, String historial) {
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.historial = historial;
    }

    public String  getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteDto that = (PacienteDto) o;
        return dni_paciente == that.dni_paciente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni_paciente);
    }

    @Override
    public String toString() {
        return "PacientoDto{" +
                "dni_paciente=" + dni_paciente +
                ", nombre='" + nombre + '\'' +
                ", historial='" + historial + '\'' +
                '}';
    }
}
