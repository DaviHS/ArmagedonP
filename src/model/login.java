/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *  Classe de clientes, com getter e setter  do Usuario e Senha
 * 
 */
public class login {
    
    private login Login;
    private int id_login;
    private String usuario;
    private String senha;

    public login() {
    }

    public login(login Login, int id_login, String usuario, String senha) {
        this.Login = Login;
        this.id_login = id_login;
        this.usuario = usuario;
        this.senha = senha;
    }

    public login getLogin() {
        return Login;
    }

    public void setLogin(login Login) {
        this.Login = Login;
    }

    public int getId_login() {
        return id_login;
    }

    public void setId_login(int id_login) {
        this.id_login = id_login;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
