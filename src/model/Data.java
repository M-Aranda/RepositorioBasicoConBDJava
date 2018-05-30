package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;


    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "aqui va el nombre de la bd", "root", "");
    }


   
}
