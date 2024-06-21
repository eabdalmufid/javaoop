package mysql;

import java.sql.*;

public class BelajarJavaMysql {
    // menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    // menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        // melakukan koneksi ke database
        // harus dibungkus dalam block try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);

            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // buat objek statement
            stmt = conn.createStatement();

            // buat query ke database
            String sql = "SELECT * FROM buku";

            // eksekusi query dan simpan hasilnya di obj Result
            rs = stmt.executeQuery(sql);

            // tampilkan hasil query
            while(rs.next()){
                System.out.println("ID BUku   : " + rs.getInt("id_buku"));
                System.out.println("Judul     : " + rs.getString("judul"));
                System.out.println("Pengarang : " + rs.getString("pengarang"));
            }

            stmt.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}