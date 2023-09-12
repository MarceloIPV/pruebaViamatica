/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author marce
 */

@Entity
@Table(name="rol_rolopciones")
public class Rol_rolOpciones {
   
    @Id
            @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idRolRolOpciones;
    
    private Integer rol_idRol;
    private Integer rolOpciones_idOpcion;

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
