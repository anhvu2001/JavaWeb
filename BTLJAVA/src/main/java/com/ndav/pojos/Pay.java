/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndav.pojos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "pay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pay.findAll", query = "SELECT p FROM Pay p"),
    @NamedQuery(name = "Pay.findById", query = "SELECT p FROM Pay p WHERE p.id = :id"),
    @NamedQuery(name = "Pay.findByTotalmoney", query = "SELECT p FROM Pay p WHERE p.totalmoney = :totalmoney")})
public class Pay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalmoney")
    private int totalmoney;
    @JoinColumn(name = "bookingtourid", referencedColumnName = "id")
    @OneToOne(optional = false)
    private Booktour bookingtourid;

    public Pay() {
    }

    public Pay(Long id) {
        this.id = id;
    }

    public Pay(Long id, int totalmoney) {
        this.id = id;
        this.totalmoney = totalmoney;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Booktour getBookingtourid() {
        return bookingtourid;
    }

    public void setBookingtourid(Booktour bookingtourid) {
        this.bookingtourid = bookingtourid;
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
        if (!(object instanceof Pay)) {
            return false;
        }
        Pay other = (Pay) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ndav.pojos.Pay[ id=" + id + " ]";
    }
    
}
