/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Anggota;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface AnggotaInterfaceController {
    public boolean save( String NmAnggota,  String telepon, String Alamat);
    public boolean edit( String NmAnggota,  String telepon, String Alamat);
    public boolean drop (String id);
    public List<Anggota> binding();
    public List<Anggota> bindingsort(String category, String sort);
    public List<Anggota> find(String category, String Data);
    public Anggota findbyId(String id);
    
}
