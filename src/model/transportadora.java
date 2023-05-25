/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 * Getter e Setter da classe transportadora
 * @author user
 */
public class transportadora {
    
   private transportadora transp;
   
   private int id_transportadora;
   
   private String tra_cnpj;
   private String tra_razaoS;
   private String tra_apelido;
   private String tra_iE;
   private String tra_pessoa;
   private int tra_status;
   private String tra_plat;
   private String tra_empi;
   
   private String tra_cep;
   private String tra_codIbge;
   private String tra_uf;
   private String tra_cidade;
   private String tra_rua;
   private String tra_compl;
   private String tra_bairro;
   private String tra_num; 
  
   private String tra_telCel;
   private String tra_telFixo;
   private String tra_mailCon;
   private String tra_endWeb;
   
   private String tra_veiCon;
   private String tra_rntrc;
   private String tra_veiTel;
   private String tra_veiChapa;
   
   private String tra_quemCad;
   
   private String tra_horAtend;
   private String tra_contato;

    public transportadora() {
    }

    public transportadora(transportadora transp, int id_transportadora, String tra_cnpj, String tra_razaoS, String tra_apelido, String tra_iE, String tra_pessoa, int tra_status, String tra_plat, String tra_empi, String tra_cep, String tra_codIbge, String tra_uf, String tra_cidade, String tra_rua, String tra_compl, String tra_bairro, String tra_num, String tra_telCel, String tra_telFixo, String tra_mailCon, String tra_endWeb, String tra_veiCon, String tra_rntrc, String tra_veiTel, String tra_veiChapa, String tra_quemCad, String tra_horAtend, String tra_contato) {
        this.transp = transp;
        this.id_transportadora = id_transportadora;
        this.tra_cnpj = tra_cnpj;
        this.tra_razaoS = tra_razaoS;
        this.tra_apelido = tra_apelido;
        this.tra_iE = tra_iE;
        this.tra_pessoa = tra_pessoa;
        this.tra_status = tra_status;
        this.tra_plat = tra_plat;
        this.tra_empi = tra_empi;
        this.tra_cep = tra_cep;
        this.tra_codIbge = tra_codIbge;
        this.tra_uf = tra_uf;
        this.tra_cidade = tra_cidade;
        this.tra_rua = tra_rua;
        this.tra_compl = tra_compl;
        this.tra_bairro = tra_bairro;
        this.tra_num = tra_num;
        this.tra_telCel = tra_telCel;
        this.tra_telFixo = tra_telFixo;
        this.tra_mailCon = tra_mailCon;
        this.tra_endWeb = tra_endWeb;
        this.tra_veiCon = tra_veiCon;
        this.tra_rntrc = tra_rntrc;
        this.tra_veiTel = tra_veiTel;
        this.tra_veiChapa = tra_veiChapa;
        this.tra_quemCad = tra_quemCad;
        this.tra_horAtend = tra_horAtend;
        this.tra_contato = tra_contato;
    }

    public transportadora getTransp() {
        return transp;
    }

    public void setTransp(transportadora transp) {
        this.transp = transp;
    }

    public int getId_transportadora() {
        return id_transportadora;
    }

    public void setId_transportadora(int id_transportadora) {
        this.id_transportadora = id_transportadora;
    }

    public String getTra_cnpj() {
        return tra_cnpj;
    }

    public void setTra_cnpj(String tra_cnpj) {
        this.tra_cnpj = tra_cnpj;
    }

    public String getTra_razaoS() {
        return tra_razaoS;
    }

    public void setTra_razaoS(String tra_razaoS) {
        this.tra_razaoS = tra_razaoS;
    }

    public String getTra_apelido() {
        return tra_apelido;
    }

    public void setTra_apelido(String tra_apelido) {
        this.tra_apelido = tra_apelido;
    }

    public String getTra_iE() {
        return tra_iE;
    }

    public void setTra_iE(String tra_iE) {
        this.tra_iE = tra_iE;
    }

    public String getTra_pessoa() {
        return tra_pessoa;
    }

    public void setTra_pessoa(String tra_pessoa) {
        this.tra_pessoa = tra_pessoa;
    }

    public int getTra_status() {
        return tra_status;
    }

    public void setTra_status(int tra_status) {
        this.tra_status = tra_status;
    }

    public String getTra_plat() {
        return tra_plat;
    }

    public void setTra_plat(String tra_plat) {
        this.tra_plat = tra_plat;
    }

    public String getTra_empi() {
        return tra_empi;
    }

    public void setTra_empi(String tra_empi) {
        this.tra_empi = tra_empi;
    }

    public String getTra_cep() {
        return tra_cep;
    }

    public void setTra_cep(String tra_cep) {
        this.tra_cep = tra_cep;
    }

    public String getTra_codIbge() {
        return tra_codIbge;
    }

    public void setTra_codIbge(String tra_codIbge) {
        this.tra_codIbge = tra_codIbge;
    }

    public String getTra_uf() {
        return tra_uf;
    }

    public void setTra_uf(String tra_uf) {
        this.tra_uf = tra_uf;
    }

    public String getTra_cidade() {
        return tra_cidade;
    }

    public void setTra_cidade(String tra_cidade) {
        this.tra_cidade = tra_cidade;
    }

    public String getTra_rua() {
        return tra_rua;
    }

    public void setTra_rua(String tra_rua) {
        this.tra_rua = tra_rua;
    }

    public String getTra_compl() {
        return tra_compl;
    }

    public void setTra_compl(String tra_compl) {
        this.tra_compl = tra_compl;
    }

    public String getTra_bairro() {
        return tra_bairro;
    }

    public void setTra_bairro(String tra_bairro) {
        this.tra_bairro = tra_bairro;
    }

    public String getTra_num() {
        return tra_num;
    }

    public void setTra_num(String tra_num) {
        this.tra_num = tra_num;
    }

    public String getTra_telCel() {
        return tra_telCel;
    }

    public void setTra_telCel(String tra_telCel) {
        this.tra_telCel = tra_telCel;
    }

    public String getTra_telFixo() {
        return tra_telFixo;
    }

    public void setTra_telFixo(String tra_telFixo) {
        this.tra_telFixo = tra_telFixo;
    }

    public String getTra_mailCon() {
        return tra_mailCon;
    }

    public void setTra_mailCon(String tra_mailCon) {
        this.tra_mailCon = tra_mailCon;
    }

    public String getTra_endWeb() {
        return tra_endWeb;
    }

    public void setTra_endWeb(String tra_endWeb) {
        this.tra_endWeb = tra_endWeb;
    }

    public String getTra_veiCon() {
        return tra_veiCon;
    }

    public void setTra_veiCon(String tra_veiCon) {
        this.tra_veiCon = tra_veiCon;
    }

    public String getTra_rntrc() {
        return tra_rntrc;
    }

    public void setTra_rntrc(String tra_rntrc) {
        this.tra_rntrc = tra_rntrc;
    }

    public String getTra_veiTel() {
        return tra_veiTel;
    }

    public void setTra_veiTel(String tra_veiTel) {
        this.tra_veiTel = tra_veiTel;
    }

    public String getTra_veiChapa() {
        return tra_veiChapa;
    }

    public void setTra_veiChapa(String tra_veiChapa) {
        this.tra_veiChapa = tra_veiChapa;
    }

    public String getTra_quemCad() {
        return tra_quemCad;
    }

    public void setTra_quemCad(String tra_quemCad) {
        this.tra_quemCad = tra_quemCad;
    }

    public String getTra_horAtend() {
        return tra_horAtend;
    }

    public void setTra_horAtend(String tra_horAtend) {
        this.tra_horAtend = tra_horAtend;
    }

    public String getTra_contato() {
        return tra_contato;
    }

    public void setTra_contato(String tra_contato) {
        this.tra_contato = tra_contato;
    }

  

}
