/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Simpanan;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface SimpananInterfaceController {
    public List<Simpanan> binding();
    public List<Simpanan> bindingsort(String category, String sort);
    public List<Simpanan> find(String category, String Data);
   
}
