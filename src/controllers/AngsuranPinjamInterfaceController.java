/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AngsuranPinjam;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AngsuranPinjamInterfaceController {
    public boolean save(String kdAngsuran, String kdAnggota);

    public boolean edit(String kdAngsuran, String kdAnggotaP,  Date tglAngsur, int jumlahAngsuran, String status);

    public boolean drop(String id);

    public List<AngsuranPinjam> binding();

    public List<AngsuranPinjam> bindingsort(String category, String sort);

    public List<AngsuranPinjam> find(String category, String data);

    public AngsuranPinjam findById(String id);
}
