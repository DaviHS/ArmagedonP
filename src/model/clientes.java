package model;

import java.util.Date;

/**
 * Classe de clientes, com getter e setter
 *
 */
public class clientes {

    private clientes Clientes;

    private int id_clientes;
    private String pes_razaoS;
    private String pes_apelido;
    private String pes_clienteM;
    private String pes_iE;
    private String pes_cnpj;
    private int pes_status;
    private String pes_tipoConsu;
    private String pes_ramo;
    private String pes_codSuframa;
    private String pes_codPais;
    private String pes_venciDupli;
    private String pes_telFixo;
    private String pes_telCel;
    private String pes_telW;
    private String pes_mailCon;
    private String pes_mailXml;
    private String pes_endWeb;

    private String pes_vende;
    private String pes_atende;
    private String pes_prosp;
    private String pes_disc;
    private String pes_chapa;
    private String pes_bobi;

    private String pes_cepF;
    private String pes_telF;
    private String pes_codIbgeF;
    private String pes_ufF;
    private String pes_cidadeF;
    private String pes_ruaF;
    private String pes_complF;
    private String pes_bairroF;
    private String pes_numF;

    private String pes_cepE;
    private String pes_telE;
    private String pes_codIbgeE;
    private String pes_ufE;
    private String pes_cidadeE;
    private String pes_ruaE;
    private String pes_complE;
    private String pes_bairroE;
    private String pes_numE;

    private String pes_cepC;
    private String pes_telC;
    private String pes_codIbgeC;
    private String pes_ufC;
    private String pes_cidadeC;
    private String pes_ruaC;
    private String pes_complC;
    private String pes_bairroC;
    private String pes_numC;

    private Date pes_dtcadastro;

    private String pes_quemCad;

    private String pes_codT1;
    private String pes_razaoST1;
    private String pes_cnpjT1;
    private String pes_iET1;
    private String pes_apelidoT1;

    private String pes_endWebT1;
    private String pes_telFixoT1;
    private String pes_mailConT1;
    private String pes_telCelT1;

    private String pes_ruaT1;
    private String pes_numT1;
    private String pes_complT1;
    private String pes_bairroT1;
    private String pes_cepT1;
    private String pes_cidadeT1;
    private String pes_ufT1;
    private String pes_codIbgeT1;

    private String pes_empiT1;
    private String pes_platT1;

    private String pes_horAtendT1;
    private String pes_contatoT1;

    private String pes_codT2;
    private String pes_razaoST2;
    private String pes_cnpjT2;
    private String pes_iET2;
    private String pes_apelidoT2;

    private String pes_endWebT2;
    private String pes_telFixoT2;
    private String pes_mailConT2;
    private String pes_telCelT2;

    private String pes_ruaT2;
    private String pes_numT2;
    private String pes_complT2;
    private String pes_bairroT2;
    private String pes_cepT2;
    private String pes_cidadeT2;
    private String pes_ufT2;
    private String pes_codIbgeT2;

    private String pes_empiT2;
    private String pes_platT2;

    private String pes_horAtendT2;
    private String pes_contatoT2;

    private String pes_codT3;
    private String pes_razaoST3;
    private String pes_cnpjT3;
    private String pes_iET3;
    private String pes_apelidoT3;

    private String pes_endWebT3;
    private String pes_telFixoT3;
    private String pes_mailConT3;
    private String pes_telCelT3;

    private String pes_ruaT3;
    private String pes_numT3;
    private String pes_complT3;
    private String pes_bairroT3;
    private String pes_cepT3;
    private String pes_cidadeT3;
    private String pes_ufT3;
    private String pes_codIbgeT3;

    private String pes_empiT3;
    private String pes_platT3;

    private String pes_horAtendT3;
    private String pes_contatoT3;

    public clientes() {
    }

    public clientes(clientes Clientes, int id_clientes, String pes_razaoS, String pes_apelido, String pes_clienteM, String pes_iE, String pes_cnpj, int pes_status, String pes_tipoConsu, String pes_ramo, String pes_codSuframa, String pes_codPais, String pes_venciDupli, String pes_telFixo, String pes_telCel, String pes_telW, String pes_mailCon, String pes_mailXml, String pes_endWeb, String pes_vende, String pes_atende, String pes_prosp, String pes_disc, String pes_chapa, String pes_bobi, String pes_cepF, String pes_telF, String pes_codIbgeF, String pes_ufF, String pes_cidadeF, String pes_ruaF, String pes_complF, String pes_bairroF, String pes_numF, String pes_cepE, String pes_telE, String pes_codIbgeE, String pes_ufE, String pes_cidadeE, String pes_ruaE, String pes_complE, String pes_bairroE, String pes_numE, String pes_cepC, String pes_telC, String pes_codIbgeC, String pes_ufC, String pes_cidadeC, String pes_ruaC, String pes_complC, String pes_bairroC, String pes_numC, Date pes_dtcadastro, String pes_quemCad, String pes_codT1, String pes_razaoST1, String pes_cnpjT1, String pes_iET1, String pes_apelidoT1, String pes_endWebT1, String pes_telFixoT1, String pes_mailConT1, String pes_telCelT1, String pes_ruaT1, String pes_numT1, String pes_complT1, String pes_bairroT1, String pes_cepT1, String pes_cidadeT1, String pes_ufT1, String pes_codIbgeT1, String pes_empiT1, String pes_platT1, String pes_horAtendT1, String pes_contatoT1, String pes_codT2, String pes_razaoST2, String pes_cnpjT2, String pes_iET2, String pes_apelidoT2, String pes_endWebT2, String pes_telFixoT2, String pes_mailConT2, String pes_telCelT2, String pes_ruaT2, String pes_numT2, String pes_complT2, String pes_bairroT2, String pes_cepT2, String pes_cidadeT2, String pes_ufT2, String pes_codIbgeT2, String pes_empiT2, String pes_platT2, String pes_horAtendT2, String pes_contatoT2, String pes_codT3, String pes_razaoST3, String pes_cnpjT3, String pes_iET3, String pes_apelidoT3, String pes_endWebT3, String pes_telFixoT3, String pes_mailConT3, String pes_telCelT3, String pes_ruaT3, String pes_numT3, String pes_complT3, String pes_bairroT3, String pes_cepT3, String pes_cidadeT3, String pes_ufT3, String pes_codIbgeT3, String pes_empiT3, String pes_platT3, String pes_horAtendT3, String pes_contatoT3) {
        this.Clientes = Clientes;
        this.id_clientes = id_clientes;
        this.pes_razaoS = pes_razaoS;
        this.pes_apelido = pes_apelido;
        this.pes_clienteM = pes_clienteM;
        this.pes_iE = pes_iE;
        this.pes_cnpj = pes_cnpj;
        this.pes_status = pes_status;
        this.pes_tipoConsu = pes_tipoConsu;
        this.pes_ramo = pes_ramo;
        this.pes_codSuframa = pes_codSuframa;
        this.pes_codPais = pes_codPais;
        this.pes_venciDupli = pes_venciDupli;
        this.pes_telFixo = pes_telFixo;
        this.pes_telCel = pes_telCel;
        this.pes_telW = pes_telW;
        this.pes_mailCon = pes_mailCon;
        this.pes_mailXml = pes_mailXml;
        this.pes_endWeb = pes_endWeb;
        this.pes_vende = pes_vende;
        this.pes_atende = pes_atende;
        this.pes_prosp = pes_prosp;
        this.pes_disc = pes_disc;
        this.pes_chapa = pes_chapa;
        this.pes_bobi = pes_bobi;
        this.pes_cepF = pes_cepF;
        this.pes_telF = pes_telF;
        this.pes_codIbgeF = pes_codIbgeF;
        this.pes_ufF = pes_ufF;
        this.pes_cidadeF = pes_cidadeF;
        this.pes_ruaF = pes_ruaF;
        this.pes_complF = pes_complF;
        this.pes_bairroF = pes_bairroF;
        this.pes_numF = pes_numF;
        this.pes_cepE = pes_cepE;
        this.pes_telE = pes_telE;
        this.pes_codIbgeE = pes_codIbgeE;
        this.pes_ufE = pes_ufE;
        this.pes_cidadeE = pes_cidadeE;
        this.pes_ruaE = pes_ruaE;
        this.pes_complE = pes_complE;
        this.pes_bairroE = pes_bairroE;
        this.pes_numE = pes_numE;
        this.pes_cepC = pes_cepC;
        this.pes_telC = pes_telC;
        this.pes_codIbgeC = pes_codIbgeC;
        this.pes_ufC = pes_ufC;
        this.pes_cidadeC = pes_cidadeC;
        this.pes_ruaC = pes_ruaC;
        this.pes_complC = pes_complC;
        this.pes_bairroC = pes_bairroC;
        this.pes_numC = pes_numC;
        this.pes_dtcadastro = pes_dtcadastro;
        this.pes_quemCad = pes_quemCad;
        this.pes_codT1 = pes_codT1;
        this.pes_razaoST1 = pes_razaoST1;
        this.pes_cnpjT1 = pes_cnpjT1;
        this.pes_iET1 = pes_iET1;
        this.pes_apelidoT1 = pes_apelidoT1;
        this.pes_endWebT1 = pes_endWebT1;
        this.pes_telFixoT1 = pes_telFixoT1;
        this.pes_mailConT1 = pes_mailConT1;
        this.pes_telCelT1 = pes_telCelT1;
        this.pes_ruaT1 = pes_ruaT1;
        this.pes_numT1 = pes_numT1;
        this.pes_complT1 = pes_complT1;
        this.pes_bairroT1 = pes_bairroT1;
        this.pes_cepT1 = pes_cepT1;
        this.pes_cidadeT1 = pes_cidadeT1;
        this.pes_ufT1 = pes_ufT1;
        this.pes_codIbgeT1 = pes_codIbgeT1;
        this.pes_empiT1 = pes_empiT1;
        this.pes_platT1 = pes_platT1;
        this.pes_horAtendT1 = pes_horAtendT1;
        this.pes_contatoT1 = pes_contatoT1;
        this.pes_codT2 = pes_codT2;
        this.pes_razaoST2 = pes_razaoST2;
        this.pes_cnpjT2 = pes_cnpjT2;
        this.pes_iET2 = pes_iET2;
        this.pes_apelidoT2 = pes_apelidoT2;
        this.pes_endWebT2 = pes_endWebT2;
        this.pes_telFixoT2 = pes_telFixoT2;
        this.pes_mailConT2 = pes_mailConT2;
        this.pes_telCelT2 = pes_telCelT2;
        this.pes_ruaT2 = pes_ruaT2;
        this.pes_numT2 = pes_numT2;
        this.pes_complT2 = pes_complT2;
        this.pes_bairroT2 = pes_bairroT2;
        this.pes_cepT2 = pes_cepT2;
        this.pes_cidadeT2 = pes_cidadeT2;
        this.pes_ufT2 = pes_ufT2;
        this.pes_codIbgeT2 = pes_codIbgeT2;
        this.pes_empiT2 = pes_empiT2;
        this.pes_platT2 = pes_platT2;
        this.pes_horAtendT2 = pes_horAtendT2;
        this.pes_contatoT2 = pes_contatoT2;
        this.pes_codT3 = pes_codT3;
        this.pes_razaoST3 = pes_razaoST3;
        this.pes_cnpjT3 = pes_cnpjT3;
        this.pes_iET3 = pes_iET3;
        this.pes_apelidoT3 = pes_apelidoT3;
        this.pes_endWebT3 = pes_endWebT3;
        this.pes_telFixoT3 = pes_telFixoT3;
        this.pes_mailConT3 = pes_mailConT3;
        this.pes_telCelT3 = pes_telCelT3;
        this.pes_ruaT3 = pes_ruaT3;
        this.pes_numT3 = pes_numT3;
        this.pes_complT3 = pes_complT3;
        this.pes_bairroT3 = pes_bairroT3;
        this.pes_cepT3 = pes_cepT3;
        this.pes_cidadeT3 = pes_cidadeT3;
        this.pes_ufT3 = pes_ufT3;
        this.pes_codIbgeT3 = pes_codIbgeT3;
        this.pes_empiT3 = pes_empiT3;
        this.pes_platT3 = pes_platT3;
        this.pes_horAtendT3 = pes_horAtendT3;
        this.pes_contatoT3 = pes_contatoT3;
    }

    public clientes getClientes() {
        return Clientes;
    }

    public void setClientes(clientes Clientes) {
        this.Clientes = Clientes;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getPes_razaoS() {
        return pes_razaoS;
    }

    public void setPes_razaoS(String pes_razaoS) {
        this.pes_razaoS = pes_razaoS;
    }

    public String getPes_apelido() {
        return pes_apelido;
    }

    public void setPes_apelido(String pes_apelido) {
        this.pes_apelido = pes_apelido;
    }

    public String getPes_clienteM() {
        return pes_clienteM;
    }

    public void setPes_clienteM(String pes_clienteM) {
        this.pes_clienteM = pes_clienteM;
    }

    public String getPes_iE() {
        return pes_iE;
    }

    public void setPes_iE(String pes_iE) {
        this.pes_iE = pes_iE;
    }

    public String getPes_cnpj() {
        return pes_cnpj;
    }

    public void setPes_cnpj(String pes_cnpj) {
        this.pes_cnpj = pes_cnpj;
    }

    public int getPes_status() {
        return pes_status;
    }

    public void setPes_status(int pes_status) {
        this.pes_status = pes_status;
    }

    public String getPes_tipoConsu() {
        return pes_tipoConsu;
    }

    public void setPes_tipoConsu(String pes_tipoConsu) {
        this.pes_tipoConsu = pes_tipoConsu;
    }

    public String getPes_ramo() {
        return pes_ramo;
    }

    public void setPes_ramo(String pes_ramo) {
        this.pes_ramo = pes_ramo;
    }

    public String getPes_codSuframa() {
        return pes_codSuframa;
    }

    public void setPes_codSuframa(String pes_codSuframa) {
        this.pes_codSuframa = pes_codSuframa;
    }

    public String getPes_codPais() {
        return pes_codPais;
    }

    public void setPes_codPais(String pes_codPais) {
        this.pes_codPais = pes_codPais;
    }

    public String getPes_venciDupli() {
        return pes_venciDupli;
    }

    public void setPes_venciDupli(String pes_venciDupli) {
        this.pes_venciDupli = pes_venciDupli;
    }

    public String getPes_telFixo() {
        return pes_telFixo;
    }

    public void setPes_telFixo(String pes_telFixo) {
        this.pes_telFixo = pes_telFixo;
    }

    public String getPes_telCel() {
        return pes_telCel;
    }

    public void setPes_telCel(String pes_telCel) {
        this.pes_telCel = pes_telCel;
    }

    public String getPes_telW() {
        return pes_telW;
    }

    public void setPes_telW(String pes_telW) {
        this.pes_telW = pes_telW;
    }

    public String getPes_mailCon() {
        return pes_mailCon;
    }

    public void setPes_mailCon(String pes_mailCon) {
        this.pes_mailCon = pes_mailCon;
    }

    public String getPes_mailXml() {
        return pes_mailXml;
    }

    public void setPes_mailXml(String pes_mailXml) {
        this.pes_mailXml = pes_mailXml;
    }

    public String getPes_endWeb() {
        return pes_endWeb;
    }

    public void setPes_endWeb(String pes_endWeb) {
        this.pes_endWeb = pes_endWeb;
    }

    public String getPes_vende() {
        return pes_vende;
    }

    public void setPes_vende(String pes_vende) {
        this.pes_vende = pes_vende;
    }

    public String getPes_atende() {
        return pes_atende;
    }

    public void setPes_atende(String pes_atende) {
        this.pes_atende = pes_atende;
    }

    public String getPes_prosp() {
        return pes_prosp;
    }

    public void setPes_prosp(String pes_prosp) {
        this.pes_prosp = pes_prosp;
    }

    public String getPes_disc() {
        return pes_disc;
    }

    public void setPes_disc(String pes_disc) {
        this.pes_disc = pes_disc;
    }

    public String getPes_chapa() {
        return pes_chapa;
    }

    public void setPes_chapa(String pes_chapa) {
        this.pes_chapa = pes_chapa;
    }

    public String getPes_bobi() {
        return pes_bobi;
    }

    public void setPes_bobi(String pes_bobi) {
        this.pes_bobi = pes_bobi;
    }

    public String getPes_cepF() {
        return pes_cepF;
    }

    public void setPes_cepF(String pes_cepF) {
        this.pes_cepF = pes_cepF;
    }

    public String getPes_telF() {
        return pes_telF;
    }

    public void setPes_telF(String pes_telF) {
        this.pes_telF = pes_telF;
    }

    public String getPes_codIbgeF() {
        return pes_codIbgeF;
    }

    public void setPes_codIbgeF(String pes_codIbgeF) {
        this.pes_codIbgeF = pes_codIbgeF;
    }

    public String getPes_ufF() {
        return pes_ufF;
    }

    public void setPes_ufF(String pes_ufF) {
        this.pes_ufF = pes_ufF;
    }

    public String getPes_cidadeF() {
        return pes_cidadeF;
    }

    public void setPes_cidadeF(String pes_cidadeF) {
        this.pes_cidadeF = pes_cidadeF;
    }

    public String getPes_ruaF() {
        return pes_ruaF;
    }

    public void setPes_ruaF(String pes_ruaF) {
        this.pes_ruaF = pes_ruaF;
    }

    public String getPes_complF() {
        return pes_complF;
    }

    public void setPes_complF(String pes_complF) {
        this.pes_complF = pes_complF;
    }

    public String getPes_bairroF() {
        return pes_bairroF;
    }

    public void setPes_bairroF(String pes_bairroF) {
        this.pes_bairroF = pes_bairroF;
    }

    public String getPes_numF() {
        return pes_numF;
    }

    public void setPes_numF(String pes_numF) {
        this.pes_numF = pes_numF;
    }

    public String getPes_cepE() {
        return pes_cepE;
    }

    public void setPes_cepE(String pes_cepE) {
        this.pes_cepE = pes_cepE;
    }

    public String getPes_telE() {
        return pes_telE;
    }

    public void setPes_telE(String pes_telE) {
        this.pes_telE = pes_telE;
    }

    public String getPes_codIbgeE() {
        return pes_codIbgeE;
    }

    public void setPes_codIbgeE(String pes_codIbgeE) {
        this.pes_codIbgeE = pes_codIbgeE;
    }

    public String getPes_ufE() {
        return pes_ufE;
    }

    public void setPes_ufE(String pes_ufE) {
        this.pes_ufE = pes_ufE;
    }

    public String getPes_cidadeE() {
        return pes_cidadeE;
    }

    public void setPes_cidadeE(String pes_cidadeE) {
        this.pes_cidadeE = pes_cidadeE;
    }

    public String getPes_ruaE() {
        return pes_ruaE;
    }

    public void setPes_ruaE(String pes_ruaE) {
        this.pes_ruaE = pes_ruaE;
    }

    public String getPes_complE() {
        return pes_complE;
    }

    public void setPes_complE(String pes_complE) {
        this.pes_complE = pes_complE;
    }

    public String getPes_bairroE() {
        return pes_bairroE;
    }

    public void setPes_bairroE(String pes_bairroE) {
        this.pes_bairroE = pes_bairroE;
    }

    public String getPes_numE() {
        return pes_numE;
    }

    public void setPes_numE(String pes_numE) {
        this.pes_numE = pes_numE;
    }

    public String getPes_cepC() {
        return pes_cepC;
    }

    public void setPes_cepC(String pes_cepC) {
        this.pes_cepC = pes_cepC;
    }

    public String getPes_telC() {
        return pes_telC;
    }

    public void setPes_telC(String pes_telC) {
        this.pes_telC = pes_telC;
    }

    public String getPes_codIbgeC() {
        return pes_codIbgeC;
    }

    public void setPes_codIbgeC(String pes_codIbgeC) {
        this.pes_codIbgeC = pes_codIbgeC;
    }

    public String getPes_ufC() {
        return pes_ufC;
    }

    public void setPes_ufC(String pes_ufC) {
        this.pes_ufC = pes_ufC;
    }

    public String getPes_cidadeC() {
        return pes_cidadeC;
    }

    public void setPes_cidadeC(String pes_cidadeC) {
        this.pes_cidadeC = pes_cidadeC;
    }

    public String getPes_ruaC() {
        return pes_ruaC;
    }

    public void setPes_ruaC(String pes_ruaC) {
        this.pes_ruaC = pes_ruaC;
    }

    public String getPes_complC() {
        return pes_complC;
    }

    public void setPes_complC(String pes_complC) {
        this.pes_complC = pes_complC;
    }

    public String getPes_bairroC() {
        return pes_bairroC;
    }

    public void setPes_bairroC(String pes_bairroC) {
        this.pes_bairroC = pes_bairroC;
    }

    public String getPes_numC() {
        return pes_numC;
    }

    public void setPes_numC(String pes_numC) {
        this.pes_numC = pes_numC;
    }

    public Date getPes_dtcadastro() {
        return pes_dtcadastro;
    }

    public void setPes_dtcadastro(Date pes_dtcadastro) {
        this.pes_dtcadastro = pes_dtcadastro;
    }

    public String getPes_quemCad() {
        return pes_quemCad;
    }

    public void setPes_quemCad(String pes_quemCad) {
        this.pes_quemCad = pes_quemCad;
    }

    public String getPes_codT1() {
        return pes_codT1;
    }

    public void setPes_codT1(String pes_codT1) {
        this.pes_codT1 = pes_codT1;
    }

    public String getPes_razaoST1() {
        return pes_razaoST1;
    }

    public void setPes_razaoST1(String pes_razaoST1) {
        this.pes_razaoST1 = pes_razaoST1;
    }

    public String getPes_cnpjT1() {
        return pes_cnpjT1;
    }

    public void setPes_cnpjT1(String pes_cnpjT1) {
        this.pes_cnpjT1 = pes_cnpjT1;
    }

    public String getPes_iET1() {
        return pes_iET1;
    }

    public void setPes_iET1(String pes_iET1) {
        this.pes_iET1 = pes_iET1;
    }

    public String getPes_apelidoT1() {
        return pes_apelidoT1;
    }

    public void setPes_apelidoT1(String pes_apelidoT1) {
        this.pes_apelidoT1 = pes_apelidoT1;
    }

    public String getPes_endWebT1() {
        return pes_endWebT1;
    }

    public void setPes_endWebT1(String pes_endWebT1) {
        this.pes_endWebT1 = pes_endWebT1;
    }

    public String getPes_telFixoT1() {
        return pes_telFixoT1;
    }

    public void setPes_telFixoT1(String pes_telFixoT1) {
        this.pes_telFixoT1 = pes_telFixoT1;
    }

    public String getPes_mailConT1() {
        return pes_mailConT1;
    }

    public void setPes_mailConT1(String pes_mailConT1) {
        this.pes_mailConT1 = pes_mailConT1;
    }

    public String getPes_telCelT1() {
        return pes_telCelT1;
    }

    public void setPes_telCelT1(String pes_telCelT1) {
        this.pes_telCelT1 = pes_telCelT1;
    }

    public String getPes_ruaT1() {
        return pes_ruaT1;
    }

    public void setPes_ruaT1(String pes_ruaT1) {
        this.pes_ruaT1 = pes_ruaT1;
    }

    public String getPes_numT1() {
        return pes_numT1;
    }

    public void setPes_numT1(String pes_numT1) {
        this.pes_numT1 = pes_numT1;
    }

    public String getPes_complT1() {
        return pes_complT1;
    }

    public void setPes_complT1(String pes_complT1) {
        this.pes_complT1 = pes_complT1;
    }

    public String getPes_bairroT1() {
        return pes_bairroT1;
    }

    public void setPes_bairroT1(String pes_bairroT1) {
        this.pes_bairroT1 = pes_bairroT1;
    }

    public String getPes_cepT1() {
        return pes_cepT1;
    }

    public void setPes_cepT1(String pes_cepT1) {
        this.pes_cepT1 = pes_cepT1;
    }

    public String getPes_cidadeT1() {
        return pes_cidadeT1;
    }

    public void setPes_cidadeT1(String pes_cidadeT1) {
        this.pes_cidadeT1 = pes_cidadeT1;
    }

    public String getPes_ufT1() {
        return pes_ufT1;
    }

    public void setPes_ufT1(String pes_ufT1) {
        this.pes_ufT1 = pes_ufT1;
    }

    public String getPes_codIbgeT1() {
        return pes_codIbgeT1;
    }

    public void setPes_codIbgeT1(String pes_codIbgeT1) {
        this.pes_codIbgeT1 = pes_codIbgeT1;
    }

    public String getPes_empiT1() {
        return pes_empiT1;
    }

    public void setPes_empiT1(String pes_empiT1) {
        this.pes_empiT1 = pes_empiT1;
    }

    public String getPes_platT1() {
        return pes_platT1;
    }

    public void setPes_platT1(String pes_platT1) {
        this.pes_platT1 = pes_platT1;
    }

    public String getPes_horAtendT1() {
        return pes_horAtendT1;
    }

    public void setPes_horAtendT1(String pes_horAtendT1) {
        this.pes_horAtendT1 = pes_horAtendT1;
    }

    public String getPes_contatoT1() {
        return pes_contatoT1;
    }

    public void setPes_contatoT1(String pes_contatoT1) {
        this.pes_contatoT1 = pes_contatoT1;
    }

    public String getPes_codT2() {
        return pes_codT2;
    }

    public void setPes_codT2(String pes_codT2) {
        this.pes_codT2 = pes_codT2;
    }

    public String getPes_razaoST2() {
        return pes_razaoST2;
    }

    public void setPes_razaoST2(String pes_razaoST2) {
        this.pes_razaoST2 = pes_razaoST2;
    }

    public String getPes_cnpjT2() {
        return pes_cnpjT2;
    }

    public void setPes_cnpjT2(String pes_cnpjT2) {
        this.pes_cnpjT2 = pes_cnpjT2;
    }

    public String getPes_iET2() {
        return pes_iET2;
    }

    public void setPes_iET2(String pes_iET2) {
        this.pes_iET2 = pes_iET2;
    }

    public String getPes_apelidoT2() {
        return pes_apelidoT2;
    }

    public void setPes_apelidoT2(String pes_apelidoT2) {
        this.pes_apelidoT2 = pes_apelidoT2;
    }

    public String getPes_endWebT2() {
        return pes_endWebT2;
    }

    public void setPes_endWebT2(String pes_endWebT2) {
        this.pes_endWebT2 = pes_endWebT2;
    }

    public String getPes_telFixoT2() {
        return pes_telFixoT2;
    }

    public void setPes_telFixoT2(String pes_telFixoT2) {
        this.pes_telFixoT2 = pes_telFixoT2;
    }

    public String getPes_mailConT2() {
        return pes_mailConT2;
    }

    public void setPes_mailConT2(String pes_mailConT2) {
        this.pes_mailConT2 = pes_mailConT2;
    }

    public String getPes_telCelT2() {
        return pes_telCelT2;
    }

    public void setPes_telCelT2(String pes_telCelT2) {
        this.pes_telCelT2 = pes_telCelT2;
    }

    public String getPes_ruaT2() {
        return pes_ruaT2;
    }

    public void setPes_ruaT2(String pes_ruaT2) {
        this.pes_ruaT2 = pes_ruaT2;
    }

    public String getPes_numT2() {
        return pes_numT2;
    }

    public void setPes_numT2(String pes_numT2) {
        this.pes_numT2 = pes_numT2;
    }

    public String getPes_complT2() {
        return pes_complT2;
    }

    public void setPes_complT2(String pes_complT2) {
        this.pes_complT2 = pes_complT2;
    }

    public String getPes_bairroT2() {
        return pes_bairroT2;
    }

    public void setPes_bairroT2(String pes_bairroT2) {
        this.pes_bairroT2 = pes_bairroT2;
    }

    public String getPes_cepT2() {
        return pes_cepT2;
    }

    public void setPes_cepT2(String pes_cepT2) {
        this.pes_cepT2 = pes_cepT2;
    }

    public String getPes_cidadeT2() {
        return pes_cidadeT2;
    }

    public void setPes_cidadeT2(String pes_cidadeT2) {
        this.pes_cidadeT2 = pes_cidadeT2;
    }

    public String getPes_ufT2() {
        return pes_ufT2;
    }

    public void setPes_ufT2(String pes_ufT2) {
        this.pes_ufT2 = pes_ufT2;
    }

    public String getPes_codIbgeT2() {
        return pes_codIbgeT2;
    }

    public void setPes_codIbgeT2(String pes_codIbgeT2) {
        this.pes_codIbgeT2 = pes_codIbgeT2;
    }

    public String getPes_empiT2() {
        return pes_empiT2;
    }

    public void setPes_empiT2(String pes_empiT2) {
        this.pes_empiT2 = pes_empiT2;
    }

    public String getPes_platT2() {
        return pes_platT2;
    }

    public void setPes_platT2(String pes_platT2) {
        this.pes_platT2 = pes_platT2;
    }

    public String getPes_horAtendT2() {
        return pes_horAtendT2;
    }

    public void setPes_horAtendT2(String pes_horAtendT2) {
        this.pes_horAtendT2 = pes_horAtendT2;
    }

    public String getPes_contatoT2() {
        return pes_contatoT2;
    }

    public void setPes_contatoT2(String pes_contatoT2) {
        this.pes_contatoT2 = pes_contatoT2;
    }

    public String getPes_codT3() {
        return pes_codT3;
    }

    public void setPes_codT3(String pes_codT3) {
        this.pes_codT3 = pes_codT3;
    }

    public String getPes_razaoST3() {
        return pes_razaoST3;
    }

    public void setPes_razaoST3(String pes_razaoST3) {
        this.pes_razaoST3 = pes_razaoST3;
    }

    public String getPes_cnpjT3() {
        return pes_cnpjT3;
    }

    public void setPes_cnpjT3(String pes_cnpjT3) {
        this.pes_cnpjT3 = pes_cnpjT3;
    }

    public String getPes_iET3() {
        return pes_iET3;
    }

    public void setPes_iET3(String pes_iET3) {
        this.pes_iET3 = pes_iET3;
    }

    public String getPes_apelidoT3() {
        return pes_apelidoT3;
    }

    public void setPes_apelidoT3(String pes_apelidoT3) {
        this.pes_apelidoT3 = pes_apelidoT3;
    }

    public String getPes_endWebT3() {
        return pes_endWebT3;
    }

    public void setPes_endWebT3(String pes_endWebT3) {
        this.pes_endWebT3 = pes_endWebT3;
    }

    public String getPes_telFixoT3() {
        return pes_telFixoT3;
    }

    public void setPes_telFixoT3(String pes_telFixoT3) {
        this.pes_telFixoT3 = pes_telFixoT3;
    }

    public String getPes_mailConT3() {
        return pes_mailConT3;
    }

    public void setPes_mailConT3(String pes_mailConT3) {
        this.pes_mailConT3 = pes_mailConT3;
    }

    public String getPes_telCelT3() {
        return pes_telCelT3;
    }

    public void setPes_telCelT3(String pes_telCelT3) {
        this.pes_telCelT3 = pes_telCelT3;
    }

    public String getPes_ruaT3() {
        return pes_ruaT3;
    }

    public void setPes_ruaT3(String pes_ruaT3) {
        this.pes_ruaT3 = pes_ruaT3;
    }

    public String getPes_numT3() {
        return pes_numT3;
    }

    public void setPes_numT3(String pes_numT3) {
        this.pes_numT3 = pes_numT3;
    }

    public String getPes_complT3() {
        return pes_complT3;
    }

    public void setPes_complT3(String pes_complT3) {
        this.pes_complT3 = pes_complT3;
    }

    public String getPes_bairroT3() {
        return pes_bairroT3;
    }

    public void setPes_bairroT3(String pes_bairroT3) {
        this.pes_bairroT3 = pes_bairroT3;
    }

    public String getPes_cepT3() {
        return pes_cepT3;
    }

    public void setPes_cepT3(String pes_cepT3) {
        this.pes_cepT3 = pes_cepT3;
    }

    public String getPes_cidadeT3() {
        return pes_cidadeT3;
    }

    public void setPes_cidadeT3(String pes_cidadeT3) {
        this.pes_cidadeT3 = pes_cidadeT3;
    }

    public String getPes_ufT3() {
        return pes_ufT3;
    }

    public void setPes_ufT3(String pes_ufT3) {
        this.pes_ufT3 = pes_ufT3;
    }

    public String getPes_codIbgeT3() {
        return pes_codIbgeT3;
    }

    public void setPes_codIbgeT3(String pes_codIbgeT3) {
        this.pes_codIbgeT3 = pes_codIbgeT3;
    }

    public String getPes_empiT3() {
        return pes_empiT3;
    }

    public void setPes_empiT3(String pes_empiT3) {
        this.pes_empiT3 = pes_empiT3;
    }

    public String getPes_platT3() {
        return pes_platT3;
    }

    public void setPes_platT3(String pes_platT3) {
        this.pes_platT3 = pes_platT3;
    }

    public String getPes_horAtendT3() {
        return pes_horAtendT3;
    }

    public void setPes_horAtendT3(String pes_horAtendT3) {
        this.pes_horAtendT3 = pes_horAtendT3;
    }

    public String getPes_contatoT3() {
        return pes_contatoT3;
    }

    public void setPes_contatoT3(String pes_contatoT3) {
        this.pes_contatoT3 = pes_contatoT3;
    }

} //fim classe clientes
