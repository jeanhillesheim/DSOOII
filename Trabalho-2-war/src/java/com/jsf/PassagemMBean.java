/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jean
 */
@Named(value = "passagemMBean")
@RequestScoped
public class PassagemMBean {
    
    /**
     * Creates a new instance of PassagemMBean
     */
    public PassagemMBean() {
    }
    
}
