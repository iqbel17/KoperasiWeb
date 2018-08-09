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
public class AngsuranPinjam {
    private String kdAngsuran;
    private String kdAnggotaP;
    private Date tglAngsur;
    private int jumlahAngsuran;
    private String status;

    public AngsuranPinjam() {
    }

    public AngsuranPinjam(String kdAngsuran, String kdAnggotaP, Date tglAngsur, int jumlahAngsuran, String status) {
        this.kdAngsuran = kdAngsuran;
        this.kdAnggotaP = kdAnggotaP;
        this.tglAngsur = tglAngsur;
        this.jumlahAngsuran = jumlahAngsuran;
        this.status = status;
    }

    public AngsuranPinjam(String kdAngsuran, String kdAnggotaP) {
        this.kdAngsuran = kdAngsuran;
        this.kdAnggotaP = kdAnggotaP;
    }

    /**
     * @return the kdAngsuran
     */
    public String getKdAngsuran() {
        return kdAngsuran;
    }

    /**
     * @param kdAngsuran the kdAngsuran to set
     */
    public void setKdAngsuran(String kdAngsuran) {
        this.kdAngsuran = kdAngsuran;
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
     * @return the tglAngsur
     */
    public Date getTglAngsur() {
        return tglAngsur;
    }

    /**
     * @param tglAngsur the tglAngsur to set
     */
    public void setTglAngsur(Date tglAngsur) {
        this.tglAngsur = tglAngsur;
    }

    /**
     * @return the jumlahAngsuran
     */
    public int getJumlahAngsuran() {
        return jumlahAngsuran;
    }

    /**
     * @param jumlahAngsuran the jumlahAngsuran to set
     */
    public void setJumlahAngsuran(int jumlahAngsuran) {
        this.jumlahAngsuran = jumlahAngsuran;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
