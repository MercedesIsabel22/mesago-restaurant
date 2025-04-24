package com.mesago.mesago.repository;

import com.mesago.mesago.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

   Usuario findByUsernameAndPassword(String username, String password);
}
