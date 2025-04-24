package com.mesago.mesago.dto.usuario;

import com.mesago.mesago.entity.Trabajador;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDto {

    @NotBlank(message = "El nombre es obligatorio")
    @Email(message = "El email debe ser válido" )
    @Size(max = 100, message = "El email no debe exceder los 100 ")
    private String username;
    @NotBlank(message = " La contraseña es obligatorio")
    @Size(max = 30, message = "La contraseña debe tener al menos 30 caracteres")
    private String password;
    @NotNull(message = "El trabajador es obligatorio")
    private Trabajador trabajador;
}
