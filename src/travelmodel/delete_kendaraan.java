/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelmodel;

import com.sun.xml.internal.ws.handler.HandlerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Queen
 */
public class delete_kendaraan {
    public Connection koneksi;
    public boolean hapuspelanggan;
    
    public boolean hapus(String id){
        koneksi = new database_connect().condb();
        try{
            String sql ="delete from kendaraan where id ='"+id+"'";
            Statement stat = (Statement) koneksi.createStatement();
            stat.executeUpdate(sql);
            return hapuspelanggan = true;
        }catch(SQLException | HandlerException ex){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan"+ ex);
            return hapuspelanggan = false;
        }
    }
}
