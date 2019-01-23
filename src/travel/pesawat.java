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
public class pesawat extends kendaraan{
    private String tujuan;
    private String nomor_pesawat;

    public pesawat(String tujuan, String nomor_pesawat) {
        this.tujuan = tujuan;
        this.nomor_pesawat = nomor_pesawat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getNomor_pesawat() {
        return nomor_pesawat;
    }

    public void setNomor_pesawat(String nomor_pesawat) {
        this.nomor_pesawat = nomor_pesawat;
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
