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
@Table(name="rol_rolopciones")
public class Rol_rolOpciones {
    
    //Definicion de Variables de la Tabla rol_rolopciones 
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idRolRolOpciones")
    private Integer idRolRolOpciones;
    
    @Column(name = "rol_idRol")
    private Integer rol_idRol;
    
    @Column(name = "rolOpciones_idOpcion")
    private Integer rolOpciones_idOpcion;
    
    // Encapsulamiento de las variables

    /**
     * @return the idRolRolOpciones
     */
    public Integer getIdRolRolOpciones() {
        return idRolRolOpciones;
    }

    /**
     * @param idRolRolOpciones the idRolRolOpciones to set
     */
    public void setIdRolRolOpciones(Integer idRolRolOpciones) {
        this.idRolRolOpciones = idRolRolOpciones;
    }

    /**
     * @return the rol_idRol
     */
    public Integer getRol_idRol() {
        return rol_idRol;
    }

    /**
     * @param rol_idRol the rol_idRol to set
     */
    public void setRol_idRol(Integer rol_idRol) {
        this.rol_idRol = rol_idRol;
    }

    /**
     * @return the rolOpciones_idOpcion
     */
    public Integer getRolOpciones_idOpcion() {
        return rolOpciones_idOpcion;
    }

    /**
     * @param rolOpciones_idOpcion the rolOpciones_idOpcion to set
     */
    public void setRolOpciones_idOpcion(Integer rolOpciones_idOpcion) {
        this.rolOpciones_idOpcion = rolOpciones_idOpcion;
    }
    
    
    
}
