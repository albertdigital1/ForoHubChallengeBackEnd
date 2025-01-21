package com.foroapirest.service;

import com.foroapirest.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EliminarTopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public boolean eliminarTopico(Integer id) {
        // Verificar si el tópico existe
        if (topicoRepository.findById(id).isPresent()) {
            // Eliminar el tópico
            topicoRepository.deleteById(id);
            return true;
        }
        return false; // El tópico no existe
    }
}
