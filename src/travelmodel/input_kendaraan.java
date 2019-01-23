/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmodel;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import travelform.input_data_kendaraan;

/**
 *
 * @author Indra F
 */
public class input_kendaraan {
    
    public Connection koneksi;
    private Component rootPane;
    public boolean inputkendaraan;
    
    public boolean input_kendaraan(String merk,String asal,String tujuan, String waktu){
     try {
            koneksi = new database_connect().condb();
            String input ="insert into kendaraan (merk_kendaraan,asal_kendaraan, tujuan_kendaraan, waktu_kendaraan) values('"+merk+"','"+asal+"','"+tujuan +"','"+waktu +"')";
            Statement stat;
            stat = (Statement) koneksi.createStatement();
            stat.executeUpdate(input);
            return inputkendaraan = true;
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(rootPane,"Terjadi Kesalahan"+ex);
            return inputkendaraan = false;
        }
    }
    
    
}
