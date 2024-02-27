/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.loundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class koneksi2 {
    public static Connection con;
    public static Statement stm;
    
    
    public void koneksimysql() throws ClassNotFoundException, SQLException{
        try{
            String url ="jdbc:mysql://localhost/db_loundry";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = {connection} DriverManager.getConnection(url,user,pass);
            stm = {statement} con.createStatement();
            JOptionPane.showMessageDialog(null, "Berhasil koneksi");
                    
        }catch (Exception e){
            System.err.println("Koneksi gagal"+ e.getMessage());
        }
    }
    
    
}
