/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import entities.Pemasukankoperasi;
/**
 *
 * @author iqbael17
 */
public interface PemasukanKoperasiInterface  {
    public boolean save(String kdmasukkoperasi, String namaPemasukan, String nominalMasuk);
    public boolean edit(String kdmasukkoperasi, String namaPemasukan);
    public List<Pemasukankoperasi> binding();
    public List<Pemasukankoperasi> bindingsort(String category, String sort);
    public List<Pemasukankoperasi> find(String category, String Data);
    public Pemasukankoperasi findbyId(String id);
}
