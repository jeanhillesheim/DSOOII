/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import com.ejb.entity.Reserva;
import com.ejb.entity.Viagem;
import com.ejb.fachada.ReservaFachada;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jean
 */
@ManagedBean(name = "reservaMBean")
@RequestScoped
public class ReservaMBean {

    @EJB
    private ReservaFachada reservaFachada;

    private List<Viagem> viagens;
    /**
     * Creates a new instance of ReservaMBean
     */
    public ReservaMBean() {
    }

    @PostConstruct
    public void init() {
        viagens = getViagens();
    }

    public List<Viagem> getViagens() {
        return reservaFachada.findViagens();
    }

    public Reserva comprar() {
        return null;
    }
    
}
