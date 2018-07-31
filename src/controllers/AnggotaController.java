/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AnggotaDAO;
import entities.Anggota;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class AnggotaController implements AnggotaInterfaceController{
  private AnggotaDAO adao;

 public AnggotaController(Connection connection) {
        this.adao = new AnggotaDAO(connection);
    }
  
  
    @Override
    public boolean save(String kdAnggota, String NmAnggota, String Jk, String telepon, String Alamat) {
       return this.adao.insert(new Anggota(kdAnggota, NmAnggota, Jk, telepon, Alamat));
   }

    @Override
    public boolean edit(String kdAnggota, String NmAnggota, String Jk, String telepon, String Alamat) {
  return this.adao.update(new Anggota(kdAnggota, NmAnggota, Jk, telepon, Alamat));
    }

    @Override
    public boolean drop(int id) {
            return this.adao.delete(id);
    }

    @Override
    public List<Anggota> binding() {
        return this.adao.getAll();
    }

    @Override
    public List<Anggota> bindingsort(String category, String sort) {
         return this.adao.getAll(category, sort);
    }

    @Override
    public List<Anggota> find(String category, String Data) {
        return this.adao.search(category, Data);
    }

    @Override
    public Anggota findbyId(int id) {
          return this.adao.getById(id); 
    }
 }