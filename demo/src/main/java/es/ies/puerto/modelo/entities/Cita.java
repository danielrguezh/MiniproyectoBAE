package es.ies.puerto.modelo.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cita {
    @Id
    private String id_cita;
    private String fecha;
    private String dni_paciente;
    private String dni_medico;
    private String valoracion;

    public Cita() {}



    public Cita(String id_cita) {
        this.id_cita = id_cita;
    }

    public Cita(String id_cita, String fecha, String dni_paciente, String dni_medico, String valoracion) {
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
