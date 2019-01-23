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
import travelform.input_data_pesawat;

/**
 *
 * @author Indra F
 */
public class input_pesawat {
    
    public Connection koneksi;
    private Component rootPane;
    public boolean inputpesawat;
    
    public boolean input_pesawat(String nama_maskapai,String kotaasal,String kotatujuan, String waktu){
    try {
            koneksi = new database_connect().condb();
            if (!kotaasal.equals(kotatujuan)){
            String input = "insert into pesawat (nama_maskapai,asal_kota,tujuan_kota,jam_berangkat) values('"+nama_maskapai+"','"+kotaasal+"','"+kotatujuan+"','"+waktu+"')";
            Statement stat;
            stat = (Statement) koneksi.createStatement();
            stat.executeUpdate(input);           
            }
            else {
                JOptionPane.showMessageDialog(rootPane,"kota asal dan tujuan idak boleh sama");
            }
        return inputpesawat = true;
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(rootPane,"Terjadi Kesalahan"+ex);
            return inputpesawat = false;
        }
    }
    
    
}
