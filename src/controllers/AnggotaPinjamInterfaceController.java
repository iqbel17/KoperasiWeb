/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AnggotaPinjam;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Gusma
 */
public interface AnggotaPinjamInterfaceController {

    public boolean save( String kdAnggota, String kdKaryawan, String namaJaminan, int nominalPinjam, int jangkaWaktu);

    public boolean edit(String kdAnggotaP, String kdAnggota, String kdKaryawan, String namaJaminan);

    public boolean drop(String id);

    public List<AnggotaPinjam> binding();

    public List<AnggotaPinjam> bindingsort(String category, String sort);

    public List<AnggotaPinjam> find(String category, String data);

    public AnggotaPinjam findById(String id);
}
