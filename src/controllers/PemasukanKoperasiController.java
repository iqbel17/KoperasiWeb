/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.PemasukanKoperasiDAO;
import daos.SimpananDAO;
import entities.Pemasukankoperasi;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class PemasukanKoperasiController implements PemasukanKoperasiInterface{
private Pemasukankoperasi pemasukankoperasi;
private PemasukanKoperasiDAO pkdao;
private SimpananDAO sdao;

    public PemasukanKoperasiController(Connection connection) {
        this.pkdao = new PemasukanKoperasiDAO(connection);
        this.sdao = new SimpananDAO(connection);
    }

 
    @Override
    public boolean edit(String kdmasukKoperasi, String namaPemasukan) {
        return this.pkdao.update(new Pemasukankoperasi(kdmasukKoperasi, namaPemasukan));
  }  



    @Override
    public List<Pemasukankoperasi> binding() {
      return this.pkdao.getAll();
      }

    @Override
    public List<Pemasukankoperasi> bindingsort(String category, String sort) {
       return this.pkdao.getAll(category, sort);
     }

    @Override
    public List<Pemasukankoperasi> find(String category, String Data) {
          return this.pkdao.search(category, Data);
   }

    @Override
    public Pemasukankoperasi findbyId(String id) {
          return this.pkdao.getById(id);
   
    }

    @Override
    public boolean save(String kdmasukkoperasi, String namaPemasukan, String nominalMasuk) {
        return this.pkdao.insert(new Pemasukankoperasi(kdmasukkoperasi,namaPemasukan,Integer.parseInt(nominalMasuk)));
                }
    
    
    
}
