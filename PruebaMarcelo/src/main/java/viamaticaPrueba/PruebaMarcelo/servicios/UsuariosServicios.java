/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import viamaticaPrueba.PruebaMarcelo.modelo.Usuarios;
import viamaticaPrueba.PruebaMarcelo.modelo.repositorio.UsuariosRepositorio;

/**
 *
 * @author marce
 */
public class UsuariosServicios implements IUsuariosServicios{

    @Autowired
    private UsuariosRepositorio usuarioRepositorio;
     
    @Override
    public List<Usuarios> listarUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuarios buscarUsuariosPorId(Integer idUsuario) {
        return usuarioRepositorio.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Usuarios usuario) {
         usuarioRepositorio.delete(usuario);
    }
    
}
