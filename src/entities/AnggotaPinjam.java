/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.sql.Date;

/**
 *
 * @author Gusma
 */
public class AnggotaPinjam {
    private String kdAnggotaP;
    private String kdAnggota;
    private String kdKaryawan;
    private String namaJaminan;
    private Date tglPinjam;
    private int nominalPinjam;
    private int jangkaWaktu;

    public AnggotaPinjam() {
    }

    public AnggotaPinjam( String kdAnggota, String kdKaryawan, String namaJaminan, int nominalPinjam, int jangkaWaktu) {
       
        this.kdAnggota = kdAnggota;
        this.kdKaryawan = kdKaryawan;
        this.namaJaminan = namaJaminan;
        this.nominalPinjam = nominalPinjam;
        this.jangkaWaktu = jangkaWaktu;
    }

    public AnggotaPinjam(String kdAnggotaP, String kdAnggota, String kdKaryawan, String namaJaminan) {
        this.kdAnggotaP = kdAnggotaP;
        this.kdAnggota = kdAnggota;
        this.kdKaryawan = kdKaryawan;
        this.namaJaminan = namaJaminan;
    }

    
    /**
     * @return the kdAnggotaP
     */
    public String getKdAnggotaP() {
        return kdAnggotaP;
    }

    /**
     * @param kdAnggotaP the kdAnggotaP to set
     */
    public void setKdAnggotaP(String kdAnggotaP) {
        this.kdAnggotaP = kdAnggotaP;
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
     * @return the kdKaryawan
     */
    public String getKdKaryawan() {
        return kdKaryawan;
    }

    /**
     * @param kdKaryawan the kdKaryawan to set
     */
    public void setKdKaryawan(String kdKaryawan) {
        this.kdKaryawan = kdKaryawan;
    }

    /**
     * @return the namaJaminan
     */
    public String getNamaJaminan() {
        return namaJaminan;
    }

    /**
     * @param namaJaminan the namaJaminan to set
     */
    public void setNamaJaminan(String namaJaminan) {
        this.namaJaminan = namaJaminan;
    }

    /**
     * @return the tglPinjam
     */
    public Date getTglPinjam() {
        return tglPinjam;
    }

    /**
     * @param tglPinjam the tglPinjam to set
     */
    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    /**
     * @return the nominalPinjam
     */
    public int getNominalPinjam() {
        return nominalPinjam;
    }

    /**
     * @param nominalPinjam the nominalPinjam to set
     */
    public void setNominalPinjam(int nominalPinjam) {
        this.nominalPinjam = nominalPinjam;
    }

    /**
     * @return the jangkaWaktu
     */
    public int getJangkaWaktu() {
        return jangkaWaktu;
    }

    /**
     * @param jangkaWaktu the jangkaWaktu to set
     */
    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }    
}
