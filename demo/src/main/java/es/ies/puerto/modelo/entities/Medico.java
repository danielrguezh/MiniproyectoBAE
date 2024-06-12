package es.ies.puerto.modelo.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicos")
public class Medico {
    @Id
    private String dni_paciente;
    private String nombre;
    private String especialidad;

    public Medico() {}

    public Medico(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public Medico(String dni_paciente, String nombre, String especialidad) {
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni_paciente() {
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Medico medico = (Medico) object;
        return dni_paciente == medico.dni_paciente;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), dni_paciente);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Medico{" +
                "dni_paciente=" + dni_paciente +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
