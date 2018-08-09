/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.KaryawanDAO;
import entities.Karyawan;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gusma
 */
public class KaryawanController implements KaryawanInterfaceController {

    private KaryawanDAO karyawanDAO;

    public KaryawanController() {
    }

    public KaryawanController(Connection connection) {
        this.karyawanDAO = new KaryawanDAO(connection);
    }

    @Override
    public boolean save(String kdKaryawan, String namaKaryawan, String alamat, String telepon, String password) {
        Karyawan karyawan = new Karyawan(kdKaryawan, namaKaryawan, alamat, telepon,password);
        return this.karyawanDAO.insert(karyawan);
    }

    @Override
    public boolean edit(String kdKaryawan, String namaaKaryawan, String alamat, String telepon, String password) {
        return this.karyawanDAO.update(new Karyawan(kdKaryawan,namaaKaryawan, alamat, telepon, password));

    }

    @Override
    public boolean drop(String id) {
        return this.karyawanDAO.delete(id);
    }

    @Override
    public List<Karyawan> binding() {
        return this.karyawanDAO.getAll();

    }

    @Override
    public List<Karyawan> bindingsort(String category, String sort) {
        return this.karyawanDAO.getAllCs(category, sort);
    }

    @Override
    public List<Karyawan> find(String category, String data) {
        return this.karyawanDAO.search(category, data);
    }

    @Override
    public Karyawan findBy(String id) {
        return this.karyawanDAO.getById(id);
    }

    @Override
    public boolean getLogins(String kdLogin, String PassLogin) {
         return this.karyawanDAO.getLogin(kdLogin, PassLogin);
       }

    

}
