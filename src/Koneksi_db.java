/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author giaaa
 */
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi_db {
    public static Connection conn;

    public static void openConnection() {
        try {
            // Use the updated MySQL driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3310/java_perpustakaan";
            // No need to cast to a specific driver connection, use the general Connection type
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error: " + e.getMessage());
        }
    }

    // Method removed as it was incorrectly declared and not necessary

  // Method to get the connection object
    public static Connection getConnection() {
        if (conn == null) {
            openConnection(); // Open the connection if it's not already open
        }
        return conn;
    }
}
