/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Karyawan;
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
 * @author Gusma
 */
public class KaryawanDAO implements KaryawanInterfaceDAO {

    private Connection connection;

    public KaryawanDAO(Connection connection) {
        this.connection = connection;
    }
    /**
     * Function Insert
     * @param karyawan Karyawan
     * @return flag
     */
    @Override
    public boolean insert(Karyawan karyawan) {
        boolean flag = false;
        String query = "INSERT INTO Karyawan VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, karyawan.getKdKaryawan());
            preparedStatement.setString(2, karyawan.getNamaaKaryawan());
            preparedStatement.setString(3, karyawan.getAlamat());
            preparedStatement.setString(4, karyawan.getTelepon());
            preparedStatement.setString(5, karyawan.getPassword());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    @Override
    public boolean update(Karyawan karyawan) {
        String query = "UPDATE KARYAWAN SET namaa_karyawan=?,alamat=?,telepon=?,password=? WHERE kd_karyawan=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, karyawan.getNamaaKaryawan());
            preparedStatement.setString(2, karyawan.getAlamat());
            preparedStatement.setString(3, karyawan.getTelepon());
            preparedStatement.setString(4, karyawan.getPassword());
            preparedStatement.setString(5, karyawan.getKdKaryawan());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            String query = "DELETE FROM Karyawan WHERE kd_karyawan=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Karyawan> getAll() {
        List<Karyawan> datas = new ArrayList<>();
        String query = "SELECT * FROM Karyawan";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setKdKaryawan(rs.getString("kd_karyawan"));
                karyawan.setNamaKaryawan(rs.getString("namaa_karyawan"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setTelepon(rs.getString("telepon"));
                karyawan.setPassword(rs.getString("password"));
                datas.add(karyawan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Karyawan> getAllCs(String category, String sort) {
        List<Karyawan> datas = new ArrayList<>();
        String query = "SELECT * FROM Karyawan ORDER BY " + category + " " + sort;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setKdKaryawan(rs.getString("kd_karyawan"));
                karyawan.setNamaKaryawan(rs.getString("namaa_karyawan"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setTelepon(rs.getString("telepon"));
                karyawan.setPassword(rs.getString("password"));
                datas.add(karyawan);
            }

        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Karyawan> search(String category, String data) {
        List<Karyawan> datas = new ArrayList<>();
        String query = "SELECT * FROM Karyawan WHERE " + category + " LIKE '%" + data + "%'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Karyawan karyawan = new Karyawan();
                karyawan.setKdKaryawan(rs.getString("kd_karyawan"));
                karyawan.setNamaKaryawan(rs.getString("namaa_karyawan"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setTelepon(rs.getString("telepon"));
                karyawan.setPassword(rs.getString("password"));
                datas.add(karyawan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public Karyawan getById(String id) {
        Karyawan karyawan = new Karyawan();
        String query = "SELECT * FROM Karyawan WHERE kd_karyawan='"+id+"'";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                karyawan.setKdKaryawan(rs.getString("kd_karyawan"));
                karyawan.setNamaKaryawan(rs.getString("namaa_karyawan"));
                karyawan.setAlamat(rs.getString("alamat"));
                karyawan.setTelepon(rs.getString("telepon"));
                karyawan.setPassword(rs.getString("password"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return karyawan;
    }

    @Override
    public boolean getLogin(String kdKaryawan, String passLogin) {
        
        try {
            String query = "SELECT *From karyawan where kd_karyawan=? and password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, kdKaryawan);
            preparedStatement.setString(2, passLogin);
        return true;
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
