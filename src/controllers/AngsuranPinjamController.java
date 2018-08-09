/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AngsuranPinjamDAO;
import entities.AngsuranPinjam;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class AngsuranPinjamController implements AngsuranPinjamInterfaceController{
    
    private AngsuranPinjamDAO angsuranPinjamDAO;

    public AngsuranPinjamController() {
    }

    public AngsuranPinjamController(Connection connection) {
        this.angsuranPinjamDAO= new AngsuranPinjamDAO(connection);
    }
    
    

    @Override
    public boolean save(String kdAngsuran, String kdAnggotaP) {
        AngsuranPinjam angsuranPinjam = new AngsuranPinjam(kdAngsuran, kdAnggotaP);
        return this.angsuranPinjamDAO.insert(angsuranPinjam);
    }

    @Override
    public boolean edit(String kdAngsuran, String kdAnggotaP, Date tglAngsur, int jumlahAngsuran, String status) {
        AngsuranPinjam angsuranPinjam = new AngsuranPinjam(kdAngsuran, kdAnggotaP, tglAngsur, jumlahAngsuran, status);
        return this.angsuranPinjamDAO.update(angsuranPinjam);
    }

    @Override
    public boolean drop(String id) {
        return this.angsuranPinjamDAO.delete(id);
    }

    @Override
    public List<AngsuranPinjam> binding() {
        return this.angsuranPinjamDAO.getAll();
    }

    @Override
    public List<AngsuranPinjam> bindingsort(String category, String sort) {
        return this.angsuranPinjamDAO.getAllCs(category, sort);
    }

    @Override
    public List<AngsuranPinjam> find(String category, String data) {
        return this.angsuranPinjamDAO.search(category, data);
    }

    @Override
    public AngsuranPinjam findById(String id) {
        return this.angsuranPinjamDAO.getById(id);
    }
    
    
}
