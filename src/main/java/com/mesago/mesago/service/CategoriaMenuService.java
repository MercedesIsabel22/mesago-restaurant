package com.mesago.mesago.service;


import com.mesago.mesago.dto.categoriaMenu.CategoriaMenuRequestDto;
import com.mesago.mesago.dto.categoriaMenu.CategoriaMenuResponseDto;

import java.util.List;

public interface CategoriaMenuService {
    List<CategoriaMenuResponseDto> listar();
    CategoriaMenuResponseDto guardar(CategoriaMenuRequestDto requestDTO);
    CategoriaMenuResponseDto obtenerPorId(Long id);
    void eliminar(Long id);

}
