package com.mesago.mesago.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResponseDto {

    private Long userId;
    private String username;
    private String nombreTrabajador;
    private String cargo;
}
