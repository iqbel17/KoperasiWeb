/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author iqbael17
 */
public class AnggotaSimpan {
    private String kdAnggotaSimpan;
    private String kdSimpanan;
    private String kdAnggota;
    private String kdKaryawan;
    private Date tglSimpan;
    private  int nominal;

    public AnggotaSimpan() {
    }

    public AnggotaSimpan(String kdAnggotaSimpan, String kdAnggota, String kdKaryawan, int nominal) {
        this.kdAnggotaSimpan = kdAnggotaSimpan;
        this.kdAnggota = kdAnggota;
        this.kdKaryawan = kdKaryawan;
        this.nominal = nominal;
    }

    
   

   

    public void setKdAnggotaSimpan(String kdAnggotaSimpan) {
        this.kdAnggotaSimpan = kdAnggotaSimpan;
    }

    
    
    public String getKdAnggotaSimpan() {
        return kdAnggotaSimpan;
    }

    public String getKdSimpanan() {
        return kdSimpanan;
    }

    public void setKdSimpanan(String kdSimpanan) {
        this.kdSimpanan = kdSimpanan;
    }

    public String getKdAnggota() {
        return kdAnggota;
    }

    public void setKdAnggota(String kdAnggota) {
        this.kdAnggota = kdAnggota;
    }

    public String getKdKaryawan() {
        return kdKaryawan;
    }

    public void setKdKaryawan(String kdKaryawan) {
        this.kdKaryawan = kdKaryawan;
    }

    public Date getTglSimpan() {
        return tglSimpan;
    }

    public void setTglSimpan(Date tglSimpan) {
        this.tglSimpan = tglSimpan;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

   
}
