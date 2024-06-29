/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 62821
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost/aplikasir";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
            return rs;
    }
    
    public void query (String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deleteMainan(int id) {
        String query = "DELETE FROM mainan WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " tidak ditemukan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deleteMakanan(int id) {
        String query = "DELETE FROM makanan WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " tidak ditemukan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deleteMinuman(int id) {
        String query = "DELETE FROM minuman WHERE id = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " berhasil dihapus.");
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan ID " + id + " tidak ditemukan.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateMainan(int id, String nama, int harga, int jumlah, String bahan) {
        String query = "UPDATE mainan SET nama=?, harga=?, jumlah=?, bahan=? WHERE id=?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, nama);
            statement.setInt(2, harga);
            statement.setInt(3, jumlah);
            statement.setString(4, bahan);
            statement.setInt(5, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateMakanan(int id, String nama, int harga, int jumlah, Date kadaluarsa, String status) {
        String query = "UPDATE makanan SET nama=?, harga=?, jumlah=?, kadaluarsa=?, status=? WHERE id=?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, nama);
            statement.setInt(2, harga);
            statement.setInt(3, jumlah);
            statement.setDate(4, kadaluarsa);
            statement.setString(5, status);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void updateMinuman(int id, String nama, int harga, int jumlah, Date kadaluarsa, String status) {
        String query = "UPDATE minuman SET nama=?, harga=?, jumlah=?, kadaluarsa=?, status=? WHERE id=?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, nama);
            statement.setInt(2, harga);
            statement.setInt(3, jumlah);
            statement.setDate(4, kadaluarsa);
            statement.setString(5, status);
            statement.setInt(6, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ArrayList<String> getNamaMainan() {
        ArrayList<String> listNamaMainan = new ArrayList<>();
        String query = "SELECT nama FROM mainan";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                listNamaMainan.add(rs.getString("nama"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return listNamaMainan;
    }
}
