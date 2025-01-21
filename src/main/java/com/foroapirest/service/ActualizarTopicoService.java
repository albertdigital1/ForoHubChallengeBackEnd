package com.foroapirest.service;

import com.foroapirest.dto.ActualizarTopicoRequest;
import com.foroapirest.dto.ActualizarTopicoResponse;
import com.foroapirest.entity.Topico;
import com.foroapirest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActualizarTopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public ActualizarTopicoResponse actualizarTopico(Integer id, ActualizarTopicoRequest request) {
        Optional<Topico> optionalTopico = topicoRepository.findById(id);

        if (optionalTopico.isEmpty()) {
            return null; // El tópico no existe
        }

        Topico topico = optionalTopico.get();

        // Actualizar los campos del tópico
        topico.setTitulo(request.getTitulo());
        topico.setMensaje(request.getMensaje());
        topico.setStatus(request.getStatus());
        topico.setActivo(request.getActivo());

        // Guardar los cambios
        Topico topicoActualizado = topicoRepository.save(topico);

        // Retornar respuesta
        return new ActualizarTopicoResponse(
                topicoActualizado.getId(),
                topicoActualizado.getTitulo(),
                topicoActualizado.getMensaje(),
                topicoActualizado.getStatus(),
                topicoActualizado.getActivo()
        );
    }
}
