/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_usuarios;

/**
 *
 * @author marce
 */

//Declaración de la interface Rol_usuariosRepositorio de la tabla rol_usuarios capa Repositorio

public interface Rol_usuariosRepositorio extends JpaRepository<Rol_usuarios, Integer>{
    
}
