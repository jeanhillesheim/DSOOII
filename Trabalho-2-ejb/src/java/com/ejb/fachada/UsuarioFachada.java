/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.fachada;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jean
 */
@Stateless
@LocalBean
public class UsuarioFachada {

    @PersistenceContext(unitName = "BusTicket-ejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void autenticar(String email, String senha) {
        Query query = em.createNamedQuery("Usuario.autenticar");
        query.setParameter("email", email);
        query.setParameter("senha", senha);
        List<com.ejb.entity.Usuario> usuario = query.getResultList();
        if (!usuario.isEmpty()) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("reserva.xhtml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void persist(Object object) {
        em.persist(object);
    }
}
