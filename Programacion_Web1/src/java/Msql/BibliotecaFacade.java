/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Msql;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Steven Chimbo
 */
@Stateless
public class BibliotecaFacade extends AbstractFacade<Biblioteca> {

    @PersistenceContext(unitName = "JWebChimboPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BibliotecaFacade() {
        super(Biblioteca.class);
    }
    
}
