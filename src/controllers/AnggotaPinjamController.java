/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AnggotaPinjamDAO;
import entities.AnggotaPinjam;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class AnggotaPinjamController implements AnggotaPinjamInterfaceController{
    
    private AnggotaPinjamDAO anggotaPinjamDAO;

    public AnggotaPinjamController() {
    }

    public AnggotaPinjamController(Connection connection) {
        this.anggotaPinjamDAO = new AnggotaPinjamDAO(connection);
    }
    
    @Override
    public boolean save( String kdAnggota, String kdKaryawan, String namaJaminan, int nominalPinjam, int jangkaWaktu) {
        AnggotaPinjam anggotaPinjam = new AnggotaPinjam( kdAnggota, kdKaryawan, namaJaminan, nominalPinjam, jangkaWaktu);
        return this.anggotaPinjamDAO.insert(anggotaPinjam);
    }

    @Override
    public boolean edit(String kdAnggotaP, String kdAnggota, String kdKaryawan, String namaJaminan) {
        AnggotaPinjam anggotaPinjam = new AnggotaPinjam(kdAnggotaP, kdAnggota, kdKaryawan, namaJaminan);
       return this.anggotaPinjamDAO.update(anggotaPinjam);
    }

    @Override
    public boolean drop(String id) {
        return this.anggotaPinjamDAO.delete(id);
    }

    @Override
    public List<AnggotaPinjam> binding() {
        return this.anggotaPinjamDAO.getAll();
    }

    @Override
    public List<AnggotaPinjam> bindingsort(String category, String sort) {
        return this.anggotaPinjamDAO.getAllCs(category, sort);
    }

    @Override
    public List<AnggotaPinjam> find(String category, String data) {
        return this .anggotaPinjamDAO.search(category, data);
    }

    @Override
    public AnggotaPinjam findById(String id) {
        return this.anggotaPinjamDAO.getById(id);
    }

    
    
}
