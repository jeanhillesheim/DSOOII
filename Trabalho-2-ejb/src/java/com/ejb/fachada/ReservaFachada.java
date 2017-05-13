/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.fachada;

import com.ejb.entity.Viagem;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jean
 */
@Stateless
@LocalBean
public class ReservaFachada {

    @PersistenceContext(unitName = "BusTicket-ejbPU")
    private EntityManager em;

    public List<Viagem> findViagens() {
        Query query = em.createNamedQuery("Viagem.findAll");
        List<Viagem> result = query.getResultList();
        System.out.println(result.get(0).toString());
        return result;
    }
    
    public void persist(Object object) {
        em.persist(object);
    }
}
