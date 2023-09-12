/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viamaticaPrueba.PruebaMarcelo.servicios;

import java.util.List;
import viamaticaPrueba.PruebaMarcelo.modelo.Rol_usuarios;

/**
 *
 * @author marce
 */
public interface IRol_usuariosServicios {
     public List<Rol_usuarios> listaRol_usuario();
    
    public Rol_usuarios buscarRol_usuarioPorId(Integer idRol_usuario);
     
    public Rol_usuarios guardarRol_usuarioOpciones(Rol_usuarios rol_usuario);
    
    public void eliminarRol_usuario(Rol_usuarios rol_usuario);
}
