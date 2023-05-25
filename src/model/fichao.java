/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *  Classe do fichao, com ligação a classe clientes... com getter e setter
 * 
 */
public class fichao {
    
    private fichao Fichao;
    
    private int id_fichao;
    
    private String pes_vende;
    private String pes_atende;
    private String pes_prosp;
    
    private String pes_Transp1;
    private String pes_Transp2;
    private String pes_Transp3;
    
    private String pes_quemFatu1;
    private String pes_quemFatu2;
    private String pes_quemFatu3;
    
    private String pes_contaOr;
    
    private String pes_frete;

    private String pes_porcen;

    private String pes_descri;
    
    private String pes_fusao;
    
    private String pes_pra;
    private String pes_zo;
    private String pes_de;
    private String pes_pa;
    private String pes_ga;
    private String pes_men;
    private String pes_to;
    
    private String pes_formaPagto;
    private String pes_banco;
    
    private String pes_pec;
    private String pes_ped;
    
    private String pes_mesmoEm;
    private String pes_maiorVal;
    private String pes_menorChequ;
    private String pes_prazoMChe;
    private String pes_pesarAguar;
    
    private String pes_credi;
    private String pes_chePorPro;
    private String pes_chePor3;
     
    private String pes_restri;
    
    private String pes_matFinal;
    private String pes_matPrima;
    
    private String pes_chapaComMin;
    private String pes_chapaComMax;
    private String pes_chapaEspesMin;
    private String pes_chapaEspesMax;
    private String pes_chapaLargMin;
    private String pes_chapaLargMax;
    
    private String pes_bobiEspesMin;
    private String pes_bobiEspesMax;
    private String pes_bobiLargMin;
    private String pes_bobiLargMax;
    
    private String pes_discDiamMin;
    private String pes_discDiamMax;
    private String pes_discEspesMin;
    private String pes_discEspesMax;
    
    private String pes_porF0F1Min;
    private String pes_porF0F1Max;
    
    private String pes_porKgMin;
    private String pes_porKgMax;
    
    private String pes_altePreco;
    private String pes_tipoSaida;
    
    private String pes_fluxoA;
    private String pes_fluxoB;
    private String pes_fluxoC;
    private String pes_fluxoD;
    private String pes_fluxoE;
    private String pes_fluxoF;
    
    private String pes_descriKNfe;
    
    private String pes_observacao1;
    private String pes_observacao2;
    private String pes_observacao3;
    
    private int id_cliente;

    public fichao() {
    }

    public fichao(fichao Fichao, int id_fichao, String pes_vende, String pes_atende, String pes_prosp, String pes_Transp1, String pes_Transp2, String pes_Transp3, String pes_quemFatu1, String pes_quemFatu2, String pes_quemFatu3, String pes_contaOr, String pes_frete, String pes_porcen, String pes_descri, String pes_fusao, String pes_pra, String pes_zo, String pes_de, String pes_pa, String pes_ga, String pes_men, String pes_to, String pes_formaPagto, String pes_banco, String pes_pec, String pes_ped, String pes_mesmoEm, String pes_maiorVal, String pes_menorChequ, String pes_prazoMChe, String pes_pesarAguar, String pes_credi, String pes_chePorPro, String pes_chePor3, String pes_restri, String pes_matFinal, String pes_matPrima, String pes_chapaComMin, String pes_chapaComMax, String pes_chapaEspesMin, String pes_chapaEspesMax, String pes_chapaLargMin, String pes_chapaLargMax, String pes_bobiEspesMin, String pes_bobiEspesMax, String pes_bobiLargMin, String pes_bobiLargMax, String pes_discDiamMin, String pes_discDiamMax, String pes_discEspesMin, String pes_discEspesMax, String pes_porF0F1Min, String pes_porF0F1Max, String pes_porKgMin, String pes_porKgMax, String pes_altePreco, String pes_tipoSaida, String pes_fluxoA, String pes_fluxoB, String pes_fluxoC, String pes_fluxoD, String pes_fluxoE, String pes_fluxoF, String pes_descriKNfe, String pes_observacao1, String pes_observacao2, String pes_observacao3, int id_cliente) {
        this.Fichao = Fichao;
        this.id_fichao = id_fichao;
        this.pes_vende = pes_vende;
        this.pes_atende = pes_atende;
        this.pes_prosp = pes_prosp;
        this.pes_Transp1 = pes_Transp1;
        this.pes_Transp2 = pes_Transp2;
        this.pes_Transp3 = pes_Transp3;
        this.pes_quemFatu1 = pes_quemFatu1;
        this.pes_quemFatu2 = pes_quemFatu2;
        this.pes_quemFatu3 = pes_quemFatu3;
        this.pes_contaOr = pes_contaOr;
        this.pes_frete = pes_frete;
        this.pes_porcen = pes_porcen;
        this.pes_descri = pes_descri;
        this.pes_fusao = pes_fusao;
        this.pes_pra = pes_pra;
        this.pes_zo = pes_zo;
        this.pes_de = pes_de;
        this.pes_pa = pes_pa;
        this.pes_ga = pes_ga;
        this.pes_men = pes_men;
        this.pes_to = pes_to;
        this.pes_formaPagto = pes_formaPagto;
        this.pes_banco = pes_banco;
        this.pes_pec = pes_pec;
        this.pes_ped = pes_ped;
        this.pes_mesmoEm = pes_mesmoEm;
        this.pes_maiorVal = pes_maiorVal;
        this.pes_menorChequ = pes_menorChequ;
        this.pes_prazoMChe = pes_prazoMChe;
        this.pes_pesarAguar = pes_pesarAguar;
        this.pes_credi = pes_credi;
        this.pes_chePorPro = pes_chePorPro;
        this.pes_chePor3 = pes_chePor3;
        this.pes_restri = pes_restri;
        this.pes_matFinal = pes_matFinal;
        this.pes_matPrima = pes_matPrima;
        this.pes_chapaComMin = pes_chapaComMin;
        this.pes_chapaComMax = pes_chapaComMax;
        this.pes_chapaEspesMin = pes_chapaEspesMin;
        this.pes_chapaEspesMax = pes_chapaEspesMax;
        this.pes_chapaLargMin = pes_chapaLargMin;
        this.pes_chapaLargMax = pes_chapaLargMax;
        this.pes_bobiEspesMin = pes_bobiEspesMin;
        this.pes_bobiEspesMax = pes_bobiEspesMax;
        this.pes_bobiLargMin = pes_bobiLargMin;
        this.pes_bobiLargMax = pes_bobiLargMax;
        this.pes_discDiamMin = pes_discDiamMin;
        this.pes_discDiamMax = pes_discDiamMax;
        this.pes_discEspesMin = pes_discEspesMin;
        this.pes_discEspesMax = pes_discEspesMax;
        this.pes_porF0F1Min = pes_porF0F1Min;
        this.pes_porF0F1Max = pes_porF0F1Max;
        this.pes_porKgMin = pes_porKgMin;
        this.pes_porKgMax = pes_porKgMax;
        this.pes_altePreco = pes_altePreco;
        this.pes_tipoSaida = pes_tipoSaida;
        this.pes_fluxoA = pes_fluxoA;
        this.pes_fluxoB = pes_fluxoB;
        this.pes_fluxoC = pes_fluxoC;
        this.pes_fluxoD = pes_fluxoD;
        this.pes_fluxoE = pes_fluxoE;
        this.pes_fluxoF = pes_fluxoF;
        this.pes_descriKNfe = pes_descriKNfe;
        this.pes_observacao1 = pes_observacao1;
        this.pes_observacao2 = pes_observacao2;
        this.pes_observacao3 = pes_observacao3;
        this.id_cliente = id_cliente;
    }

    public fichao getFichao() {
        return Fichao;
    }

    public void setFichao(fichao Fichao) {
        this.Fichao = Fichao;
    }

    public int getId_fichao() {
        return id_fichao;
    }

    public void setId_fichao(int id_fichao) {
        this.id_fichao = id_fichao;
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

    public String getPes_Transp1() {
        return pes_Transp1;
    }

    public void setPes_Transp1(String pes_Transp1) {
        this.pes_Transp1 = pes_Transp1;
    }

    public String getPes_Transp2() {
        return pes_Transp2;
    }

    public void setPes_Transp2(String pes_Transp2) {
        this.pes_Transp2 = pes_Transp2;
    }

    public String getPes_Transp3() {
        return pes_Transp3;
    }

    public void setPes_Transp3(String pes_Transp3) {
        this.pes_Transp3 = pes_Transp3;
    }

    public String getPes_quemFatu1() {
        return pes_quemFatu1;
    }

    public void setPes_quemFatu1(String pes_quemFatu1) {
        this.pes_quemFatu1 = pes_quemFatu1;
    }

    public String getPes_quemFatu2() {
        return pes_quemFatu2;
    }

    public void setPes_quemFatu2(String pes_quemFatu2) {
        this.pes_quemFatu2 = pes_quemFatu2;
    }

    public String getPes_quemFatu3() {
        return pes_quemFatu3;
    }

    public void setPes_quemFatu3(String pes_quemFatu3) {
        this.pes_quemFatu3 = pes_quemFatu3;
    }

    public String getPes_contaOr() {
        return pes_contaOr;
    }

    public void setPes_contaOr(String pes_contaOr) {
        this.pes_contaOr = pes_contaOr;
    }

    public String getPes_frete() {
        return pes_frete;
    }

    public void setPes_frete(String pes_frete) {
        this.pes_frete = pes_frete;
    }

    public String getPes_porcen() {
        return pes_porcen;
    }

    public void setPes_porcen(String pes_porcen) {
        this.pes_porcen = pes_porcen;
    }

    public String getPes_descri() {
        return pes_descri;
    }

    public void setPes_descri(String pes_descri) {
        this.pes_descri = pes_descri;
    }

    public String getPes_fusao() {
        return pes_fusao;
    }

    public void setPes_fusao(String pes_fusao) {
        this.pes_fusao = pes_fusao;
    }

    public String getPes_pra() {
        return pes_pra;
    }

    public void setPes_pra(String pes_pra) {
        this.pes_pra = pes_pra;
    }

    public String getPes_zo() {
        return pes_zo;
    }

    public void setPes_zo(String pes_zo) {
        this.pes_zo = pes_zo;
    }

    public String getPes_de() {
        return pes_de;
    }

    public void setPes_de(String pes_de) {
        this.pes_de = pes_de;
    }

    public String getPes_pa() {
        return pes_pa;
    }

    public void setPes_pa(String pes_pa) {
        this.pes_pa = pes_pa;
    }

    public String getPes_ga() {
        return pes_ga;
    }

    public void setPes_ga(String pes_ga) {
        this.pes_ga = pes_ga;
    }

    public String getPes_men() {
        return pes_men;
    }

    public void setPes_men(String pes_men) {
        this.pes_men = pes_men;
    }

    public String getPes_to() {
        return pes_to;
    }

    public void setPes_to(String pes_to) {
        this.pes_to = pes_to;
    }

    public String getPes_formaPagto() {
        return pes_formaPagto;
    }

    public void setPes_formaPagto(String pes_formaPagto) {
        this.pes_formaPagto = pes_formaPagto;
    }

    public String getPes_banco() {
        return pes_banco;
    }

    public void setPes_banco(String pes_banco) {
        this.pes_banco = pes_banco;
    }

    public String getPes_pec() {
        return pes_pec;
    }

    public void setPes_pec(String pes_pec) {
        this.pes_pec = pes_pec;
    }

    public String getPes_ped() {
        return pes_ped;
    }

    public void setPes_ped(String pes_ped) {
        this.pes_ped = pes_ped;
    }

    public String getPes_mesmoEm() {
        return pes_mesmoEm;
    }

    public void setPes_mesmoEm(String pes_mesmoEm) {
        this.pes_mesmoEm = pes_mesmoEm;
    }

    public String getPes_maiorVal() {
        return pes_maiorVal;
    }

    public void setPes_maiorVal(String pes_maiorVal) {
        this.pes_maiorVal = pes_maiorVal;
    }

    public String getPes_menorChequ() {
        return pes_menorChequ;
    }

    public void setPes_menorChequ(String pes_menorChequ) {
        this.pes_menorChequ = pes_menorChequ;
    }

    public String getPes_prazoMChe() {
        return pes_prazoMChe;
    }

    public void setPes_prazoMChe(String pes_prazoMChe) {
        this.pes_prazoMChe = pes_prazoMChe;
    }

    public String getPes_pesarAguar() {
        return pes_pesarAguar;
    }

    public void setPes_pesarAguar(String pes_pesarAguar) {
        this.pes_pesarAguar = pes_pesarAguar;
    }

    public String getPes_credi() {
        return pes_credi;
    }

    public void setPes_credi(String pes_credi) {
        this.pes_credi = pes_credi;
    }

    public String getPes_chePorPro() {
        return pes_chePorPro;
    }

    public void setPes_chePorPro(String pes_chePorPro) {
        this.pes_chePorPro = pes_chePorPro;
    }

    public String getPes_chePor3() {
        return pes_chePor3;
    }

    public void setPes_chePor3(String pes_chePor3) {
        this.pes_chePor3 = pes_chePor3;
    }

    public String getPes_restri() {
        return pes_restri;
    }

    public void setPes_restri(String pes_restri) {
        this.pes_restri = pes_restri;
    }

    public String getPes_matFinal() {
        return pes_matFinal;
    }

    public void setPes_matFinal(String pes_matFinal) {
        this.pes_matFinal = pes_matFinal;
    }

    public String getPes_matPrima() {
        return pes_matPrima;
    }

    public void setPes_matPrima(String pes_matPrima) {
        this.pes_matPrima = pes_matPrima;
    }

    public String getPes_chapaComMin() {
        return pes_chapaComMin;
    }

    public void setPes_chapaComMin(String pes_chapaComMin) {
        this.pes_chapaComMin = pes_chapaComMin;
    }

    public String getPes_chapaComMax() {
        return pes_chapaComMax;
    }

    public void setPes_chapaComMax(String pes_chapaComMax) {
        this.pes_chapaComMax = pes_chapaComMax;
    }

    public String getPes_chapaEspesMin() {
        return pes_chapaEspesMin;
    }

    public void setPes_chapaEspesMin(String pes_chapaEspesMin) {
        this.pes_chapaEspesMin = pes_chapaEspesMin;
    }

    public String getPes_chapaEspesMax() {
        return pes_chapaEspesMax;
    }

    public void setPes_chapaEspesMax(String pes_chapaEspesMax) {
        this.pes_chapaEspesMax = pes_chapaEspesMax;
    }

    public String getPes_chapaLargMin() {
        return pes_chapaLargMin;
    }

    public void setPes_chapaLargMin(String pes_chapaLargMin) {
        this.pes_chapaLargMin = pes_chapaLargMin;
    }

    public String getPes_chapaLargMax() {
        return pes_chapaLargMax;
    }

    public void setPes_chapaLargMax(String pes_chapaLargMax) {
        this.pes_chapaLargMax = pes_chapaLargMax;
    }

    public String getPes_bobiEspesMin() {
        return pes_bobiEspesMin;
    }

    public void setPes_bobiEspesMin(String pes_bobiEspesMin) {
        this.pes_bobiEspesMin = pes_bobiEspesMin;
    }

    public String getPes_bobiEspesMax() {
        return pes_bobiEspesMax;
    }

    public void setPes_bobiEspesMax(String pes_bobiEspesMax) {
        this.pes_bobiEspesMax = pes_bobiEspesMax;
    }

    public String getPes_bobiLargMin() {
        return pes_bobiLargMin;
    }

    public void setPes_bobiLargMin(String pes_bobiLargMin) {
        this.pes_bobiLargMin = pes_bobiLargMin;
    }

    public String getPes_bobiLargMax() {
        return pes_bobiLargMax;
    }

    public void setPes_bobiLargMax(String pes_bobiLargMax) {
        this.pes_bobiLargMax = pes_bobiLargMax;
    }

    public String getPes_discDiamMin() {
        return pes_discDiamMin;
    }

    public void setPes_discDiamMin(String pes_discDiamMin) {
        this.pes_discDiamMin = pes_discDiamMin;
    }

    public String getPes_discDiamMax() {
        return pes_discDiamMax;
    }

    public void setPes_discDiamMax(String pes_discDiamMax) {
        this.pes_discDiamMax = pes_discDiamMax;
    }

    public String getPes_discEspesMin() {
        return pes_discEspesMin;
    }

    public void setPes_discEspesMin(String pes_discEspesMin) {
        this.pes_discEspesMin = pes_discEspesMin;
    }

    public String getPes_discEspesMax() {
        return pes_discEspesMax;
    }

    public void setPes_discEspesMax(String pes_discEspesMax) {
        this.pes_discEspesMax = pes_discEspesMax;
    }

    public String getPes_porF0F1Min() {
        return pes_porF0F1Min;
    }

    public void setPes_porF0F1Min(String pes_porF0F1Min) {
        this.pes_porF0F1Min = pes_porF0F1Min;
    }

    public String getPes_porF0F1Max() {
        return pes_porF0F1Max;
    }

    public void setPes_porF0F1Max(String pes_porF0F1Max) {
        this.pes_porF0F1Max = pes_porF0F1Max;
    }

    public String getPes_porKgMin() {
        return pes_porKgMin;
    }

    public void setPes_porKgMin(String pes_porKgMin) {
        this.pes_porKgMin = pes_porKgMin;
    }

    public String getPes_porKgMax() {
        return pes_porKgMax;
    }

    public void setPes_porKgMax(String pes_porKgMax) {
        this.pes_porKgMax = pes_porKgMax;
    }

    public String getPes_altePreco() {
        return pes_altePreco;
    }

    public void setPes_altePreco(String pes_altePreco) {
        this.pes_altePreco = pes_altePreco;
    }

    public String getPes_tipoSaida() {
        return pes_tipoSaida;
    }

    public void setPes_tipoSaida(String pes_tipoSaida) {
        this.pes_tipoSaida = pes_tipoSaida;
    }

    public String getPes_fluxoA() {
        return pes_fluxoA;
    }

    public void setPes_fluxoA(String pes_fluxoA) {
        this.pes_fluxoA = pes_fluxoA;
    }

    public String getPes_fluxoB() {
        return pes_fluxoB;
    }

    public void setPes_fluxoB(String pes_fluxoB) {
        this.pes_fluxoB = pes_fluxoB;
    }

    public String getPes_fluxoC() {
        return pes_fluxoC;
    }

    public void setPes_fluxoC(String pes_fluxoC) {
        this.pes_fluxoC = pes_fluxoC;
    }

    public String getPes_fluxoD() {
        return pes_fluxoD;
    }

    public void setPes_fluxoD(String pes_fluxoD) {
        this.pes_fluxoD = pes_fluxoD;
    }

    public String getPes_fluxoE() {
        return pes_fluxoE;
    }

    public void setPes_fluxoE(String pes_fluxoE) {
        this.pes_fluxoE = pes_fluxoE;
    }

    public String getPes_fluxoF() {
        return pes_fluxoF;
    }

    public void setPes_fluxoF(String pes_fluxoF) {
        this.pes_fluxoF = pes_fluxoF;
    }

    public String getPes_descriKNfe() {
        return pes_descriKNfe;
    }

    public void setPes_descriKNfe(String pes_descriKNfe) {
        this.pes_descriKNfe = pes_descriKNfe;
    }

    public String getPes_observacao1() {
        return pes_observacao1;
    }

    public void setPes_observacao1(String pes_observacao1) {
        this.pes_observacao1 = pes_observacao1;
    }

    public String getPes_observacao2() {
        return pes_observacao2;
    }

    public void setPes_observacao2(String pes_observacao2) {
        this.pes_observacao2 = pes_observacao2;
    }

    public String getPes_observacao3() {
        return pes_observacao3;
    }

    public void setPes_observacao3(String pes_observacao3) {
        this.pes_observacao3 = pes_observacao3;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    

}
