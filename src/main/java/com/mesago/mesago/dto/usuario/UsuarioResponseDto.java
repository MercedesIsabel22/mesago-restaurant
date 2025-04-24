package com.mesago.mesago.dto.usuario;

import com.mesago.mesago.entity.Trabajador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDto {

    private Long id;
    private String username;
    private String estado;
    private Trabajador trabajador;

}
