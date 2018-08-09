/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;


import entities.Simpanan;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface SimpananInterfaceDAO {
    public List<Simpanan> getAll();
    public List<Simpanan> getAll(String category,String sort);
    public List<Simpanan> search(String category,String data);
}
