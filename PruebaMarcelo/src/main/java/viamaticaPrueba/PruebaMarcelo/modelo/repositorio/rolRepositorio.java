/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol;

/**
 *
 * @author marce
 */

//Declaración de la interface rolRepositorio de la tabla rol capa Repositorio

public interface rolRepositorio extends JpaRepository<Rol, Integer>  {
    
}
