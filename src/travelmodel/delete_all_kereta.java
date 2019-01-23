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
public class delete_all_kereta {
    public Connection koneksi;
    public boolean hapuskereta;
    
    public boolean hapus_kereta(String idk){
        koneksi = new database_connect().condb();
        try{
            Statement statement = (Statement) update_koneksi.getConnection().createStatement();
            statement.executeUpdate("delete from kereta where id_kereta = '" + idk +"';");
            return hapuskereta = true;
            
        }catch (Exception t){
            JOptionPane.showMessageDialog(null, "Data Gagal di Hapus");
            return hapuskereta = false;
        }
    }
}
