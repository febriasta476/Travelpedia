/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmodel;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Indra F
 */
public class delete_all_pesawat {
    public Connection koneksi;
    public boolean hapuspesawat;
    
    public boolean hapus_pesawat(String id){
        koneksi = new database_connect().condb();
        try{
            Statement statement = (Statement) update_koneksi.getConnection().createStatement();
            statement.executeUpdate("delete from pesawat where id_pesawat = '" + id + "';");
            return hapuspesawat = true;
            
        }catch (Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal di Hapus");
            return hapuspesawat = false;
        }
    }
}
