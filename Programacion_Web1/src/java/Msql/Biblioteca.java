/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Msql;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Steven Chimbo
 */
@Entity
@Table(name = "biblioteca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Biblioteca.findAll", query = "SELECT b FROM Biblioteca b")
    , @NamedQuery(name = "Biblioteca.findByIdBiblioteca", query = "SELECT b FROM Biblioteca b WHERE b.idBiblioteca = :idBiblioteca")
    , @NamedQuery(name = "Biblioteca.findByNombreBiblio", query = "SELECT b FROM Biblioteca b WHERE b.nombreBiblio = :nombreBiblio")
    , @NamedQuery(name = "Biblioteca.findByNombreLibro", query = "SELECT b FROM Biblioteca b WHERE b.nombreLibro = :nombreLibro")
    , @NamedQuery(name = "Biblioteca.findByCategorias", query = "SELECT b FROM Biblioteca b WHERE b.categorias = :categorias")
    , @NamedQuery(name = "Biblioteca.findByNumeroLibro", query = "SELECT b FROM Biblioteca b WHERE b.numeroLibro = :numeroLibro")})
public class Biblioteca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idBiblioteca")
    private Integer idBiblioteca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_biblio")
    private String nombreBiblio;
    @Size(max = 45)
    @Column(name = "nombre_libro")
    private String nombreLibro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categorias")
    private String categorias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numero_libro")
    private String numeroLibro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bibliotecaidBiblioteca")
    private Collection<Estudiante> estudianteCollection;
    @JoinColumn(name = "Administrador_idAdministrador", referencedColumnName = "idAdministrador")
    @ManyToOne(optional = false)
    private Administrador administradoridAdministrador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bibliotecaidBiblioteca")
    private Collection<Docente> docenteCollection;

    public Biblioteca() {
    }

    public Biblioteca(Integer idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public Biblioteca(Integer idBiblioteca, String nombreBiblio, String categorias, String numeroLibro) {
        this.idBiblioteca = idBiblioteca;
        this.nombreBiblio = nombreBiblio;
        this.categorias = categorias;
        this.numeroLibro = numeroLibro;
    }

    public Integer getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Integer idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNombreBiblio() {
        return nombreBiblio;
    }

    public void setNombreBiblio(String nombreBiblio) {
        this.nombreBiblio = nombreBiblio;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getNumeroLibro() {
        return numeroLibro;
    }

    public void setNumeroLibro(String numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    @XmlTransient
    public Collection<Estudiante> getEstudianteCollection() {
        return estudianteCollection;
    }

    public void setEstudianteCollection(Collection<Estudiante> estudianteCollection) {
        this.estudianteCollection = estudianteCollection;
    }

    public Administrador getAdministradoridAdministrador() {
        return administradoridAdministrador;
    }

    public void setAdministradoridAdministrador(Administrador administradoridAdministrador) {
        this.administradoridAdministrador = administradoridAdministrador;
    }

    @XmlTransient
    public Collection<Docente> getDocenteCollection() {
        return docenteCollection;
    }

    public void setDocenteCollection(Collection<Docente> docenteCollection) {
        this.docenteCollection = docenteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBiblioteca != null ? idBiblioteca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biblioteca)) {
            return false;
        }
        Biblioteca other = (Biblioteca) object;
        if ((this.idBiblioteca == null && other.idBiblioteca != null) || (this.idBiblioteca != null && !this.idBiblioteca.equals(other.idBiblioteca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Msql.Biblioteca[ idBiblioteca=" + idBiblioteca + " ]";
    }
    
}
