package com.mesago.mesago.service.impl;

import com.mesago.mesago.dto.usuario.UsuarioRequestDto;
import com.mesago.mesago.dto.usuario.UsuarioResponseDto;
import com.mesago.mesago.entity.Usuario;
import com.mesago.mesago.repository.UsuarioRepository;
import com.mesago.mesago.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository userRepository;
    @Override
    public UsuarioResponseDto crear(UsuarioRequestDto usuarioRequestDto) {
        return null;
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return null;
    }

    @Override
    public void eliminarUser(Usuario id) {
        dfdfsfdsdf

    }
}
