/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Indra F
 */
public class database_connect {
    public Connection koneksi;
    public ResultSet hasil;
    private java.sql.Statement stat;
    private String query, url, database;
    public java.sql.Statement cn;

    public database_connect() {
        condb();
    }
    Connection con;

    public void panggildriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String driver = "jdbc:mysql://localhost:3306";
        } catch (Exception e) {
            System.out.println("driver error");
        }
    }

    public Connection condb() {
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelpedia", "root","");
            System.out.println("koneksi sukses");
        } catch (Exception e) {
            System.out.println("koneksi gagal");
        }
        return koneksi;
    }
}
