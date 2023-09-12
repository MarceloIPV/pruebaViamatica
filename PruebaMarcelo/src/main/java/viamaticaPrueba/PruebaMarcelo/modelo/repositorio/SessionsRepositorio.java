/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import viamaticaPrueba.PruebaMarcelo.modelo.Sessions;

/**
 *
 * @author marce
 */

//Declaración de la interface SessionsRepositorio de la tabla sessions capa Repositorio

public interface SessionsRepositorio extends JpaRepository<Sessions, Integer> {
    
}
