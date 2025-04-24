package com.mesago.mesago.service;

import com.mesago.mesago.dto.usuario.UsuarioRequestDto;
import com.mesago.mesago.dto.usuario.UsuarioResponseDto;
import com.mesago.mesago.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    UsuarioResponseDto crear (UsuarioRequestDto usuarioRequestDto);


    List< Usuario> listarUsuarios();

    void eliminarUser (Usuario id);
}
