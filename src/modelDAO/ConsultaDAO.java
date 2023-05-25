/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDAO;

import connection.connectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe responsável por exibir/filtrar informações que aparecem 
 * @author User---                                                      
 */
public class ConsultaDAO {
    
    private static Connection con = null;
    /**
     * Exibe toda a tabela com as informações do clientes
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTabelaClientes() throws SQLException   {
        
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
          "SELECT id_clientes,pes_razaoS,pes_apelido,pes_clienteM,pes_iE,pes_cnpj,pes_cidadeF,pes_ufF FROM db_cadastro.clientes ");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    /**
     * Exibe a tabela filtrando com o tipo e arg 
     * @param tipo
     * @param arg
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTelaClientes(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        
        
        PreparedStatement pstmt = con.prepareStatement( 
                "SELECT id_clientes, pes_razaoS, pes_apelido, pes_clienteM, pes_iE, pes_cnpj, pes_cidadeF, pes_ufF FROM db_cadastro.clientes  where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                  
    }
    
    //fim Consulta Clientes

    
    
    //Inicio Consulta Transportadora
    /**
     * Gera toda a tabela, com todas as transportadoras
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTabelaTransportadora() throws SQLException
            
    {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT id_transportadora,tra_razaoS,tra_cnpj,tra_cidade,tra_uf,tra_status FROM db_cadastro.transportadora");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    /**
     * Filtra com os parametros e exibe a transportadora pedida
     * @param tipo
     * @param arg
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTelaTransportadora(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
                "SELECT id_transportadora,tra_razaoS,tra_cnpj,tra_cidade,tra_uf,tra_status FROM db_cadastro.transportadora where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                      
    } //FIM Consulta Transportadora
    
    
    //Inicio Consulta PRODUTOS
    /**
     * exibe todos os produtos em uma tabela
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTabelaProdutos() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT id_produtos,pro_descri,pro_grupo,pro_linha,pro_material,pro_dureza FROM db_cadastro.produtos");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
    
    /**
     * filtra pelos parametros e exibe o produto selecionado na tabela
     * @param tipo
     * @param arg
     * @return
     * @throws SQLException 
     */
    public static ResultSet carregaTelaProdutos(String tipo,String arg) throws SQLException
            
    {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
       PreparedStatement pstmt = con.prepareStatement(  
                "SELECT id_produtos, pro_descri, pro_grupo, pro_linha, pro_material, pro_dureza FROM db_cadastro.produtos where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
            return rs;
                     
         
    } // FIM Consulta PRODUTOS
    
    //FICHAO
    /**
     * inicializa a tabela fichao
     * @return
     * @throws SQLException 
     */
        public static ResultSet carregaTabelaFicha() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT  "
                        + " pes_vende, pes_atende, pes_prosp,"          
                        + " pes_Transp1, pes_Transp2, pes_Transp3,"                   
                        + " pes_frete,"      
                        + " pes_quemFatu1, pes_quemFatu2, pes_quemFatu3,"                   
                        + " pes_contaOr, pes_tipoSaida,"                  
                        + " pes_porcen, pes_altePreco, pes_descri,"                       
                        + " pes_fusao,"
                        + " pes_pra, pes_zo, pes_de, pes_pa, pes_ga, pes_men, pes_to,"                       
                        + " pes_formaPagto, pes_banco,"
                        + " pes_pec, pes_ped,"                        
                        + " pes_mesmoEm, pes_maiorVal, pes_menorChequ, pes_prazoMChe, pes_pesarAguar,"
                        + " pes_credi, pes_chePorPro, pes_chePor3,"
                        + " pes_restri,"
                        + " pes_matFinal, pes_matPrima,"
                        + " pes_chapaComMin, pes_chapaComMax, pes_chapaEspesMin, pes_chapaEspesMax, pes_chapaLargMin, pes_chapaLargMax,"
                        + " pes_bobiEspesMin, pes_bobiEspesMax, pes_bobiLargMin, pes_bobiLargMax,"
                        + " pes_discDiamMin, pes_discDiamMax, pes_discEspesMin, pes_discEspesMax,"
                        + " pes_porF0F1Min, pes_porF0F1Max, pes_porKgMin, pes_porKgMax," 
                        + " pes_fluxoA, pes_fluxoB, pes_fluxoC, pes_fluxoD, pes_fluxoE, pes_fluxoF,"
                        + " pes_descriKNfe, pes_observacao1, pes_observacao2, pes_observacao3, id_cliente, id_fichao "
                        + "FROM db_cadastro.fichao");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela
   
     //Inicio Consulta PRODUTOS
        /**
         * filtra pelo ID do clientes, e exibe o fichao do cliente com o id selecionado
         * @param tipo
         * @param arg
         * @return
         * @throws SQLException 
         */
    public static ResultSet carregaTelaFichao(String tipo,String arg) throws SQLException {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
        
        "SELECT "
                        + " pes_vende, pes_atende, pes_prosp,"
                        + " pes_Transp1, pes_Transp2, pes_Transp3,"                 
                        + " pes_frete," 
                        + " pes_quemFatu1, pes_quemFatu2, pes_quemFatu3,"
                        + " pes_contaOr, pes_tipoSaida,"
                        + " pes_porcen, pes_altePreco, pes_descri,"
                        + " pes_fusao,"
                        + " pes_pra, pes_zo, pes_de, pes_pa, pes_ga, pes_men, pes_to,"
                        + " pes_formaPagto, pes_banco,"
                        + " pes_pec, pes_ped,"
                        + " pes_mesmoEm, pes_maiorVal, pes_menorChequ, pes_prazoMChe, pes_pesarAguar,"
                        + " pes_credi, pes_chePorPro, pes_chePor3,"
                        + " pes_restri,"
                        + " pes_matFinal, pes_matPrima,"
                        + " pes_chapaComMin, pes_chapaComMax, pes_chapaEspesMin, pes_chapaEspesMax, pes_chapaLargMin, pes_chapaLargMax,"
                        + " pes_bobiEspesMin, pes_bobiEspesMax, pes_bobiLargMin, pes_bobiLargMax,"
                        + " pes_discDiamMin, pes_discDiamMax, pes_discEspesMin, pes_discEspesMax,"
                        + " pes_porF0F1Min, pes_porF0F1Max, pes_porKgMin, pes_porKgMax," 
                        + " pes_fluxoA, pes_fluxoB, pes_fluxoC, pes_fluxoD, pes_fluxoE, pes_fluxoF,"
                        + " pes_descriKNfe, pes_observacao1, pes_observacao2, pes_observacao3, id_cliente, id_fichao "
                        + " FROM db_cadastro.fichao where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela

    
    //ALTERAÇÂO DE PRECO
    
    /**
     * exibe todos os preços... não esta sendo utilizado essa classe
     * @return
     * @throws SQLException 
     */
            public static ResultSet carregaTabelaPreco() throws SQLException {
        con = connectionFactory.getConnection();
        PreparedStatement pstmt = con.prepareStatement(
        
        "SELECT pre_data, pre_valor"              
                        + " FROM db_cadastro.preco ");
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela PRECO
    
       /**
        * Exibe o histórico de preço, sendo filtrado pela linha do fichao selecionada
        * @param tipo
        * @param arg
        * @return
        * @throws SQLException 
        */
            public static ResultSet carregaTelaPreco(String tipo,String arg) throws SQLException {
        String argumento=tipo+" "+"like '%"+arg+"%'"; 
        
        PreparedStatement pstmt = con.prepareStatement( 
        
        "SELECT pre_data, pre_valor"
                        + " FROM db_cadastro.preco where " +argumento+ "");
        
        ResultSet rs = pstmt.executeQuery();
                return rs;
    } //fim metodo carregar tabela preco
        
} // fim consultadao
