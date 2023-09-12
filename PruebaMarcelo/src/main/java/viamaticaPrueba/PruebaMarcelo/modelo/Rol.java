/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo;


/**
 *
 * @author marce
 */

import lombok.Setter;
import lombok.Getter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
    
 
    
     @Id
	@Getter @Setter @Column(name = "idRol")
    private Integer idRol;

    @Getter @Setter @Column(name = "rolName")
    private String rolName;
    
    
    
    
}
