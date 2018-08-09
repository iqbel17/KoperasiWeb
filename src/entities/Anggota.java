/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author iqbael17
 */
public class Anggota {
 private String kdAnggota;
 private String nmAnggota;
 private String telepon;
 private String alamat;


    public Anggota(String nmAnggota, String telepon, String alamat) {
        this.nmAnggota = nmAnggota;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    public Anggota() {
        
    }
    /**
     * @return the kdAnggota
     */
    public String getKdAnggota() {
        return kdAnggota;
    }

    /**
     * @param kdAnggota the kdAnggota to set
     */
    public void setKdAnggota(String kdAnggota) {
        this.kdAnggota = kdAnggota;
    }

    /**
     * @return the nmAnggota
     */
    public String getNmAnggota() {
        return nmAnggota;
    }

    /**
     * @param nmAnggota the nmAnggota to set
     */
    public void setNmAnggota(String nmAnggota) {
        this.nmAnggota = nmAnggota;
    }

    /**
     * @return the JK
     */
    

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
 
}
