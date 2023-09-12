/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author marce
 */



@Entity
@Table(name = "rol")
public class Rol {
    
    //Definicion de Variables de la Tabla Personas 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "idRol")
    private Integer idRol;

    @Column(name = "rolName")
    private String rolName;

    // Encapsulamiento de la tabla Rol
    /**
     * @return the idRol
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    /**
     * @return the rolName
     */
    public String getRolName() {
        return rolName;
    }

    /**
     * @param rolName the rolName to set
     */
    public void setRolName(String rolName) {
        this.rolName = rolName;
    }
    
    
    
    
}
