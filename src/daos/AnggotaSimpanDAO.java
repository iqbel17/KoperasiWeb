/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.AnggotaSimpan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iqbael17
 */
public class AnggotaSimpanDAO implements AnggotaSimpanInterfaceDAO {

    private Connection connection;

    public AnggotaSimpanDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * fungsi inert anggota simpan
     *
     * @param anggotaSimpan
     * @return
     */
    @Override
    public boolean insert(AnggotaSimpan anggotaSimpan) {
        boolean flag = false;
        String query = "INSERT INTO Anggota_simpan VALUES(?,'S01',?,?,sysdate,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, anggotaSimpan.getKdAnggotaSimpan());
            preparedStatement.setString(2, anggotaSimpan.getKdAnggota());
            preparedStatement.setString(3, anggotaSimpan.getKdKaryawan());
            preparedStatement.setInt(4, anggotaSimpan.getNominal());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;

    }
    /**
     * fungsi anggota melakukan penyimpanan
     * @param anggotaSimpan
     * @return 
     */
    @Override
    public boolean update(AnggotaSimpan anggotaSimpan) {
        try {
            String query = "UPDATE Anggota_simpan SET kd_anggota=?,"
                    + "kd_karyawan=?, tgl_simpan = sysdate, nominal=?"
                    + " WHERE kd_anggotasimpan=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, anggotaSimpan.getKdAnggota());
            preparedStatement.setString(2, anggotaSimpan.getKdKaryawan());
            preparedStatement.setInt(3, anggotaSimpan.getNominal());
            preparedStatement.setString(4, anggotaSimpan.getKdAnggotaSimpan());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * 
     * @param id
     * @return 
     */
    @Override
    public boolean delete(String id) {

        try {
            String query = "DELETE FROM Anggota_simpan Where kd_anggotasimpan=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<AnggotaSimpan> getAll() {

        List<AnggotaSimpan> datas = new ArrayList<>();
        String query = "SELECT *From Anggota_simpan";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                AnggotaSimpan anggotaSimpan = new AnggotaSimpan();
                anggotaSimpan.setKdAnggotaSimpan(rs.getString(1));
                anggotaSimpan.setKdSimpanan(rs.getString(2));
                anggotaSimpan.setKdAnggota(rs.getString(3));
                anggotaSimpan.setKdKaryawan(rs.getString(4));
                anggotaSimpan.setTglSimpan(rs.getDate(5));
                anggotaSimpan.setNominal(rs.getInt(6));

                datas.add(anggotaSimpan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
    }

    @Override
    public List<AnggotaSimpan> getAll(String category, String sort) {
        List<AnggotaSimpan> datas = new ArrayList<>();
        String query = "SELECT *FROM Anggota_simpan ORDER BY " + category + " " + sort;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                AnggotaSimpan anggotaSimpan = new AnggotaSimpan();
                anggotaSimpan.setKdAnggotaSimpan(rs.getString(1));
                anggotaSimpan.setKdSimpanan(rs.getString(2));
                anggotaSimpan.setKdAnggota(rs.getString(3));
                anggotaSimpan.setKdKaryawan(rs.getString(4));
                anggotaSimpan.setTglSimpan(rs.getDate(5));
                anggotaSimpan.setNominal(rs.getInt(5));
                datas.add(anggotaSimpan);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;

    }

    @Override
    public List<AnggotaSimpan> search(String category, String data) {

        List<AnggotaSimpan> datas = new ArrayList<>();
        String query = "SELECT kd_anggotasimpan,kd_anggota,tgl_simpan,nominal FROM Anggota_simpan WHERE " + category + " " + " like '%" + data + "%'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                AnggotaSimpan anggotaSimpan = new AnggotaSimpan();
                anggotaSimpan.setKdAnggotaSimpan(rs.getString(1));
                anggotaSimpan.setKdAnggota(rs.getString(2));
                anggotaSimpan.setTglSimpan(rs.getDate(3));
                anggotaSimpan.setNominal(rs.getInt(4));
                datas.add(anggotaSimpan);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;

    }

    @Override
    public AnggotaSimpan getById(String id) {

        AnggotaSimpan anggotaSimpan = new AnggotaSimpan();
        String query = "SELECT *FROM Anggota_simpan WHERE kd_anggotasimpan = '" + id + "'";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                anggotaSimpan.setKdAnggotaSimpan(rs.getString(1));
                anggotaSimpan.setKdSimpanan(rs.getString(2));
                anggotaSimpan.setKdAnggota(rs.getString(3));
                anggotaSimpan.setKdKaryawan(rs.getString(4));
                anggotaSimpan.setNominal(rs.getInt(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnggotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return anggotaSimpan;
    }

}
