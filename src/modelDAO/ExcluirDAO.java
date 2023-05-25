/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe excluir
 * @author User
 */
public class ExcluirDAO {

    private Connection con = null;

    public ExcluirDAO() {
        con = connectionFactory.getConnection();
    }
    
    /**
     * exluir clienTE com base no ID
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirClientes(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.clientes  WHERE id_clientes = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir transportadora com base no ID
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirTransportadora(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.transportadora WHERE id_transportadora = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    
    /**
     * Excluir com base no nome de usuario
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirUsuario(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.login WHERE id_login = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir produto com base no ID
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirProdutos(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM produtos WHERE id_produtos = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir a linha do fichao com base no codigo referente a linha
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirLinhaFichao(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.fichao WHERE id_fichao = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        connectionFactory.closeConnection(con);

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir todo o fichao de determinhado cliente com base no ID do cliente
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirFichaoCliente(int cod) throws SQLException {
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.fichao WHERE id_cliente = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir todo o histórico de preços de um cliente com base no id do cliente
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirPreco(int cod) throws SQLException {
        
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.preco WHERE id_cliente = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * excluir o hitorico de preços de determinada linha do fichao, com base no id referencial ao fichao
     * @param cod
     * @return
     * @throws SQLException 
     */
    public boolean ExcluirLinhaPreco(int cod) throws SQLException {
        
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("DELETE FROM db_cadastro.preco WHERE id_Lfichao = ?")) {
            pstmt.setInt(1, cod);
            registros = pstmt.executeUpdate();
        }

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }
    
} //fim do código
