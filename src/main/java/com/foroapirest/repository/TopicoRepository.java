package com.foroapirest.repository;

import com.foroapirest.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import java.util.Optional;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Integer> {
    List<Topico> findByActivo(Integer activo, Pageable pageable);
    Optional<Topico> findByTituloAndMensaje(String titulo, String mensaje);
}
