/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class DBConnection {
    public static Connection connect() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cinema_system",
                "root",
                "181960hobyou#00#p18"
            );
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
