package com.raul.usuario_service.service;

import java.util.List;

import com.raul.usuario_service.dto.SaveUser;
import com.raul.usuario_service.entity.Usuario;

public interface UsuarioService {

    Usuario saveUsuario(SaveUser saveUser);

    List<Usuario> getAll();

    Usuario getUsuarioById(String usuarioid);

    Usuario getUsuarioByUsername(String usuarioid);
}
