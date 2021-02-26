/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Hulk_Store.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "inventario")
@XmlRootElement
@Data
@NoArgsConstructor
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @NotNull
    private Integer id;
    
    @Basic(optional = false)
    @Column(name = "producto")
    @NotEmpty
    private String producto;
    
    @Basic(optional = false)
    @Column(name = "precio")
    @NotEmpty
    private int precio;
    
    @Basic(optional = false)
    @Column(name = "Descripcion")
    @NotEmpty
    private String descripcion;
    
    @Basic(optional = false)
    @Column(name = "Cantidad")
    @NotNull
    private int cantidad;

 
    private String foto;
    
    
    
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
    public Inventario(Integer id, String producto, int precio, String descripcion, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }


}
