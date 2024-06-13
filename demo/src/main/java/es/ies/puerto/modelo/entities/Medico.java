package es.ies.puerto.modelo.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "medicos")
public class Medico {
    @Id
    private String dni_medico;
    private String nombre;
    private String especialidad;

    public Medico() {}

    public Medico(String dni_medico) {
        this.dni_medico = dni_medico;
    }

    public Medico(String dni_medico, String nombre, String especialidad) {
        this.dni_medico = dni_medico;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni_medico() {
        return dni_medico;
    }

    public void setDni_medico(String dni_medico) {
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Medico medico = (Medico) object;
        return dni_medico == medico.dni_medico;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), dni_medico);
    }

    @Override
    public String toString() {
        return "Medico{" +
                "dni_paciente=" + dni_medico +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
