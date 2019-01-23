/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmodel;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class data_model_login {
    public boolean succes;
    public int operator = 0;
    public Statement cn;
    public Connection koneksi;
    String password, kode,loginas;
    private Component rootPane;

    public String getLoginas() {
        return loginas;
    }

    public void setLoginas(String loginas) {
        this.loginas = loginas;
    }
    
    public data_model_login() {
        database_connect konek = new database_connect();
        koneksi = new database_connect().condb();
    }

    public boolean masuk(String user, String pass) {
        kode = user;
        password = pass;
        try {
            String sql = "select * from admin where password='" + pass + "' and username='" + user + "'";
            System.out.println(pass + " " + user);
            Statement stat = koneksi.createStatement();
            ResultSet res = stat.executeQuery(sql);
            int a = 0;
            while (res.next()) {
                a = res.getRow();
            }
            if (a == 1) {
                JOptionPane.showMessageDialog(rootPane, "Login sukses");
                succes = true;
            }
            if(a==0) {
                JOptionPane.showMessageDialog(rootPane, "Password salah");
                succes = false;
            }
            while (res.next()) {
            }
        } catch (SQLException | HeadlessException e) {
        }
        return succes;
    }
}
