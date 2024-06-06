package es.ies.puerto.modelo;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.CentroMedicoException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion extends AppConfig {
    private Connection con;

    private String url;

    public Conexion() throws CentroMedicoException {
        super();
        this.url = "jdbc:sqlite:"+getUrlBd();
    }


    public Connection getConexion() throws CentroMedicoException {
        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new CentroMedicoException("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }
}