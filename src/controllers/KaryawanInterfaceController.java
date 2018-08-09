/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Karyawan;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface KaryawanInterfaceController {

    public boolean save(String kdKaryawan, String namaKaryawan, String alamat, String telepon, String password);

    public boolean edit(String kdKaryawan, String namaKaryawan, String alamat, String telepon, String password);

    public boolean drop(String id);

    public List<Karyawan> binding();

    public List<Karyawan> bindingsort(String category, String sort);

    public List<Karyawan> find(String category, String data);

    public Karyawan findBy(String id);
    public boolean getLogins(String kdLogin, String PassLogin);
}
