package es.ies.puerto.modelo.dao;

import java.util.Objects;

public class MedicoDto {
    private int dni_paciente;
    public String nombre;
    private String especialidad;

    public MedicoDto() {
    }

    public MedicoDto(int dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public MedicoDto(int dni_paciente, String nombre, String especialidad) {
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(int dni_paciente) {
        this.dni_paciente = dni_paciente;
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
        return dni_paciente == medicoDto.dni_paciente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni_paciente);
    }

    @Override
    public String toString() {
        return "MedicoDto{" +
                "dni_paciente=" + dni_paciente +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
