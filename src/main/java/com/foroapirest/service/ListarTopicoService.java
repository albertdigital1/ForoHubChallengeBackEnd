package com.foroapirest.service;

import com.foroapirest.dto.ListarTopicoResponse;
import com.foroapirest.entity.Topico;
import com.foroapirest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarTopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<ListarTopicoResponse> obtenerTopicos() {
        // Definir el paginador para obtener los primeros 10 resultados ordenados por fecha de creación en orden ascendente
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("fechaCreacion").ascending());

        // Obtener tópicos activos (activo = 1) desde la base de datos
        List<Topico> topicos = topicoRepository.findByActivo(1, pageRequest);

        // Transformar las entidades a DTOs de respuesta
        return topicos.stream()
                .map(topico -> new ListarTopicoResponse(
                        topico.getId(),
                        topico.getTitulo(),
                        topico.getMensaje(),
                        topico.getFechaCreacion()
                ))
                .collect(Collectors.toList());
    }
}
