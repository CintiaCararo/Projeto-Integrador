/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mateus
 */
public class PGConnection {

    private String host, port, database, username, password, url;
    private Connection db;

    public PGConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersLogin.class.getName()).log(Level.SEVERE,
                    "org.postgresql.Driver not found", ex);
        }

        host = "localhost";
        port = "5432";
        database = "UTFPR";
        url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
        username = "postgres";
        password = "postgres";
    }

    boolean conectar() {
        if (db == null) {
            try {
                db = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(PersLogin.class.getName()).log(Level.SEVERE,
                        "DriverManager.getConnection fail", ex);
                return false;
            }
        }
        return true;
    }

    void desconectar() {
        if (db != null) {
            try {
                db.close();
            } catch (SQLException ex) {
                Logger.getLogger(PersLogin.class.getName()).log(Level.SEVERE,
                        "DriverManager.getConnection fail", ex);
            }
        }
    }

    public Connection getDb() {
        return db;
    }
}
