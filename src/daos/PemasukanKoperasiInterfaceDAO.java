/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import entities.Pemasukankoperasi;
/**
 *
 * @author iqbael17
 */
public interface PemasukanKoperasiInterfaceDAO {
    public boolean insert(Pemasukankoperasi pemasukankoperasi);
    public boolean update(Pemasukankoperasi pemasukankoperasi);
    public List<Pemasukankoperasi> getAll();
    public List<Pemasukankoperasi> getAll(String category,String sort);
    public List<Pemasukankoperasi> search(String category,String data);
    public Pemasukankoperasi getById(String id);
}
