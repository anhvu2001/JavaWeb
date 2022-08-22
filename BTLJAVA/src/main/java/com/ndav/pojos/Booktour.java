/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndav.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "booktour")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Booktour.findAll", query = "SELECT b FROM Booktour b"),
    @NamedQuery(name = "Booktour.findById", query = "SELECT b FROM Booktour b WHERE b.id = :id")})
public class Booktour implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bookingtourid")
    private Pay pay;
    @JoinColumn(name = "tourid", referencedColumnName = "id")
    @ManyToOne
    private Tour tourid;
    @JoinColumn(name = "userid", referencedColumnName = "id")
    @ManyToOne
    private User userid;

    public Booktour() {
    }

    public Booktour(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pay getPay() {
        return pay;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public Tour getTourid() {
        return tourid;
    }

    public void setTourid(Tour tourid) {
        this.tourid = tourid;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Booktour)) {
            return false;
        }
        Booktour other = (Booktour) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndav.pojos.Booktour[ id=" + id + " ]";
    }
    
}
