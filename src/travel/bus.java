/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

/**
 *
 * @author Indra F
 */
public class bus extends kendaraan{
    private String plat;
    private String tujuan;

    public bus(String plat, String tujuan) {
        this.plat = plat;
        this.tujuan = tujuan;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    @Override
    public void setMerk(String merk) {
        super.setMerk(merk); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMerk() {
        return super.getMerk(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJenis(String jenis) {
        super.setJenis(jenis); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJenis() {
        return super.getJenis(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
    
    
}
