package es.ies.puerto.modelo.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pacientes")
public class Paciente {
    @Id
    private String dni_paciente;
    private String nombre;
    private String historial;

    public Paciente() {
    }

    public Paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public Paciente(String dni_paciente, String nombre, String historial) {
        this.dni_paciente = dni_paciente;
        this.nombre = nombre;
        this.historial = historial;
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

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Paciente paciente = (Paciente) object;
        return dni_paciente == paciente.dni_paciente;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), dni_paciente);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Paciente{" +
                "dni_paciente=" + dni_paciente +
                ", nombre='" + nombre + '\'' +
                ", historial='" + historial + '\'' +
                '}';
    }
}
