/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *  Classe de produtos, com getter e setter
 * 
 */
public class produtos {
    
    private produtos Produtos;
    
    private int id_produtos;
    
    private String pro_grupo;
    private String pro_linha;
    private String pro_ncm;
    //2
    
    private String pro_material;
    private String pro_dureza;
    //2
    
    private String pro_descri;
    //1
    
    private String pro_embC;
    private String pro_contendoC;
    private String pro_unidadeC;
    //3
    
    private String pro_modelo;
    private String pro_codContabil;
    //2
    
    private String pro_embV; 
    private String pro_contendoV;
    private String pro_unidadeV;
    //3
    
    private String pro_largura;
    private String pro_compri;
    private String pro_diame;
    private String pro_espes;
    //4
    
    private String pro_medConsu;
    private String pro_rendiPlaca;
    //2
    
    private String pro_pesLiqui;
    private String pro_pesBruto;
    //2
    
    private String pro_maxEsto;
    private String pro_medEsto;
    private String pro_minEsto;
    //3
    
    private String pro_praca;
    private String pro_praca2;
    //2
    
    private String pro_kgBobi;
    private int pro_dificuldade;
    //2
    
    private String pro_fundi;
    private String pro_slitter;
    private String pro_prensa;
    private int pro_apaga09;
    //4
    
    private int pro_raa;
    
    private int pro_estoMin;
    private int pro_calha;
    private int pro_produtivo;
    private int pro_inativo;
    
    
    private Date pro_dtcadastro;
    private String pro_quemCad;

    public produtos() {
    }

    public produtos(produtos Produtos, int id_produtos, String pro_grupo, String pro_linha, String pro_ncm, String pro_material, String pro_dureza, String pro_descri, String pro_embC, String pro_contendoC, String pro_unidadeC, String pro_modelo, String pro_codContabil, String pro_embV, String pro_contendoV, String pro_unidadeV, String pro_largura, String pro_compri, String pro_diame, String pro_espes, String pro_medConsu, String pro_rendiPlaca, String pro_pesLiqui, String pro_pesBruto, String pro_maxEsto, String pro_medEsto, String pro_minEsto, String pro_praca, String pro_praca2, String pro_kgBobi, int pro_dificuldade, String pro_fundi, String pro_slitter, String pro_prensa, int pro_apaga09, int pro_raa, int pro_estoMin, int pro_calha, int pro_produtivo, int pro_inativo, Date pro_dtcadastro, String pro_quemCad) {
        this.Produtos = Produtos;
        this.id_produtos = id_produtos;
        this.pro_grupo = pro_grupo;
        this.pro_linha = pro_linha;
        this.pro_ncm = pro_ncm;
        this.pro_material = pro_material;
        this.pro_dureza = pro_dureza;
        this.pro_descri = pro_descri;
        this.pro_embC = pro_embC;
        this.pro_contendoC = pro_contendoC;
        this.pro_unidadeC = pro_unidadeC;
        this.pro_modelo = pro_modelo;
        this.pro_codContabil = pro_codContabil;
        this.pro_embV = pro_embV;
        this.pro_contendoV = pro_contendoV;
        this.pro_unidadeV = pro_unidadeV;
        this.pro_largura = pro_largura;
        this.pro_compri = pro_compri;
        this.pro_diame = pro_diame;
        this.pro_espes = pro_espes;
        this.pro_medConsu = pro_medConsu;
        this.pro_rendiPlaca = pro_rendiPlaca;
        this.pro_pesLiqui = pro_pesLiqui;
        this.pro_pesBruto = pro_pesBruto;
        this.pro_maxEsto = pro_maxEsto;
        this.pro_medEsto = pro_medEsto;
        this.pro_minEsto = pro_minEsto;
        this.pro_praca = pro_praca;
        this.pro_praca2 = pro_praca2;
        this.pro_kgBobi = pro_kgBobi;
        this.pro_dificuldade = pro_dificuldade;
        this.pro_fundi = pro_fundi;
        this.pro_slitter = pro_slitter;
        this.pro_prensa = pro_prensa;
        this.pro_apaga09 = pro_apaga09;
        this.pro_raa = pro_raa;
        this.pro_estoMin = pro_estoMin;
        this.pro_calha = pro_calha;
        this.pro_produtivo = pro_produtivo;
        this.pro_inativo = pro_inativo;
        this.pro_dtcadastro = pro_dtcadastro;
        this.pro_quemCad = pro_quemCad;
    }

    public produtos getProdutos() {
        return Produtos;
    }

    public void setProdutos(produtos Produtos) {
        this.Produtos = Produtos;
    }

    public int getId_produtos() {
        return id_produtos;
    }

    public void setId_produtos(int id_produtos) {
        this.id_produtos = id_produtos;
    }

    public String getPro_grupo() {
        return pro_grupo;
    }

    public void setPro_grupo(String pro_grupo) {
        this.pro_grupo = pro_grupo;
    }

    public String getPro_linha() {
        return pro_linha;
    }

    public void setPro_linha(String pro_linha) {
        this.pro_linha = pro_linha;
    }

    public String getPro_ncm() {
        return pro_ncm;
    }

    public void setPro_ncm(String pro_ncm) {
        this.pro_ncm = pro_ncm;
    }

    public String getPro_material() {
        return pro_material;
    }

    public void setPro_material(String pro_material) {
        this.pro_material = pro_material;
    }

    public String getPro_dureza() {
        return pro_dureza;
    }

    public void setPro_dureza(String pro_dureza) {
        this.pro_dureza = pro_dureza;
    }

    public String getPro_descri() {
        return pro_descri;
    }

    public void setPro_descri(String pro_descri) {
        this.pro_descri = pro_descri;
    }

    public String getPro_embC() {
        return pro_embC;
    }

    public void setPro_embC(String pro_embC) {
        this.pro_embC = pro_embC;
    }

    public String getPro_contendoC() {
        return pro_contendoC;
    }

    public void setPro_contendoC(String pro_contendoC) {
        this.pro_contendoC = pro_contendoC;
    }

    public String getPro_unidadeC() {
        return pro_unidadeC;
    }

    public void setPro_unidadeC(String pro_unidadeC) {
        this.pro_unidadeC = pro_unidadeC;
    }

    public String getPro_modelo() {
        return pro_modelo;
    }

    public void setPro_modelo(String pro_modelo) {
        this.pro_modelo = pro_modelo;
    }

    public String getPro_codContabil() {
        return pro_codContabil;
    }

    public void setPro_codContabil(String pro_codContabil) {
        this.pro_codContabil = pro_codContabil;
    }

    public String getPro_embV() {
        return pro_embV;
    }

    public void setPro_embV(String pro_embV) {
        this.pro_embV = pro_embV;
    }

    public String getPro_contendoV() {
        return pro_contendoV;
    }

    public void setPro_contendoV(String pro_contendoV) {
        this.pro_contendoV = pro_contendoV;
    }

    public String getPro_unidadeV() {
        return pro_unidadeV;
    }

    public void setPro_unidadeV(String pro_unidadeV) {
        this.pro_unidadeV = pro_unidadeV;
    }

    public String getPro_largura() {
        return pro_largura;
    }

    public void setPro_largura(String pro_largura) {
        this.pro_largura = pro_largura;
    }

    public String getPro_compri() {
        return pro_compri;
    }

    public void setPro_compri(String pro_compri) {
        this.pro_compri = pro_compri;
    }

    public String getPro_diame() {
        return pro_diame;
    }

    public void setPro_diame(String pro_diame) {
        this.pro_diame = pro_diame;
    }

    public String getPro_espes() {
        return pro_espes;
    }

    public void setPro_espes(String pro_espes) {
        this.pro_espes = pro_espes;
    }

    public String getPro_medConsu() {
        return pro_medConsu;
    }

    public void setPro_medConsu(String pro_medConsu) {
        this.pro_medConsu = pro_medConsu;
    }

    public String getPro_rendiPlaca() {
        return pro_rendiPlaca;
    }

    public void setPro_rendiPlaca(String pro_rendiPlaca) {
        this.pro_rendiPlaca = pro_rendiPlaca;
    }

    public String getPro_pesLiqui() {
        return pro_pesLiqui;
    }

    public void setPro_pesLiqui(String pro_pesLiqui) {
        this.pro_pesLiqui = pro_pesLiqui;
    }

    public String getPro_pesBruto() {
        return pro_pesBruto;
    }

    public void setPro_pesBruto(String pro_pesBruto) {
        this.pro_pesBruto = pro_pesBruto;
    }

    public String getPro_maxEsto() {
        return pro_maxEsto;
    }

    public void setPro_maxEsto(String pro_maxEsto) {
        this.pro_maxEsto = pro_maxEsto;
    }

    public String getPro_medEsto() {
        return pro_medEsto;
    }

    public void setPro_medEsto(String pro_medEsto) {
        this.pro_medEsto = pro_medEsto;
    }

    public String getPro_minEsto() {
        return pro_minEsto;
    }

    public void setPro_minEsto(String pro_minEsto) {
        this.pro_minEsto = pro_minEsto;
    }

    public String getPro_praca() {
        return pro_praca;
    }

    public void setPro_praca(String pro_praca) {
        this.pro_praca = pro_praca;
    }

    public String getPro_praca2() {
        return pro_praca2;
    }

    public void setPro_praca2(String pro_praca2) {
        this.pro_praca2 = pro_praca2;
    }

    public String getPro_kgBobi() {
        return pro_kgBobi;
    }

    public void setPro_kgBobi(String pro_kgBobi) {
        this.pro_kgBobi = pro_kgBobi;
    }

    public int getPro_dificuldade() {
        return pro_dificuldade;
    }

    public void setPro_dificuldade(int pro_dificuldade) {
        this.pro_dificuldade = pro_dificuldade;
    }

    public String getPro_fundi() {
        return pro_fundi;
    }

    public void setPro_fundi(String pro_fundi) {
        this.pro_fundi = pro_fundi;
    }

    public String getPro_slitter() {
        return pro_slitter;
    }

    public void setPro_slitter(String pro_slitter) {
        this.pro_slitter = pro_slitter;
    }

    public String getPro_prensa() {
        return pro_prensa;
    }

    public void setPro_prensa(String pro_prensa) {
        this.pro_prensa = pro_prensa;
    }

    public int getPro_apaga09() {
        return pro_apaga09;
    }

    public void setPro_apaga09(int pro_apaga09) {
        this.pro_apaga09 = pro_apaga09;
    }

    public int getPro_raa() {
        return pro_raa;
    }

    public void setPro_raa(int pro_raa) {
        this.pro_raa = pro_raa;
    }

    public int getPro_estoMin() {
        return pro_estoMin;
    }

    public void setPro_estoMin(int pro_estoMin) {
        this.pro_estoMin = pro_estoMin;
    }

    public int getPro_calha() {
        return pro_calha;
    }

    public void setPro_calha(int pro_calha) {
        this.pro_calha = pro_calha;
    }

    public int getPro_produtivo() {
        return pro_produtivo;
    }

    public void setPro_produtivo(int pro_produtivo) {
        this.pro_produtivo = pro_produtivo;
    }

    public int getPro_inativo() {
        return pro_inativo;
    }

    public void setPro_inativo(int pro_inativo) {
        this.pro_inativo = pro_inativo;
    }

    public Date getPro_dtcadastro() {
        return pro_dtcadastro;
    }

    public void setPro_dtcadastro(Date pro_dtcadastro) {
        this.pro_dtcadastro = pro_dtcadastro;
    }

    public String getPro_quemCad() {
        return pro_quemCad;
    }

    public void setPro_quemCad(String pro_quemCad) {
        this.pro_quemCad = pro_quemCad;
    }

}
