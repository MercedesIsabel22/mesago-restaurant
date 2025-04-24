package com.mesago.mesago.service.impl;

import com.mesago.mesago.dto.categoriaMenu.CategoriaMenuRequestDto;
import com.mesago.mesago.dto.categoriaMenu.CategoriaMenuResponseDto;
import com.mesago.mesago.service.CategoriaMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaMenuServiceImpl implements CategoriaMenuService {



    @Override
    public List<CategoriaMenuResponseDto> listar() {
        return List.of();
    }

    @Override
    public CategoriaMenuResponseDto guardar(CategoriaMenuRequestDto requestDTO) {
        return null;
    }

    @Override
    public CategoriaMenuResponseDto obtenerPorId(Long id) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
