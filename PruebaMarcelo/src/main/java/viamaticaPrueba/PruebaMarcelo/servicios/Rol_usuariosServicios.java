/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_usuarios;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.Rol_usuariosRepositorio;

/**
 *
 * @author marce
 */
public class Rol_usuariosServicios implements  IRol_usuariosServicios{
    
    @Autowired
    private Rol_usuariosRepositorio rol_usuariosRepositorio;

    @Override
    public List<Rol_usuarios> listaRol_usuario() {
        return rol_usuariosRepositorio.findAll();
    }

    @Override
    public Rol_usuarios buscarRol_usuarioPorId(Integer idRol_usuario) {
        return rol_usuariosRepositorio.findById(idRol_usuario).orElse(null);

    }

    @Override
    public Rol_usuarios guardarRol_usuarioOpciones(Rol_usuarios rol_usuario) {
         return rol_usuariosRepositorio.save(rol_usuario);

    }

    @Override
    public void eliminarRol_usuario(Rol_usuarios rol_usuario) {
        rol_usuariosRepositorio.delete(rol_usuario);

    }


    
}
