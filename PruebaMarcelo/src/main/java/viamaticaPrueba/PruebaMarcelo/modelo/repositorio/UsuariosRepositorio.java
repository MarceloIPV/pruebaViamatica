/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;

/**
 *
 * @author marce
 */

//Declaración de la interface UsuariosRepositorio de la tabla usuarios capa Repositorio

public interface UsuariosRepositorio extends JpaRepository<Usuarios, Integer>{
    
}
