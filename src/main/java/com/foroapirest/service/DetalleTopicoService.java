package com.foroapirest.service;

import com.foroapirest.dto.DetalleTopicoResponse;
import com.foroapirest.entity.Topico;
import com.foroapirest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleTopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public DetalleTopicoResponse obtenerDetalleTopico(Integer id) {
        Topico topico = topicoRepository.findById(id).orElse(null);
        if (topico == null) {
            return null;
        }

        // Transformar la entidad a DTO
        return new DetalleTopicoResponse(
                topico.getId(),
                topico.getIdUsuario(),
                topico.getIdCurso(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getStatus(),
                topico.getActivo()
        );
    }
}
