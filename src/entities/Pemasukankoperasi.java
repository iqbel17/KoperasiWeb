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
public class Pemasukankoperasi {

    private String kdMasukkoperasi;
    private String kdSimpanan;
    private String nmPemasukan;
    private Date tglSimpankoperasi;
    private int nominalsimpan;

    public Pemasukankoperasi(String kdMasukkoperasi, String nmPemasukan, int nominalsimpan) {
        this.kdMasukkoperasi = kdMasukkoperasi;
        this.nmPemasukan = nmPemasukan;
        this.nominalsimpan = nominalsimpan;
    }

    public Pemasukankoperasi(String kdMasukkoperasi, String nmPemasukan) {
        this.kdMasukkoperasi = kdMasukkoperasi;
        this.nmPemasukan = nmPemasukan;
    }

    public Pemasukankoperasi() {
    }

    /**
     * @return the kdMasukkoperasi
     */
    public String getKdMasukkoperasi() {
        return kdMasukkoperasi;
    }

    public String getNmPemasukan() {
        return nmPemasukan;
    }

    public void setNmPemasukan(String nmPemasukan) {
        this.nmPemasukan = nmPemasukan;
    }

    /**
     * @param kdMasukkoperasi the kdMasukkoperasi to set
     */
    public void setKdMasukkoperasi(String kdMasukkoperasi) {
        this.kdMasukkoperasi = kdMasukkoperasi;
    }

    /**
     * @return the kdSimpanan
     */
    public String getKdSimpanan() {
        return kdSimpanan;
    }

    /**
     * @param kdSimpanan the kdSimpanan to set
     */
    public void setKdSimpanan(String kdSimpanan) {
        this.kdSimpanan = kdSimpanan;
    }

    /**
     * @return the nominalsimpan
     */
    public int getNominalsimpan() {
        return nominalsimpan;
    }

    /**
     * @param nominalsimpan the nominalsimpan to set
     */
    public void setNominalsimpan(int nominalsimpan) {
        this.nominalsimpan = nominalsimpan;
    }

    public Date getTglSimpankoperasi() {
        return tglSimpankoperasi;
    }

    public void setTglSimpankoperasi(Date tglSimpankoperasi) {
        this.tglSimpankoperasi = tglSimpankoperasi;
    }

}
