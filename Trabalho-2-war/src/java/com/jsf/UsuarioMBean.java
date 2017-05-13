/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import com.ejb.fachada.UsuarioFachada;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jean
 */
@ManagedBean(name = "usuarioMBean")
@RequestScoped
public class UsuarioMBean {

    @EJB
    private UsuarioFachada usuarioFachada;
    
    private String email;

    private String senha;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the value of senha
     *
     * @return the value of senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Set the value of senha
     *
     * @param senha new value of senha
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }


    /**
     * Creates a new instance of UsuarioMBean
     */
    public UsuarioMBean() {
    }
    
    public boolean login() {
        usuarioFachada.autenticar(email, senha);
        return true;
    }
    
}
