package com.foroapirest.controller;

import com.foroapirest.dto.ActualizarTopicoRequest;
import com.foroapirest.dto.ActualizarTopicoResponse;
import com.foroapirest.service.ActualizarTopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topicos")
public class ActualizarTopicoController {

    @Autowired
    private ActualizarTopicoService actualizarTopicoService;

    @PutMapping("/{id}")
    public ResponseEntity<ActualizarTopicoResponse> actualizarTopico(
            @PathVariable Integer id,
            @RequestBody ActualizarTopicoRequest request) {

        if (id == null || request == null) {
            return ResponseEntity.badRequest().build();
        }

        ActualizarTopicoResponse response = actualizarTopicoService.actualizarTopico(id, request);

        if (response == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(response);
    }
}
