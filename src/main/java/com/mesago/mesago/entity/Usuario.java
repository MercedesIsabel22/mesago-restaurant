package com.mesago.mesago.entity;

import com.mesago.mesago.dto.enumeration.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(length = 20)
    private Status estado;


    @ManyToOne
    @JoinColumn(name = "id_trabajador", nullable = false)
    private Trabajador trabajador;
}
