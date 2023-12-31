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
@Table(name="rolopciones")
public class RolOpciones {
    //Definicion de Variables de la Tabla RolOpciones 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "idOpcion")
    private Integer idOpcion;
    
    @Column(name = "nombreOpcion")
    private String nombreOpcion;

    // Encapsulamiento de la tabla Rol
    /**
     * @return the idOpcion
     */
    public Integer getIdOpcion() {
        return idOpcion;
    }

    /**
     * @param idOpcion the idOpcion to set
     */
    public void setIdOpcion(Integer idOpcion) {
        this.idOpcion = idOpcion;
    }

    /**
     * @return the nombreOpcion
     */
    public String getNombreOpcion() {
        return nombreOpcion;
    }

    /**
     * @param nombreOpcion the nombreOpcion to set
     */
    public void setNombreOpcion(String nombreOpcion) {
        this.nombreOpcion = nombreOpcion;
    }
    
    
}
