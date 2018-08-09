/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Karyawan;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface KaryawanInterfaceDAO {
    public boolean insert(Karyawan karyawan);

    public boolean update(Karyawan karyawan);

    public boolean delete(String id);

    public List<Karyawan> getAll();
    
    public boolean getLogin(String kdKaryawan, String passLogin);

    public List<Karyawan> getAllCs(String category, String sort);

    public List<Karyawan> search(String category, String data);

    public Karyawan getById(String id);
    
    
}
