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
import java.util.Date;
import javax.persistence.Column;


/**
 *
 * @author marce
 */

@Entity

@Table(name="sessions")
public class Sessions {
    //Definicion de Variables de la Tabla sessions 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSession")
    private Integer idSession;
    
    @Column(name = "fechaIngreso")
    private Date fechaIngreso;
    
    @Column(name = "fechaCierre")
    private Date fechaCierre;
    
    @Column(name = "usuario_IdUsuario")
    private Integer usuario_IdUsuario;

    // Encapsulamiento de las variables
    /**
     * @return the idSession
     */
    public Integer getIdSession() {
        return idSession;
    }

    /**
     * @param idSession the idSession to set
     */
    public void setIdSession(Integer idSession) {
        this.idSession = idSession;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the fechaCierre
     */
    public Date getFechaCierre() {
        return fechaCierre;
    }

    /**
     * @param fechaCierre the fechaCierre to set
     */
    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    /**
     * @return the usuario_IdUsuario
     */
    public Integer getUsuario_IdUsuario() {
        return usuario_IdUsuario;
    }

    /**
     * @param usuario_IdUsuario the usuario_IdUsuario to set
     */
    public void setUsuario_IdUsuario(Integer usuario_IdUsuario) {
        this.usuario_IdUsuario = usuario_IdUsuario;
    }
    
    
}
