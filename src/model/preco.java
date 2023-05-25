/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *  Classe de preço, com ligação ao cliente e fichao, com getter e setter
 * 
 */
public class preco {
    
    
    private preco Preco;
    
    private int id_preco;
    
    private Date pre_data;
    
    private String pre_valor;

    private int id_Lfichao;
    
    private int id_cliente;

    public preco() {
    }

    public preco(preco Preco, int id_preco, Date pre_data, String pre_valor, int id_Lfichao, int id_cliente) {
        this.Preco = Preco;
        this.id_preco = id_preco;
        this.pre_data = pre_data;
        this.pre_valor = pre_valor;
        this.id_Lfichao = id_Lfichao;
        this.id_cliente = id_cliente;
    }

    public preco getPreco() {
        return Preco;
    }

    public void setPreco(preco Preco) {
        this.Preco = Preco;
    }

    public int getId_preco() {
        return id_preco;
    }

    public void setId_preco(int id_preco) {
        this.id_preco = id_preco;
    }

    public Date getPre_data() {
        return pre_data;
    }

    public void setPre_data(Date pre_data) {
        this.pre_data = pre_data;
    }

    public String getPre_valor() {
        return pre_valor;
    }

    public void setPre_valor(String pre_valor) {
        this.pre_valor = pre_valor;
    }

    public int getId_Lfichao() {
        return id_Lfichao;
    }

    public void setId_Lfichao(int id_Lfichao) {
        this.id_Lfichao = id_Lfichao;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
