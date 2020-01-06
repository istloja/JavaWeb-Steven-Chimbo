/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Msql;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Steven Chimbo
 */
@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador> {

    @PersistenceContext(unitName = "JWebChimboPU")
    private EntityManager em;
    private List<Biblioteca> Libro;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public List <Biblioteca> Libro(){
        String valor="Jipiro";
        List <Biblioteca> libro= null;
            TypedQuery<Biblioteca> consulta= getEntityManager().createQuery("SELECT b FROM Biblioteca b WHERE b.nombreBiblio = :nombreBiblio",Biblioteca.class);
            consulta.setParameter("nombreBiblio ", "valor");
            Libro = consulta.getResultList();
        
        
    
        return null;
    }

    public AdministradorFacade() {
        super(Administrador.class);
    }
    
}
