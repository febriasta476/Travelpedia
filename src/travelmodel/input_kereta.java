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
import travelform.input_data_kereta;

/**
 *
 * @author Indra F
 */
public class input_kereta {
    
    public Connection koneksi;
    private Component rootPane;
    public boolean inputkereta;
    
    public boolean input_kereta(String nama_kereta,String kotaasal,String kotatujuan, String waktu){
        try {
            koneksi = new database_connect().condb();
            String input = "insert into kereta (nama_kereta,asal_kota1,kota_tujuan,jam_berangkat1) values('"+nama_kereta+"','"+kotaasal+"','"+kotatujuan+"','"+waktu+"')";
            Statement stat;
            stat = (Statement) koneksi.createStatement();
            stat.executeUpdate(input);
          
            return inputkereta = true;

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(rootPane,"Terjadi Kesalahan"+ex);
            return inputkereta = false;
        }
    }
    
}
