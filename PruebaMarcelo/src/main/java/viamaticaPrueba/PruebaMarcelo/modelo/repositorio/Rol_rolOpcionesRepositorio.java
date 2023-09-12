/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_rolOpciones;

/**
 *
 * @author marce
 */

//Declaración de la interface Rol_rolOpcionesRepositorio de la tabla rol_rolOpciones capa Repositorio
public interface Rol_rolOpcionesRepositorio extends JpaRepository<Rol_rolOpciones, Integer>  {
    
}
