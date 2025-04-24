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
@Table(name = "mesa")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mesa")
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(length = 20)
    private Status estado;
}
