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
import model.clientes;
import model.login;
import model.produtos;
import model.transportadora;
import model.fichao;
import model.preco;

/**
 * Incluir e Editar dados
 *
 * @author User
 */
public class IncluirEditarDAO {

    private Connection con = null;


    clientes objpes;
    transportadora objtra;
    login objlog;
    produtos objpro;
    fichao objfic;
    preco objpre;

    public IncluirEditarDAO() {
        this.objpes = new clientes();
        this.objtra = new transportadora();
        this.objlog = new login();
        this.objpro = new produtos();
        this.objfic = new fichao();
        this.objpre = new preco();
    }

    /**
     * incluir dados do cliente no banco de dados, gerando um novo id
     *
     * @param objpes
     * @return
     * @throws SQLException
     */
    public int IncluirClientes(clientes objpes) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.clientes  ("
                + " pes_razaoS, pes_apelido, pes_clienteM, pes_iE, pes_cnpj, pes_status,"
                + " pes_tipoConsu, pes_ramo, pes_codSuframa, pes_codPais, pes_venciDupli,"
                + " pes_telFixo, pes_telCel, pes_telW,"
                + " pes_mailCon, pes_mailXml, pes_endWeb,"
                + " pes_vende, pes_atende, pes_prosp, pes_disc, pes_chapa, pes_bobi,"
                + " pes_cepF, pes_telF, pes_codIbgeF, pes_ufF, pes_cidadeF, pes_ruaF, pes_complF, pes_bairroF, pes_numF,"
                + " pes_cepE, pes_telE, pes_codIbgeE, pes_ufE, pes_cidadeE, pes_ruaE, pes_complE, pes_bairroE, pes_numE,"
                + " pes_cepC, pes_telC, pes_codIbgeC, pes_ufC, pes_cidadeC, pes_ruaC, pes_complC, pes_bairroC, pes_numC,"
                + " pes_codT1, pes_razaoST1, pes_cnpjT1, pes_iET1, pes_apelidoT1,"
                + " pes_endWebT1, pes_telFixoT1, pes_mailConT1, pes_telCelT1,"
                + " pes_ruaT1, pes_numT1, pes_complT1, pes_bairroT1, pes_cepT1, pes_cidadeT1, pes_ufT1, pes_codIbgeT1,"
                + " pes_empiT1, pes_platT1, pes_horAtendT1, pes_contatoT1,"
                + " pes_codT2, pes_razaoST2, pes_cnpjT2, pes_iET2, pes_apelidoT2,"
                + " pes_endWebT2, pes_telFixoT2, pes_mailConT2, pes_telCelT2,"
                + " pes_ruaT2, pes_numT2, pes_complT2, pes_bairroT2, pes_cepT2, pes_cidadeT2, pes_ufT2, pes_codIbgeT2,"
                + " pes_empiT2, pes_platT2, pes_horAtendT2, pes_contatoT2,"
                + " pes_codT3, pes_razaoST3, pes_cnpjT3, pes_iET3, pes_apelidoT3,"
                + " pes_endWebT3, pes_telFixoT3, pes_mailConT3, pes_telCelT3,"
                + " pes_ruaT3, pes_numT3, pes_complT3, pes_bairroT3, pes_cepT3, pes_cidadeT3, pes_ufT3, pes_codIbgeT3,"
                + " pes_empiT3, pes_platT3, pes_horAtendT3, pes_contatoT3,"
                + " pes_dtcadastro, pes_quemCad "
                + ") VAlUES ("
                + "?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, "
                + "?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ? )")) {

            pstmt.setString(1, objpes.getPes_razaoS().toUpperCase().trim());
            pstmt.setString(2, objpes.getPes_apelido().toUpperCase().trim());
            pstmt.setString(3, objpes.getPes_clienteM().toUpperCase().trim());
            pstmt.setString(4, objpes.getPes_iE().trim());
            pstmt.setString(5, objpes.getPes_cnpj().trim());
            pstmt.setInt(6, objpes.getPes_status());
            pstmt.setString(7, objpes.getPes_tipoConsu().trim());
            pstmt.setString(8, objpes.getPes_ramo().trim());
            pstmt.setString(9, objpes.getPes_codSuframa().trim());
            pstmt.setString(10, objpes.getPes_codPais().trim());
            pstmt.setString(11, objpes.getPes_venciDupli().trim());

            pstmt.setString(12, objpes.getPes_telFixo().trim());
            pstmt.setString(13, objpes.getPes_telCel().trim());
            pstmt.setString(14, objpes.getPes_telW().trim());

            pstmt.setString(15, objpes.getPes_mailCon().toLowerCase().trim());
            pstmt.setString(16, objpes.getPes_mailXml().toLowerCase().trim());
            pstmt.setString(17, objpes.getPes_endWeb().toLowerCase().trim());

            pstmt.setString(18, objpes.getPes_vende().toUpperCase().trim());
            pstmt.setString(19, objpes.getPes_atende().toUpperCase().trim());
            pstmt.setString(20, objpes.getPes_prosp().toUpperCase().trim());
            pstmt.setString(21, objpes.getPes_disc().toUpperCase().trim());
            pstmt.setString(22, objpes.getPes_chapa().toUpperCase().trim());
            pstmt.setString(23, objpes.getPes_bobi().toUpperCase().trim());

            pstmt.setString(24, objpes.getPes_cepF().trim());
            pstmt.setString(25, objpes.getPes_telF().trim());
            pstmt.setString(26, objpes.getPes_codIbgeF().trim());
            pstmt.setString(27, objpes.getPes_ufF().trim());
            pstmt.setString(28, objpes.getPes_cidadeF().toUpperCase().trim());
            pstmt.setString(29, objpes.getPes_ruaF().toUpperCase().trim());
            pstmt.setString(30, objpes.getPes_complF().toUpperCase().trim());
            pstmt.setString(31, objpes.getPes_bairroF().toUpperCase().trim());
            pstmt.setString(32, objpes.getPes_numF().trim());

            pstmt.setString(33, objpes.getPes_cepE().trim());
            pstmt.setString(34, objpes.getPes_telE().trim());
            pstmt.setString(35, objpes.getPes_codIbgeE().trim());
            pstmt.setString(36, objpes.getPes_ufE().trim());
            pstmt.setString(37, objpes.getPes_cidadeE().toUpperCase().trim());
            pstmt.setString(38, objpes.getPes_ruaE().toUpperCase().trim());
            pstmt.setString(39, objpes.getPes_complE().toUpperCase().trim());
            pstmt.setString(40, objpes.getPes_bairroE().toUpperCase().trim());
            pstmt.setString(41, objpes.getPes_numE().trim());

            pstmt.setString(42, objpes.getPes_cepC().trim());
            pstmt.setString(43, objpes.getPes_telC().trim());
            pstmt.setString(44, objpes.getPes_codIbgeC().trim());
            pstmt.setString(45, objpes.getPes_ufC().trim());
            pstmt.setString(46, objpes.getPes_cidadeC().toUpperCase().trim());
            pstmt.setString(47, objpes.getPes_ruaC().toUpperCase().trim());
            pstmt.setString(48, objpes.getPes_complC().toUpperCase().trim());
            pstmt.setString(49, objpes.getPes_bairroC().toUpperCase().trim());
            pstmt.setString(50, objpes.getPes_numC().trim());

            pstmt.setString(51, objpes.getPes_codT1().trim());
            pstmt.setString(52, objpes.getPes_razaoST1().toUpperCase().trim());
            pstmt.setString(53, objpes.getPes_cnpjT1().trim());
            pstmt.setString(54, objpes.getPes_iET1().trim());
            pstmt.setString(55, objpes.getPes_apelidoT1().trim());

            pstmt.setString(56, objpes.getPes_endWebT1().trim());
            pstmt.setString(57, objpes.getPes_telFixoT1().trim());
            pstmt.setString(58, objpes.getPes_mailConT1().trim());
            pstmt.setString(59, objpes.getPes_telCelT1().trim());

            pstmt.setString(60, objpes.getPes_ruaT1().trim());
            pstmt.setString(61, objpes.getPes_numT1().trim());
            pstmt.setString(62, objpes.getPes_complT1().trim());
            pstmt.setString(63, objpes.getPes_bairroT1().trim());
            pstmt.setString(64, objpes.getPes_cepT1().trim());
            pstmt.setString(65, objpes.getPes_cidadeT1().trim());
            pstmt.setString(66, objpes.getPes_ufT1().trim());
            pstmt.setString(67, objpes.getPes_codIbgeT1().trim());

            pstmt.setString(68, objpes.getPes_empiT1().trim());
            pstmt.setString(69, objpes.getPes_platT1().trim());

            pstmt.setString(70, objpes.getPes_horAtendT1().trim());
            pstmt.setString(71, objpes.getPes_contatoT1().trim());

            pstmt.setString(72, objpes.getPes_codT2().trim());
            pstmt.setString(73, objpes.getPes_razaoST2().toUpperCase().trim());
            pstmt.setString(74, objpes.getPes_cnpjT2().trim());
            pstmt.setString(75, objpes.getPes_iET2().trim());
            pstmt.setString(76, objpes.getPes_apelidoT2().trim());

            pstmt.setString(77, objpes.getPes_endWebT2().trim());
            pstmt.setString(78, objpes.getPes_telFixoT2().trim());
            pstmt.setString(79, objpes.getPes_mailConT2().trim());
            pstmt.setString(80, objpes.getPes_telCelT2().trim());

            pstmt.setString(81, objpes.getPes_ruaT2().trim());
            pstmt.setString(82, objpes.getPes_numT2().trim());
            pstmt.setString(83, objpes.getPes_complT2().trim());
            pstmt.setString(84, objpes.getPes_bairroT2().trim());
            pstmt.setString(85, objpes.getPes_cepT2().trim());
            pstmt.setString(86, objpes.getPes_cidadeT2().trim());
            pstmt.setString(87, objpes.getPes_ufT2().trim());
            pstmt.setString(88, objpes.getPes_codIbgeT2().trim());

            pstmt.setString(89, objpes.getPes_empiT2().trim());
            pstmt.setString(90, objpes.getPes_platT2().trim());

            pstmt.setString(91, objpes.getPes_horAtendT2().trim());
            pstmt.setString(92, objpes.getPes_contatoT2().trim());

            pstmt.setString(93, objpes.getPes_codT3().trim());
            pstmt.setString(94, objpes.getPes_razaoST3().toUpperCase().trim());
            pstmt.setString(95, objpes.getPes_cnpjT3().trim());
            pstmt.setString(96, objpes.getPes_iET3().trim());
            pstmt.setString(97, objpes.getPes_apelidoT3().trim());

            pstmt.setString(98, objpes.getPes_endWebT3().trim());
            pstmt.setString(99, objpes.getPes_telFixoT3().trim());
            pstmt.setString(100, objpes.getPes_mailConT3().trim());
            pstmt.setString(101, objpes.getPes_telCelT3().trim());

            pstmt.setString(102, objpes.getPes_ruaT3().trim());
            pstmt.setString(103, objpes.getPes_numT3().trim());
            pstmt.setString(104, objpes.getPes_complT3().trim());
            pstmt.setString(105, objpes.getPes_bairroT3().trim());
            pstmt.setString(106, objpes.getPes_cepT3().trim());
            pstmt.setString(107, objpes.getPes_cidadeT3().trim());
            pstmt.setString(108, objpes.getPes_ufT3().trim());
            pstmt.setString(109, objpes.getPes_codIbgeT3().trim());

            pstmt.setString(110, objpes.getPes_empiT3().trim());
            pstmt.setString(111, objpes.getPes_platT3().trim());

            pstmt.setString(112, objpes.getPes_horAtendT3().trim());
            pstmt.setString(113, objpes.getPes_contatoT3().trim());

            pstmt.setTimestamp(114, new java.sql.Timestamp(objpes.getPes_dtcadastro().getTime()));

            pstmt.setString(115, objpes.getPes_quemCad().trim());

            registros = pstmt.executeUpdate();

        }

        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }

    }//Fim do código Incluir

    /**
     * editar os dados do cliente com base no seu ID
     *
     * @param objpes
     * @return
     * @throws SQLException
     */
    public boolean EditarClientes(clientes objpes) throws SQLException {
        con = connectionFactory.getConnection();
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.clientes set"
                + " pes_razaoS=?, pes_apelido=?, pes_clienteM=?, pes_iE=?, pes_cnpj=?, pes_status=?,"
                + " pes_tipoConsu=?, pes_ramo=?, pes_codSuframa=?, pes_codPais=?, pes_venciDupli=?,"
                + " pes_telFixo=?, pes_telCel=?, pes_telW=?,"
                + " pes_mailCon=?, pes_mailXml=?, pes_endWeb=?,"
                + " pes_vende=?, pes_atende=?, pes_prosp=?, pes_disc=?, pes_chapa=?, pes_bobi=?,"
                + " pes_cepF=?, pes_telF=?, pes_codIbgeF=?, pes_ufF=?, pes_cidadeF=?, pes_ruaF=?, pes_complF=?, pes_bairroF=?, pes_numF=?,"
                + " pes_cepE=?, pes_telE=?, pes_codIbgeE=?, pes_ufE=?, pes_cidadeE=?, pes_ruaE=?, pes_complE=?, pes_bairroE=?, pes_numE=?,"
                + " pes_cepC=?, pes_telC=?, pes_codIbgeC=?, pes_ufC=?, pes_cidadeC=?, pes_ruaC=?, pes_complC=?, pes_bairroC=?, pes_numC=?,"
                + " pes_codT1=?, pes_razaoST1=?, pes_cnpjT1=?, pes_iET1=?, pes_apelidoT1=?,"
                + " pes_endWebT1=?, pes_telFixoT1=?, pes_mailConT1=?, pes_telCelT1=?,"
                + " pes_ruaT1=?, pes_numT1=?, pes_complT1=?, pes_bairroT1=?, pes_cepT1=?, pes_cidadeT1=?, pes_ufT1=?, pes_codIbgeT1=?,"
                + " pes_empiT1=?, pes_platT1=?, pes_horAtendT1=?, pes_contatoT1=?,"
                + " pes_codT2=?, pes_razaoST2=?, pes_cnpjT2=?, pes_iET2=?, pes_apelidoT2=?,"
                + " pes_endWebT2=?, pes_telFixoT2=?, pes_mailConT2=?, pes_telCelT2=?,"
                + " pes_ruaT2=?, pes_numT2=?, pes_complT2=?, pes_bairroT2=?, pes_cepT2=?, pes_cidadeT2=?, pes_ufT2=?, pes_codIbgeT2=?,"
                + " pes_empiT2=?, pes_platT2=?, pes_horAtendT2=?, pes_contatoT2=?,"
                + " pes_codT3=?, pes_razaoST3=?, pes_cnpjT3=?, pes_iET3=?, pes_apelidoT3=?,"
                + " pes_endWebT3=?, pes_telFixoT3=?, pes_mailConT3=?, pes_telCelT3=?,"
                + " pes_ruaT3=?, pes_numT3=?, pes_complT3=?, pes_bairroT3=?, pes_cepT3=?, pes_cidadeT3=?, pes_ufT3=?, pes_codIbgeT3=?,"
                + " pes_empiT3=?, pes_platT3=?, pes_horAtendT3=?, pes_contatoT3=?,"
                + " pes_dtcadastro=?, pes_quemCad=?"
                + " where id_clientes=?")) {

            pstmt.setString(1, objpes.getPes_razaoS().toUpperCase().trim());
            pstmt.setString(2, objpes.getPes_apelido().toUpperCase().trim());
            pstmt.setString(3, objpes.getPes_clienteM().toUpperCase().trim());
            pstmt.setString(4, objpes.getPes_iE().trim());
            pstmt.setString(5, objpes.getPes_cnpj().trim());
            pstmt.setInt(6, objpes.getPes_status());
            pstmt.setString(7, objpes.getPes_tipoConsu().trim());
            pstmt.setString(8, objpes.getPes_ramo().trim());
            pstmt.setString(9, objpes.getPes_codSuframa().trim());
            pstmt.setString(10, objpes.getPes_codPais().trim());
            pstmt.setString(11, objpes.getPes_venciDupli().trim());

            pstmt.setString(12, objpes.getPes_telFixo().trim());
            pstmt.setString(13, objpes.getPes_telCel().trim());
            pstmt.setString(14, objpes.getPes_telW().trim());

            pstmt.setString(15, objpes.getPes_mailCon().toLowerCase().trim());
            pstmt.setString(16, objpes.getPes_mailXml().toLowerCase().trim());
            pstmt.setString(17, objpes.getPes_endWeb().toLowerCase().trim());

            pstmt.setString(18, objpes.getPes_vende().toUpperCase().trim());
            pstmt.setString(19, objpes.getPes_atende().toUpperCase().trim());
            pstmt.setString(20, objpes.getPes_prosp().toUpperCase().trim());
            pstmt.setString(21, objpes.getPes_disc().toUpperCase().trim());
            pstmt.setString(22, objpes.getPes_chapa().toUpperCase().trim());
            pstmt.setString(23, objpes.getPes_bobi().toUpperCase().trim());

            pstmt.setString(24, objpes.getPes_cepF().trim());
            pstmt.setString(25, objpes.getPes_telF().trim());
            pstmt.setString(26, objpes.getPes_codIbgeF().trim());
            pstmt.setString(27, objpes.getPes_ufF().trim());
            pstmt.setString(28, objpes.getPes_cidadeF().toUpperCase().trim());
            pstmt.setString(29, objpes.getPes_ruaF().toUpperCase().trim());
            pstmt.setString(30, objpes.getPes_complF().toUpperCase().trim());
            pstmt.setString(31, objpes.getPes_bairroF().toUpperCase().trim());
            pstmt.setString(32, objpes.getPes_numF().trim());

            pstmt.setString(33, objpes.getPes_cepE().trim());
            pstmt.setString(34, objpes.getPes_telE().trim());
            pstmt.setString(35, objpes.getPes_codIbgeE().trim());
            pstmt.setString(36, objpes.getPes_ufE().trim());
            pstmt.setString(37, objpes.getPes_cidadeE().toUpperCase().trim());
            pstmt.setString(38, objpes.getPes_ruaE().toUpperCase().trim());
            pstmt.setString(39, objpes.getPes_complE().toUpperCase().trim());
            pstmt.setString(40, objpes.getPes_bairroE().toUpperCase().trim());
            pstmt.setString(41, objpes.getPes_numE().trim());

            pstmt.setString(42, objpes.getPes_cepC().trim());
            pstmt.setString(43, objpes.getPes_telC().trim());
            pstmt.setString(44, objpes.getPes_codIbgeC().trim());
            pstmt.setString(45, objpes.getPes_ufC().trim());
            pstmt.setString(46, objpes.getPes_cidadeC().toUpperCase().trim());
            pstmt.setString(47, objpes.getPes_ruaC().toUpperCase().trim());
            pstmt.setString(48, objpes.getPes_complC().toUpperCase().trim());
            pstmt.setString(49, objpes.getPes_bairroC().toUpperCase().trim());
            pstmt.setString(50, objpes.getPes_numC().trim());

            pstmt.setString(51, objpes.getPes_codT1().trim());
            pstmt.setString(52, objpes.getPes_razaoST1().toUpperCase().trim());
            pstmt.setString(53, objpes.getPes_cnpjT1().trim());
            pstmt.setString(54, objpes.getPes_iET1().trim());
            pstmt.setString(55, objpes.getPes_apelidoT1().trim());

            pstmt.setString(56, objpes.getPes_endWebT1().trim());
            pstmt.setString(57, objpes.getPes_telFixoT1().trim());
            pstmt.setString(58, objpes.getPes_mailConT1().trim());
            pstmt.setString(59, objpes.getPes_telCelT1().trim());

            pstmt.setString(60, objpes.getPes_ruaT1().trim());
            pstmt.setString(61, objpes.getPes_numT1().trim());
            pstmt.setString(62, objpes.getPes_complT1().trim());
            pstmt.setString(63, objpes.getPes_bairroT1().trim());
            pstmt.setString(64, objpes.getPes_cepT1().trim());
            pstmt.setString(65, objpes.getPes_cidadeT1().trim());
            pstmt.setString(66, objpes.getPes_ufT1().trim());
            pstmt.setString(67, objpes.getPes_codIbgeT1().trim());

            pstmt.setString(68, objpes.getPes_empiT1().trim());
            pstmt.setString(69, objpes.getPes_platT1().trim());

            pstmt.setString(70, objpes.getPes_horAtendT1().trim());
            pstmt.setString(71, objpes.getPes_contatoT1().trim());

            pstmt.setString(72, objpes.getPes_codT2().trim());
            pstmt.setString(73, objpes.getPes_razaoST2().toUpperCase().trim());
            pstmt.setString(74, objpes.getPes_cnpjT2().trim());
            pstmt.setString(75, objpes.getPes_iET2().trim());
            pstmt.setString(76, objpes.getPes_apelidoT2().trim());

            pstmt.setString(77, objpes.getPes_endWebT2().trim());
            pstmt.setString(78, objpes.getPes_telFixoT2().trim());
            pstmt.setString(79, objpes.getPes_mailConT2().trim());
            pstmt.setString(80, objpes.getPes_telCelT2().trim());

            pstmt.setString(81, objpes.getPes_ruaT2().trim());
            pstmt.setString(82, objpes.getPes_numT2().trim());
            pstmt.setString(83, objpes.getPes_complT2().trim());
            pstmt.setString(84, objpes.getPes_bairroT2().trim());
            pstmt.setString(85, objpes.getPes_cepT2().trim());
            pstmt.setString(86, objpes.getPes_cidadeT2().trim());
            pstmt.setString(87, objpes.getPes_ufT2().trim());
            pstmt.setString(88, objpes.getPes_codIbgeT2().trim());

            pstmt.setString(89, objpes.getPes_empiT2().trim());
            pstmt.setString(90, objpes.getPes_platT2().trim());

            pstmt.setString(91, objpes.getPes_horAtendT2().trim());
            pstmt.setString(92, objpes.getPes_contatoT2().trim());

            pstmt.setString(93, objpes.getPes_codT3().trim());
            pstmt.setString(94, objpes.getPes_razaoST3().toUpperCase().trim());
            pstmt.setString(95, objpes.getPes_cnpjT3().trim());
            pstmt.setString(96, objpes.getPes_iET3().trim());
            pstmt.setString(97, objpes.getPes_apelidoT3().trim());

            pstmt.setString(98, objpes.getPes_endWebT3().trim());
            pstmt.setString(99, objpes.getPes_telFixoT3().trim());
            pstmt.setString(100, objpes.getPes_mailConT3().trim());
            pstmt.setString(101, objpes.getPes_telCelT3().trim());

            pstmt.setString(102, objpes.getPes_ruaT3().trim());
            pstmt.setString(103, objpes.getPes_numT3().trim());
            pstmt.setString(104, objpes.getPes_complT3().trim());
            pstmt.setString(105, objpes.getPes_bairroT3().trim());
            pstmt.setString(106, objpes.getPes_cepT3().trim());
            pstmt.setString(107, objpes.getPes_cidadeT3().trim());
            pstmt.setString(108, objpes.getPes_ufT3().trim());
            pstmt.setString(109, objpes.getPes_codIbgeT3().trim());

            pstmt.setString(110, objpes.getPes_empiT3().trim());
            pstmt.setString(111, objpes.getPes_platT3().trim());

            pstmt.setString(112, objpes.getPes_horAtendT3().trim());
            pstmt.setString(113, objpes.getPes_contatoT3().trim());

            pstmt.setTimestamp(114, new java.sql.Timestamp(objpes.getPes_dtcadastro().getTime()));

            pstmt.setString(115, objpes.getPes_quemCad().trim());

            pstmt.setInt(116, objpes.getId_clientes());

            registros = pstmt.executeUpdate();

        }

        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    }

    /**
     * incluir dados de uma nova transportadora, gerando um novo ID
     *
     * @param objtra
     * @return
     * @throws SQLException
     */
    public int IncluirTransportadora(transportadora objtra) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.transportadora ("
                + " tra_cnpj, tra_razaoS, tra_apelido, tra_iE, tra_pessoa,"
                + " tra_status, tra_plat, tra_empi,"
                + " tra_cep, tra_codIbge, tra_uf, tra_cidade,"
                + " tra_rua, tra_compl, tra_bairro, tra_num,"
                + " tra_telCel, tra_telFixo, tra_mailCon, tra_endWeb,"
                + " tra_veiCon, tra_rntrc, tra_veiTel, tra_veiChapa,"
                + " tra_quemCad, tra_horAtend, tra_contato "
                + ") VAlUES ("
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ? )")) {

            pstmt.setString(1, objtra.getTra_cnpj().trim());
            pstmt.setString(2, objtra.getTra_razaoS().toUpperCase().trim());
            pstmt.setString(3, objtra.getTra_apelido().toUpperCase().trim());
            pstmt.setString(4, objtra.getTra_iE().toUpperCase().trim());

            pstmt.setString(5, objtra.getTra_pessoa().toUpperCase().trim());
            pstmt.setInt(6, objtra.getTra_status());
            pstmt.setString(7, objtra.getTra_plat().toUpperCase().trim());
            pstmt.setString(8, objtra.getTra_empi().toUpperCase().trim());

            pstmt.setString(9, objtra.getTra_cep().trim());
            pstmt.setString(10, objtra.getTra_codIbge().trim());
            pstmt.setString(11, objtra.getTra_uf().trim());
            pstmt.setString(12, objtra.getTra_cidade().toUpperCase().trim());

            pstmt.setString(13, objtra.getTra_rua().toUpperCase().trim());
            pstmt.setString(14, objtra.getTra_compl().toUpperCase().trim());
            pstmt.setString(15, objtra.getTra_bairro().toUpperCase().trim());
            pstmt.setString(16, objtra.getTra_num());

            pstmt.setString(17, objtra.getTra_telCel().trim());
            pstmt.setString(18, objtra.getTra_telFixo().trim());
            pstmt.setString(19, objtra.getTra_mailCon().trim());
            pstmt.setString(20, objtra.getTra_endWeb().trim());

            pstmt.setString(21, objtra.getTra_veiCon().trim());
            pstmt.setString(22, objtra.getTra_rntrc().trim());
            pstmt.setString(23, objtra.getTra_veiTel().trim());
            pstmt.setString(24, objtra.getTra_veiChapa().trim());

            pstmt.setString(25, objtra.getTra_quemCad().trim());
            pstmt.setString(26, objtra.getTra_horAtend().trim());
            pstmt.setString(27, objtra.getTra_contato().trim());

            registros = pstmt.executeUpdate();

        }

        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;

        }

    }//Fim do código Incluir

    /**
     * editar dados de uma transportadora, previamente cadastrada, com base no
     * se código ID
     *
     * @param objtra
     * @return
     * @throws SQLException
     */
    public boolean EditarTransportadora(transportadora objtra) throws SQLException {
        con = connectionFactory.getConnection();
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.transportadora set "
                + "tra_cnpj=?, tra_razaoS=?, tra_apelido=?, tra_iE=?, "
                + "tra_pessoa=?, tra_status=?, tra_plat=?, tra_empi=?, "
                + "tra_cep=?, tra_codIbge=?, tra_uf=?, tra_cidade=?, "
                + "tra_rua=?, tra_compl=?, tra_bairro=?, tra_num=?, "
                + "tra_telCel=?, tra_telFixo=?, tra_mailCon=?, tra_endWeb=?, "
                + "tra_veiCon=?, tra_rntrc=?, tra_veiTel=?, tra_veiChapa=?, "
                + "tra_quemCad=?, tra_horAtend=? , tra_contato=? "
                + "where id_transportadora=?")) {

            pstmt.setString(1, objtra.getTra_cnpj().trim());
            pstmt.setString(2, objtra.getTra_razaoS().toUpperCase().trim());
            pstmt.setString(3, objtra.getTra_apelido().toUpperCase().trim());
            pstmt.setString(4, objtra.getTra_iE().toUpperCase().trim());

            pstmt.setString(5, objtra.getTra_pessoa().toUpperCase().trim());
            pstmt.setInt(6, objtra.getTra_status());
            pstmt.setString(7, objtra.getTra_plat().toUpperCase().trim());
            pstmt.setString(8, objtra.getTra_empi().toUpperCase().trim());

            pstmt.setString(9, objtra.getTra_cep().trim());
            pstmt.setString(10, objtra.getTra_codIbge().trim());
            pstmt.setString(11, objtra.getTra_uf().trim());
            pstmt.setString(12, objtra.getTra_cidade().toUpperCase().trim());

            pstmt.setString(13, objtra.getTra_rua().toUpperCase().trim());
            pstmt.setString(14, objtra.getTra_compl().toUpperCase().trim());
            pstmt.setString(15, objtra.getTra_bairro().toUpperCase().trim());
            pstmt.setString(16, objtra.getTra_num());

            pstmt.setString(17, objtra.getTra_telCel().trim());
            pstmt.setString(18, objtra.getTra_telFixo().trim());
            pstmt.setString(19, objtra.getTra_mailCon().trim());
            pstmt.setString(20, objtra.getTra_endWeb().trim());

            pstmt.setString(21, objtra.getTra_veiCon().trim());
            pstmt.setString(22, objtra.getTra_rntrc().trim());
            pstmt.setString(23, objtra.getTra_veiTel().trim());
            pstmt.setString(24, objtra.getTra_veiChapa().trim());

            pstmt.setString(25, objtra.getTra_quemCad().trim());
            pstmt.setString(26, objtra.getTra_horAtend().trim());
            pstmt.setString(27, objtra.getTra_contato().trim());

            pstmt.setInt(28, objtra.getId_transportadora());

            registros = pstmt.executeUpdate();

        }

        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    }

    /**
     * gerar novo usuario de acesso, e ID
     *
     * @param objlog
     * @return
     * @throws SQLException
     */
    public int IncluirUsuario(login objlog) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.login (usuario, senha) VALUES (?,?)")) {

            pstmt.setString(1, objlog.getUsuario().trim());
            pstmt.setString(2, objlog.getSenha().trim());

            registros = pstmt.executeUpdate();
        }
        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }
    }

    /**
     * editar daos do usuario de acesso
     *
     * @param objlog
     * @return
     * @throws SQLException
     */
    public boolean EditarUsuario(login objlog) throws SQLException {
        con = connectionFactory.getConnection();

        int registros = 0;

        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.login set usuario=?, senha=? where id_login=?")) {

            pstmt.setString(1, objlog.getUsuario().toUpperCase().trim());
            pstmt.setString(2, objlog.getSenha().trim());

            pstmt.setInt(3, objlog.getId_login());

            registros = pstmt.executeUpdate();

        }
        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    }

    /**
     * adicionar novo produto, gerando novo código ID
     *
     * @param objpro
     * @return
     * @throws SQLException
     */
    public int IncluirProdutos(produtos objpro) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.produtos ("
                + " pro_grupo, pro_linha, pro_ncm, pro_material, pro_dureza, "
                + " pro_descri, "
                + " pro_embC, pro_contendoC, pro_unidadeC, "
                + " pro_modelo, pro_codContabil, "
                + " pro_embV, pro_contendoV, pro_unidadeV, "
                + " pro_largura, pro_compri, pro_diame, pro_espes, "
                + " pro_medConsu, pro_rendiPlaca, "
                + " pro_pesLiqui, pro_pesBruto, "
                + " pro_maxEsto, pro_medEsto, pro_minEsto, "
                + " pro_praca, pro_praca2, "
                + " pro_kgBobi, pro_dificuldade, "
                + " pro_fundi, pro_slitter, pro_prensa, pro_apaga09, "
                + " pro_raa, "
                + " pro_estoMin, pro_calha, pro_produtivo, pro_inativo, pro_dtcadastro, pro_quemCad "
                + ") VALUES ("
                + "?, ?, ?, ?, ?, "
                + "?, "
                + "?, ?, ?, "
                + "?, ?, "
                + "?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, "
                + "?, ?, "
                + "?, ?, ?, "
                + "?, ?, "
                + "?, ?, "
                + "?, ?, ?, ?, "
                + "?, "
                + "?, ?, ?, ?, ?, ? "
                + ")")) {

            pstmt.setString(1, objpro.getPro_grupo().toUpperCase().trim());
            pstmt.setString(2, objpro.getPro_linha().toUpperCase().trim());
            pstmt.setString(3, objpro.getPro_ncm().trim());
            pstmt.setString(4, objpro.getPro_material().trim());
            pstmt.setString(5, objpro.getPro_dureza().trim());

            pstmt.setString(6, objpro.getPro_descri().toUpperCase().trim());

            pstmt.setString(7, objpro.getPro_embC().toUpperCase().trim());
            pstmt.setString(8, objpro.getPro_contendoC().toUpperCase().trim());
            pstmt.setString(9, objpro.getPro_unidadeC().toUpperCase().trim());

            pstmt.setString(10, objpro.getPro_modelo().toUpperCase().trim());
            pstmt.setString(11, objpro.getPro_codContabil().toUpperCase().trim());

            pstmt.setString(12, objpro.getPro_embV().toUpperCase().trim());
            pstmt.setString(13, objpro.getPro_contendoV().toUpperCase().trim());
            pstmt.setString(14, objpro.getPro_unidadeV().toUpperCase().trim());

            pstmt.setString(15, objpro.getPro_largura().trim());
            pstmt.setString(16, objpro.getPro_compri().trim());
            pstmt.setString(17, objpro.getPro_diame().trim());
            pstmt.setString(18, objpro.getPro_espes().trim());

            pstmt.setString(19, objpro.getPro_medConsu().trim());
            pstmt.setString(20, objpro.getPro_rendiPlaca().trim());

            pstmt.setString(21, objpro.getPro_pesLiqui().trim());
            pstmt.setString(22, objpro.getPro_pesBruto().trim());

            pstmt.setString(23, objpro.getPro_maxEsto().trim());
            pstmt.setString(24, objpro.getPro_medEsto().trim());
            pstmt.setString(25, objpro.getPro_minEsto().trim());

            pstmt.setString(26, objpro.getPro_praca().trim());
            pstmt.setString(27, objpro.getPro_praca2().trim());

            pstmt.setString(28, objpro.getPro_kgBobi().trim());
            pstmt.setInt(29, objpro.getPro_dificuldade());

            pstmt.setString(30, objpro.getPro_fundi().trim());
            pstmt.setString(31, objpro.getPro_slitter().trim());
            pstmt.setString(32, objpro.getPro_prensa().trim());
            pstmt.setInt(33, objpro.getPro_apaga09());

            pstmt.setInt(34, objpro.getPro_raa());
            pstmt.setInt(35, objpro.getPro_estoMin());
            pstmt.setInt(36, objpro.getPro_calha());
            pstmt.setInt(37, objpro.getPro_produtivo());
            pstmt.setInt(38, objpro.getPro_inativo());

            pstmt.setTimestamp(39, new java.sql.Timestamp(objpro.getPro_dtcadastro().getTime()));

            pstmt.setString(40, objpro.getPro_quemCad().trim());

            registros = pstmt.executeUpdate();

        }

        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;

        }

    }//Fim do código Incluir

    /**
     * editar dados do produto coforme o codigo ID
     *
     * @param objpro
     * @return
     * @throws SQLException
     */
    public boolean EditarProdutos(produtos objpro) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.produtos set "
                + "pro_grupo=?, pro_linha=?, pro_ncm=?, "
                + "pro_material=?, pro_dureza=?, "
                + "pro_descri=?, "
                + "pro_embC=?, pro_contendoC=?, pro_unidadeC=?, "
                + "pro_modelo=?, pro_codContabil=?, "
                + "pro_embV=?, pro_contendoV=?, pro_unidadeV=?, "
                + "pro_largura=?, pro_compri=?, pro_diame=?, pro_espes=?, "
                + "pro_medConsu=?, pro_rendiPlaca=?, "
                + "pro_pesLiqui=?, pro_pesBruto=?, "
                + "pro_maxEsto=?, pro_medEsto=?, pro_minEsto=?, "
                + "pro_praca=?, pro_praca2=?, "
                + "pro_kgBobi=?, pro_dificuldade=?, "
                + "pro_fundi=?, pro_slitter=?, pro_prensa=?, pro_apaga09=?, "
                + "pro_raa=?, "
                + "pro_estoMin=?, pro_calha=?, pro_produtivo=?, pro_inativo=?, pro_dtcadastro=?, pro_quemCad=? "
                + "where id_produtos=?")) {

            pstmt.setString(1, objpro.getPro_grupo().toUpperCase().trim());
            pstmt.setString(2, objpro.getPro_linha().toUpperCase().trim());
            pstmt.setString(3, objpro.getPro_ncm().trim());
            pstmt.setString(4, objpro.getPro_material().trim());
            pstmt.setString(5, objpro.getPro_dureza().trim());

            pstmt.setString(6, objpro.getPro_descri().toUpperCase().trim());

            pstmt.setString(7, objpro.getPro_embC().toUpperCase().trim());
            pstmt.setString(8, objpro.getPro_contendoC().toUpperCase().trim());
            pstmt.setString(9, objpro.getPro_unidadeC().toUpperCase().trim());

            pstmt.setString(10, objpro.getPro_modelo().toUpperCase().trim());
            pstmt.setString(11, objpro.getPro_codContabil().toUpperCase().trim());

            pstmt.setString(12, objpro.getPro_embV().toUpperCase().trim());
            pstmt.setString(13, objpro.getPro_contendoV().toUpperCase().trim());
            pstmt.setString(14, objpro.getPro_unidadeV().toUpperCase().trim());

            pstmt.setString(15, objpro.getPro_largura().trim());
            pstmt.setString(16, objpro.getPro_compri().trim());
            pstmt.setString(17, objpro.getPro_diame().trim());
            pstmt.setString(18, objpro.getPro_espes().trim());

            pstmt.setString(19, objpro.getPro_medConsu().trim());
            pstmt.setString(20, objpro.getPro_rendiPlaca().trim());

            pstmt.setString(21, objpro.getPro_pesLiqui().trim());
            pstmt.setString(22, objpro.getPro_pesBruto().trim());

            pstmt.setString(23, objpro.getPro_maxEsto().trim());
            pstmt.setString(24, objpro.getPro_medEsto().trim());
            pstmt.setString(25, objpro.getPro_minEsto().trim());

            pstmt.setString(26, objpro.getPro_praca().trim());
            pstmt.setString(27, objpro.getPro_praca2().trim());

            pstmt.setString(28, objpro.getPro_kgBobi().trim());
            pstmt.setInt(29, objpro.getPro_dificuldade());

            pstmt.setString(30, objpro.getPro_fundi().trim());
            pstmt.setString(31, objpro.getPro_slitter().trim());
            pstmt.setString(32, objpro.getPro_prensa().trim());
            pstmt.setInt(33, objpro.getPro_apaga09());

            pstmt.setInt(34, objpro.getPro_raa());

            pstmt.setInt(35, objpro.getPro_estoMin());
            pstmt.setInt(36, objpro.getPro_calha());
            pstmt.setInt(37, objpro.getPro_produtivo());
            pstmt.setInt(38, objpro.getPro_inativo());

            pstmt.setTimestamp(39, new java.sql.Timestamp(objpro.getPro_dtcadastro().getTime()));

            pstmt.setString(40, objpro.getPro_quemCad().trim());

            pstmt.setInt(41, objpro.getId_produtos());

            registros = pstmt.executeUpdate();

        }
        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    } // FIM EDITAR PRODUTOS

    //INICIO INCLUIR FICHAO
    /**
     * Gerar a existencia de um fichao de cliente
     *
     * @param objfic
     * @return
     * @throws SQLException
     */
    public int IncluirFichao(fichao objfic) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.fichao ("
                + " pes_vende , pes_atende, pes_prosp,"
                + " pes_Transp1 , pes_Transp2, pes_Transp3,"
                + " pes_quemFatu1 , pes_quemFatu2, pes_quemFatu3,"
                + " pes_contaOr, pes_tipoSaida,"
                + " pes_frete, pes_porcen, pes_altePreco, pes_descri,"
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
                + " pes_descriKNfe, pes_observacao1, pes_observacao2, pes_observacao3, id_cliente "
                + ") VAlUES ("
                + "?, ?, ?, "
                + "?, ?, ?, "
                + "?, ?, ?, "
                + "?, "
                + "?, ?, ?, ?, "
                + "?, "
                + "?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, "
                + "?, ?, "
                + "?, ?, ?, ?, ?, "
                + "?, ?, ?, "
                + "?, "
                + "?, ?, "
                + "?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, ?, ?, ?, "
                + "?, "
                + "?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ? "
                + ")")) {

            pstmt.setString(1, objfic.getPes_vende().trim());
            pstmt.setString(2, objfic.getPes_atende().trim());
            pstmt.setString(3, objfic.getPes_prosp().trim());

            pstmt.setString(4, objfic.getPes_Transp1().trim());
            pstmt.setString(5, objfic.getPes_Transp2().trim());
            pstmt.setString(6, objfic.getPes_Transp3().trim());

            pstmt.setString(7, objfic.getPes_quemFatu1().trim());
            pstmt.setString(8, objfic.getPes_quemFatu2().trim());
            pstmt.setString(9, objfic.getPes_quemFatu3().trim());

            pstmt.setString(10, objfic.getPes_contaOr().trim());

            pstmt.setString(11, objfic.getPes_tipoSaida().trim());

            pstmt.setString(12, objfic.getPes_frete());
            pstmt.setString(13, objfic.getPes_porcen().trim());

            pstmt.setString(14, objfic.getPes_altePreco().trim());

            pstmt.setString(15, objfic.getPes_descri().trim());

            pstmt.setString(16, objfic.getPes_fusao().trim());

            pstmt.setString(17, objfic.getPes_pra().trim());
            pstmt.setString(18, objfic.getPes_zo().trim());
            pstmt.setString(19, objfic.getPes_de().trim());
            pstmt.setString(20, objfic.getPes_pa().trim());
            pstmt.setString(21, objfic.getPes_ga().trim());
            pstmt.setString(22, objfic.getPes_men().trim());
            pstmt.setString(23, objfic.getPes_to().trim());

            pstmt.setString(24, objfic.getPes_formaPagto().trim());
            pstmt.setString(25, objfic.getPes_banco().trim());

            pstmt.setString(26, objfic.getPes_pec().trim());
            pstmt.setString(27, objfic.getPes_ped().trim());

            pstmt.setString(28, objfic.getPes_mesmoEm().trim());
            pstmt.setString(29, objfic.getPes_maiorVal().trim());
            pstmt.setString(30, objfic.getPes_menorChequ().trim());
            pstmt.setString(31, objfic.getPes_prazoMChe().trim());
            pstmt.setString(32, objfic.getPes_pesarAguar().trim());

            pstmt.setString(33, objfic.getPes_credi().trim());
            pstmt.setString(34, objfic.getPes_chePorPro().trim());
            pstmt.setString(35, objfic.getPes_chePor3().trim());

            pstmt.setString(36, objfic.getPes_restri().trim());

            pstmt.setString(37, objfic.getPes_matFinal().trim());
            pstmt.setString(38, objfic.getPes_matPrima().trim());

            pstmt.setString(39, objfic.getPes_chapaComMin().trim());
            pstmt.setString(40, objfic.getPes_chapaComMax().trim());
            pstmt.setString(41, objfic.getPes_chapaEspesMin().trim());
            pstmt.setString(42, objfic.getPes_chapaEspesMax().trim());
            pstmt.setString(43, objfic.getPes_chapaLargMin().trim());
            pstmt.setString(44, objfic.getPes_chapaLargMax().trim());

            pstmt.setString(45, objfic.getPes_bobiEspesMin().trim());
            pstmt.setString(46, objfic.getPes_bobiEspesMax().trim());
            pstmt.setString(47, objfic.getPes_bobiLargMin().trim());
            pstmt.setString(48, objfic.getPes_bobiLargMax().trim());

            pstmt.setString(49, objfic.getPes_discDiamMin().trim());
            pstmt.setString(50, objfic.getPes_discDiamMax().trim());
            pstmt.setString(51, objfic.getPes_discEspesMin().trim());
            pstmt.setString(52, objfic.getPes_discEspesMax().trim());

            pstmt.setString(53, objfic.getPes_porF0F1Min().trim());
            pstmt.setString(54, objfic.getPes_porF0F1Max().trim());
            pstmt.setString(55, objfic.getPes_porKgMin().trim());
            pstmt.setString(56, objfic.getPes_porKgMax().trim());

            pstmt.setString(57, objfic.getPes_fluxoA().trim());
            pstmt.setString(58, objfic.getPes_fluxoB().trim());
            pstmt.setString(59, objfic.getPes_fluxoC().trim());
            pstmt.setString(60, objfic.getPes_fluxoD().trim());
            pstmt.setString(61, objfic.getPes_fluxoE().trim());
            pstmt.setString(62, objfic.getPes_fluxoF().trim());

            pstmt.setString(63, objfic.getPes_descriKNfe().trim());
            pstmt.setString(64, objfic.getPes_observacao1().trim());
            pstmt.setString(65, objfic.getPes_observacao2().trim());
            pstmt.setString(66, objfic.getPes_observacao3().trim());

            pstmt.setInt(67, objfic.getId_cliente());

            registros = pstmt.executeUpdate();

        }

        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }

    }// FIM INCLUIR FICHAO

    //INICIO EDITAR FICHAO
    /**
     * editar todo o fichao do cliente, com base no id referencial do cliente
     *
     * @param objfic
     * @return
     * @throws SQLException
     */
    public boolean EditarFichao(fichao objfic) throws SQLException {
        con = connectionFactory.getConnection();
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.fichao set"
                + " pes_vende=?, pes_atende=?, pes_prosp=?,"
                + " pes_Transp1=?, pes_Transp2=?, pes_Transp3=?,"
                + " pes_quemFatu1=?, pes_quemFatu2=?, pes_quemFatu3=?,"
                + " pes_contaOr=?, pes_tipoSaida=?,"
                + " pes_frete=?, pes_porcen=?, pes_altePreco=?, pes_descri=?,"
                + " pes_fusao=?,"
                + " pes_pra=?, pes_zo=?, pes_de=?, pes_pa=?, pes_ga=?, pes_men=?, pes_to=?,"
                + " pes_formaPagto=?, pes_banco=?,"
                + " pes_pec=?, pes_ped=?,"
                + " pes_mesmoEm=?, pes_maiorVal=?, pes_menorChequ=?, pes_prazoMChe=?, pes_pesarAguar=?,"
                + " pes_credi=?, pes_chePorPro=?, pes_chePor3=?,"
                + " pes_restri=?,"
                + " pes_matFinal=?, pes_matPrima=?,"
                + " pes_chapaComMin=?, pes_chapaComMax=?, pes_chapaEspesMin=?, pes_chapaEspesMax=?, pes_chapaLargMin=?, pes_chapaLargMax=?,"
                + " pes_bobiEspesMin=?, pes_bobiEspesMax=?, pes_bobiLargMin=?, pes_bobiLargMax=?,"
                + " pes_discDiamMin=?, pes_discDiamMax=?, pes_discEspesMin=?, pes_discEspesMax=?,"
                + " pes_porF0F1Min=?, pes_porF0F1Max=?, pes_porKgMin=?, pes_porKgMax=?,"
                + " pes_fluxoA=?, pes_fluxoB=?, pes_fluxoC=?, pes_fluxoD=?, pes_fluxoE=?, pes_fluxoF=?,"
                + " pes_descriKNfe=?, pes_observacao1=?, pes_observacao2=?, pes_observacao3=? "
                + " where id_cliente=?")) {

            pstmt.setString(1, objfic.getPes_vende().trim());
            pstmt.setString(2, objfic.getPes_atende().trim());
            pstmt.setString(3, objfic.getPes_prosp().trim());

            pstmt.setString(4, objfic.getPes_Transp1().trim());
            pstmt.setString(5, objfic.getPes_Transp2().trim());
            pstmt.setString(6, objfic.getPes_Transp3().trim());

            pstmt.setString(7, objfic.getPes_quemFatu1().trim());
            pstmt.setString(8, objfic.getPes_quemFatu2().trim());
            pstmt.setString(9, objfic.getPes_quemFatu3().trim());

            pstmt.setString(10, objfic.getPes_contaOr().trim());

            pstmt.setString(11, objfic.getPes_tipoSaida().trim());

            pstmt.setString(12, objfic.getPes_frete());
            pstmt.setString(13, objfic.getPes_porcen().trim());

            pstmt.setString(14, objfic.getPes_altePreco().trim());

            pstmt.setString(15, objfic.getPes_descri().trim());

            pstmt.setString(16, objfic.getPes_fusao().trim());

            pstmt.setString(17, objfic.getPes_pra().trim());
            pstmt.setString(18, objfic.getPes_zo().trim());
            pstmt.setString(19, objfic.getPes_de().trim());
            pstmt.setString(20, objfic.getPes_pa().trim());
            pstmt.setString(21, objfic.getPes_ga().trim());
            pstmt.setString(22, objfic.getPes_men().trim());
            pstmt.setString(23, objfic.getPes_to().trim());

            pstmt.setString(24, objfic.getPes_formaPagto().trim());
            pstmt.setString(25, objfic.getPes_banco().trim());

            pstmt.setString(26, objfic.getPes_pec().trim());
            pstmt.setString(27, objfic.getPes_ped().trim());

            pstmt.setString(28, objfic.getPes_mesmoEm().trim());
            pstmt.setString(29, objfic.getPes_maiorVal().trim());
            pstmt.setString(30, objfic.getPes_menorChequ().trim());
            pstmt.setString(31, objfic.getPes_prazoMChe().trim());
            pstmt.setString(32, objfic.getPes_pesarAguar().trim());

            pstmt.setString(33, objfic.getPes_credi().trim());
            pstmt.setString(34, objfic.getPes_chePorPro().trim());
            pstmt.setString(35, objfic.getPes_chePor3().trim());

            pstmt.setString(36, objfic.getPes_restri().trim());

            pstmt.setString(37, objfic.getPes_matFinal().trim());
            pstmt.setString(38, objfic.getPes_matPrima().trim());

            pstmt.setString(39, objfic.getPes_chapaComMin().trim());
            pstmt.setString(40, objfic.getPes_chapaComMax().trim());
            pstmt.setString(41, objfic.getPes_chapaEspesMin().trim());
            pstmt.setString(42, objfic.getPes_chapaEspesMax().trim());
            pstmt.setString(43, objfic.getPes_chapaLargMin().trim());
            pstmt.setString(44, objfic.getPes_chapaLargMax().trim());

            pstmt.setString(45, objfic.getPes_bobiEspesMin().trim());
            pstmt.setString(46, objfic.getPes_bobiEspesMax().trim());
            pstmt.setString(47, objfic.getPes_bobiLargMin().trim());
            pstmt.setString(48, objfic.getPes_bobiLargMax().trim());

            pstmt.setString(49, objfic.getPes_discDiamMin().trim());
            pstmt.setString(50, objfic.getPes_discDiamMax().trim());
            pstmt.setString(51, objfic.getPes_discEspesMin().trim());
            pstmt.setString(52, objfic.getPes_discEspesMax().trim());

            pstmt.setString(53, objfic.getPes_porF0F1Min().trim());
            pstmt.setString(54, objfic.getPes_porF0F1Max().trim());
            pstmt.setString(55, objfic.getPes_porKgMin().trim());
            pstmt.setString(56, objfic.getPes_porKgMax().trim());

            pstmt.setString(57, objfic.getPes_fluxoA().trim());
            pstmt.setString(58, objfic.getPes_fluxoB().trim());
            pstmt.setString(59, objfic.getPes_fluxoC().trim());
            pstmt.setString(60, objfic.getPes_fluxoD().trim());
            pstmt.setString(61, objfic.getPes_fluxoE().trim());
            pstmt.setString(62, objfic.getPes_fluxoF().trim());

            pstmt.setString(63, objfic.getPes_descriKNfe().trim());
            pstmt.setString(64, objfic.getPes_observacao1().trim());
            pstmt.setString(65, objfic.getPes_observacao2().trim());
            pstmt.setString(66, objfic.getPes_observacao3().trim());

            pstmt.setInt(67, objfic.getId_cliente());

            //  pstmt.setInt(70, objfic.getId_fichao());
            registros = pstmt.executeUpdate();

        }

        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    } //FIM EDITAR FICHAO

    /**
     * editar determinada linha do fichao do cliente com base no id referencial
     * da linha
     *
     * @param objfic
     * @return
     * @throws SQLException
     */
    public boolean EditarFichaoCliente(fichao objfic) throws SQLException {
        con = connectionFactory.getConnection();
        int registros;
        try (PreparedStatement pstmt = con.prepareStatement("UPDATE db_cadastro.fichao set"
                + " pes_vende=?, pes_atende=?, pes_prosp=?,"
                + " pes_Transp1=?, pes_Transp2=?, pes_Transp3=?,"
                + " pes_quemFatu1=?, pes_quemFatu2=?, pes_quemFatu3=?,"
                + " pes_contaOr=?, pes_tipoSaida=?,"
                + " pes_frete=?, pes_porcen=?, pes_altePreco=?, pes_descri=?,"
                + " pes_fusao=?,"
                + " pes_pra=?, pes_zo=?, pes_de=?, pes_pa=?, pes_ga=?, pes_men=?, pes_to=?,"
                + " pes_formaPagto=?, pes_banco=?,"
                + " pes_pec=?, pes_ped=?,"
                + " pes_mesmoEm=?, pes_maiorVal=?, pes_menorChequ=?, pes_prazoMChe=?, pes_pesarAguar=?,"
                + " pes_credi=?, pes_chePorPro=?, pes_chePor3=?,"
                + " pes_restri=?,"
                + " pes_matFinal=?, pes_matPrima=?,"
                + " pes_chapaComMin=?, pes_chapaComMax=?, pes_chapaEspesMin=?, pes_chapaEspesMax=?, pes_chapaLargMin=?, pes_chapaLargMax=?,"
                + " pes_bobiEspesMin=?, pes_bobiEspesMax=?, pes_bobiLargMin=?, pes_bobiLargMax=?,"
                + " pes_discDiamMin=?, pes_discDiamMax=?, pes_discEspesMin=?, pes_discEspesMax=?,"
                + " pes_porF0F1Min=?, pes_porF0F1Max=?, pes_porKgMin=?, pes_porKgMax=?,"
                + " pes_fluxoA=?, pes_fluxoB=?, pes_fluxoC=?, pes_fluxoD=?, pes_fluxoE=?, pes_fluxoF=?,"
                + " pes_descriKNfe=?, pes_observacao1=?, pes_observacao2=?, pes_observacao3=? "
                + " where id_fichao=?")) {

            pstmt.setString(1, objfic.getPes_vende().trim());
            pstmt.setString(2, objfic.getPes_atende().trim());
            pstmt.setString(3, objfic.getPes_prosp().trim());

            pstmt.setString(4, objfic.getPes_Transp1().trim());
            pstmt.setString(5, objfic.getPes_Transp2().trim());
            pstmt.setString(6, objfic.getPes_Transp3().trim());

            pstmt.setString(7, objfic.getPes_quemFatu1().trim());
            pstmt.setString(8, objfic.getPes_quemFatu2().trim());
            pstmt.setString(9, objfic.getPes_quemFatu3().trim());

            pstmt.setString(10, objfic.getPes_contaOr().trim());

            pstmt.setString(11, objfic.getPes_tipoSaida().trim());

            pstmt.setString(12, objfic.getPes_frete());
            pstmt.setString(13, objfic.getPes_porcen().trim());

            pstmt.setString(14, objfic.getPes_altePreco().trim());

            pstmt.setString(15, objfic.getPes_descri().trim());

            pstmt.setString(16, objfic.getPes_fusao().trim());

            pstmt.setString(17, objfic.getPes_pra().trim());
            pstmt.setString(18, objfic.getPes_zo().trim());
            pstmt.setString(19, objfic.getPes_de().trim());
            pstmt.setString(20, objfic.getPes_pa().trim());
            pstmt.setString(21, objfic.getPes_ga().trim());
            pstmt.setString(22, objfic.getPes_men().trim());
            pstmt.setString(23, objfic.getPes_to().trim());

            pstmt.setString(24, objfic.getPes_formaPagto().trim());
            pstmt.setString(25, objfic.getPes_banco().trim());

            pstmt.setString(26, objfic.getPes_pec().trim());
            pstmt.setString(27, objfic.getPes_ped().trim());

            pstmt.setString(28, objfic.getPes_mesmoEm().trim());
            pstmt.setString(29, objfic.getPes_maiorVal().trim());
            pstmt.setString(30, objfic.getPes_menorChequ().trim());
            pstmt.setString(31, objfic.getPes_prazoMChe().trim());
            pstmt.setString(32, objfic.getPes_pesarAguar().trim());

            pstmt.setString(33, objfic.getPes_credi().trim());
            pstmt.setString(34, objfic.getPes_chePorPro().trim());
            pstmt.setString(35, objfic.getPes_chePor3().trim());

            pstmt.setString(36, objfic.getPes_restri().trim());

            pstmt.setString(37, objfic.getPes_matFinal().trim());
            pstmt.setString(38, objfic.getPes_matPrima().trim());

            pstmt.setString(39, objfic.getPes_chapaComMin().trim());
            pstmt.setString(40, objfic.getPes_chapaComMax().trim());
            pstmt.setString(41, objfic.getPes_chapaEspesMin().trim());
            pstmt.setString(42, objfic.getPes_chapaEspesMax().trim());
            pstmt.setString(43, objfic.getPes_chapaLargMin().trim());
            pstmt.setString(44, objfic.getPes_chapaLargMax().trim());

            pstmt.setString(45, objfic.getPes_bobiEspesMin().trim());
            pstmt.setString(46, objfic.getPes_bobiEspesMax().trim());
            pstmt.setString(47, objfic.getPes_bobiLargMin().trim());
            pstmt.setString(48, objfic.getPes_bobiLargMax().trim());

            pstmt.setString(49, objfic.getPes_discDiamMin().trim());
            pstmt.setString(50, objfic.getPes_discDiamMax().trim());
            pstmt.setString(51, objfic.getPes_discEspesMin().trim());
            pstmt.setString(52, objfic.getPes_discEspesMax().trim());

            pstmt.setString(53, objfic.getPes_porF0F1Min().trim());
            pstmt.setString(54, objfic.getPes_porF0F1Max().trim());
            pstmt.setString(55, objfic.getPes_porKgMin().trim());
            pstmt.setString(56, objfic.getPes_porKgMax().trim());

            pstmt.setString(57, objfic.getPes_fluxoA().trim());
            pstmt.setString(58, objfic.getPes_fluxoB().trim());
            pstmt.setString(59, objfic.getPes_fluxoC().trim());
            pstmt.setString(60, objfic.getPes_fluxoD().trim());
            pstmt.setString(61, objfic.getPes_fluxoE().trim());
            pstmt.setString(62, objfic.getPes_fluxoF().trim());

            pstmt.setString(63, objfic.getPes_descriKNfe().trim());
            pstmt.setString(64, objfic.getPes_observacao1().trim());
            pstmt.setString(65, objfic.getPes_observacao2().trim());
            pstmt.setString(66, objfic.getPes_observacao3().trim());

            pstmt.setInt(67, objfic.getId_fichao());

            registros = pstmt.executeUpdate();

        }

        if (registros == 1) {
            return true;
        } else {

            return false;

        }
    } //FIM EDITAR FICHAO

    //INICIO INCLUIR PRECO
    /**
     * gerar novo preço de produtos do cliente
     *
     * @param objpre
     * @return
     * @throws SQLException
     */
    public int IncluirPreco(preco objpre) throws SQLException {
        con = connectionFactory.getConnection();

        int registros;

        try (PreparedStatement pstmt = con.prepareStatement("INSERT INTO db_cadastro.preco (pre_data, pre_valor, id_Lfichao, id_cliente) VALUES (?,?,?,?)")) {

            pstmt.setTimestamp(1, new java.sql.Timestamp(objpre.getPre_data().getTime()));
            pstmt.setString(2, objpre.getPre_valor().trim());
            pstmt.setInt(3, objpre.getId_Lfichao());
            pstmt.setInt(4, objpre.getId_cliente());

            registros = pstmt.executeUpdate();
        }
        PreparedStatement pstmtAux = con.prepareStatement("Select @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if (registros != 1 || rs == null) {
            return codigo;
        } else {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        }
    }
    
    

}//Fim do código
