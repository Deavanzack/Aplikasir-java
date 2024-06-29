/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Classes.Database.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 62821
 */
public class User {
    private int id;
    private String nama;
    private String username;
    private String password;
    private String no_hp;
    
    public User(int id, String nama, String username, String password, String no_hp) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.no_hp = no_hp;
    }
    
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNo_hp() {
        return no_hp;
    }
    
    public void insert_user() throws SQLException{ 
        Database db = new Database(); 
 
        String sql = "insert into user values ('"+this.getId()+"','"+this.getNama()+"','"+this.getUsername()+"','"+this.getPassword()+"',+'"+this.getNo_hp()+"')"; 
        db.query(sql); 
    }
    
    public boolean authenticateUser(String username, String password) {
        try{
           Database db = new Database();
           String sql = "SELECT password FROM user WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String dbPassword = rs.getString("password");
                return password.equals(dbPassword);
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Pastikan Username dan Password Benar");
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
