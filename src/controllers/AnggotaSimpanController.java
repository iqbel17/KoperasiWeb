/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AnggotaDAO;
import daos.AnggotaSimpanDAO;
import entities.Simpanan;
import entities.AnggotaSimpan;
import entities.Anggota;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class AnggotaSimpanController implements AnggotaSimpanInterfaceController {

    private AnggotaSimpanDAO asdao;

    public AnggotaSimpanController(Connection connection) {
        this.asdao = new AnggotaSimpanDAO(connection);
    }

    @Override
    public boolean save(String kdAnggotasimpan, String kdAnggota, String kdKaryawan, String nominal) {
        return this.asdao.insert(new AnggotaSimpan(kdAnggotasimpan, kdAnggota, kdKaryawan, Integer.parseInt(nominal)));
    }

    @Override
    public boolean edit(String kdAnggotasimpan, String kdAnggota, String kdKaryawan, String nominal) {
        return this.asdao.update(new AnggotaSimpan(kdAnggotasimpan, kdAnggota, kdKaryawan, Integer.parseInt(nominal)));
    }

    @Override
    public boolean drop(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AnggotaSimpan> binding() {
        return this.asdao.getAll();
    }

    @Override
    public List<AnggotaSimpan> bindingsort(String category, String sort) {
        return this.asdao.getAll(category, sort);
    }

    @Override
    public List<AnggotaSimpan> find(String category, String Data) {
        return this.asdao.search(category, Data);
    }

    @Override
    public AnggotaSimpan findbyId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
