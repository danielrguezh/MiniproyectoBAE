package es.ies.puerto.negocio.dto;

import java.util.Objects;

public class MedicoDto {
    private String dni_medico;
    private String nombre;
    private String especialidad;

    public MedicoDto() {
    }

    public MedicoDto(String dni_medico) {
        this.dni_medico = dni_medico;
    }

    public MedicoDto(String dni_medico, String nombre, String especialidad) {
        this.dni_medico = dni_medico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni_medico() {
        return dni_medico;
    }

    public void setDni_medico(String  dni_medico) {
        this.dni_medico = dni_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicoDto medicoDto = (MedicoDto) o;
        return dni_medico == medicoDto.dni_medico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni_medico);
    }

    @Override
    public String toString() {
        return "MedicoDto{" +
                "dni_paciente=" + dni_medico +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
