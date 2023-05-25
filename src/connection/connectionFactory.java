package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe de Conexaõ com o Banco de Dados... atualmente usado MySQL
 * 
 */
public class connectionFactory {
    
//Início da classe de conexão//
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/data?";
    private static final String USER = "root";
    private static final String PASS = "73232727";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
                return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con){
        
        if (con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pstmt){
        
        if (pstmt != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
        
        closeConnection(con);
    }
    public static void closeConnection(Connection con, PreparedStatement pstmt, ResultSet rs){
        
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ ex);
            }
        }
        
        closeConnection(con, pstmt);
    } 
    
}