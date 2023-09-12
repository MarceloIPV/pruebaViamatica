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
@Table(name="rol_usuarios")
public class Rol_usuarios {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rolUsuario;
            
    private Integer rol_IdRol;
    private Integer usuarios_IdUsuarios;

    /**
     * @return the id_rolUsuario
     */
    public Integer getId_rolUsuario() {
        return id_rolUsuario;
    }

    /**
     * @param id_rolUsuario the id_rolUsuario to set
     */
    public void setId_rolUsuario(Integer id_rolUsuario) {
        this.id_rolUsuario = id_rolUsuario;
    }

    /**
     * @return the rol_IdRol
     */
    public Integer getRol_IdRol() {
        return rol_IdRol;
    }

    /**
     * @param rol_IdRol the rol_IdRol to set
     */
    public void setRol_IdRol(Integer rol_IdRol) {
        this.rol_IdRol = rol_IdRol;
    }

    /**
     * @return the usuarios_IdUsuarios
     */
    public Integer getUsuarios_IdUsuarios() {
        return usuarios_IdUsuarios;
    }

    /**
     * @param usuarios_IdUsuarios the usuarios_IdUsuarios to set
     */
    public void setUsuarios_IdUsuarios(Integer usuarios_IdUsuarios) {
        this.usuarios_IdUsuarios = usuarios_IdUsuarios;
    }
    
    
}
