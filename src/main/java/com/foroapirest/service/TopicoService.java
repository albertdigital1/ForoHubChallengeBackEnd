package com.foroapirest.service;

import com.foroapirest.dto.TopicoRequest;
import com.foroapirest.entity.Topico;
import com.foroapirest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public void validarYRegistrarTopico(TopicoRequest topicoRequest) {
        // Verificar si ya existe un tópico con el mismo título y mensaje
        Optional<Topico> topicoExistente = topicoRepository.findByTituloAndMensaje(
                topicoRequest.getTitulo(), topicoRequest.getMensaje()
        );

        if (topicoExistente.isPresent()) {
            throw new IllegalArgumentException("Ya existe un tópico con el mismo título y mensaje.");
        }

        // Crear y guardar el nuevo tópico
        Topico nuevoTopico = new Topico();
        nuevoTopico.setIdUsuario(topicoRequest.getIdUsuario());
        nuevoTopico.setIdCurso(topicoRequest.getIdCurso());
        nuevoTopico.setTitulo(topicoRequest.getTitulo());
        nuevoTopico.setMensaje(topicoRequest.getMensaje());
        nuevoTopico.setFechaCreacion(LocalDateTime.now());
        nuevoTopico.setStatus(1);
        nuevoTopico.setActivo(1);

        topicoRepository.save(nuevoTopico);
    }
}
