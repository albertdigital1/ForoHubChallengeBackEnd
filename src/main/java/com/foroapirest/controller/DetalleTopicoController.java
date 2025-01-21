package com.foroapirest.controller;

import com.foroapirest.dto.DetalleTopicoResponse;
import com.foroapirest.service.DetalleTopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topicos")
public class DetalleTopicoController {

    @Autowired
    private DetalleTopicoService detalleTopicoService;

    @GetMapping("/{id}")
    public ResponseEntity<DetalleTopicoResponse> obtenerDetalleTopico(@PathVariable Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }

        DetalleTopicoResponse topico = detalleTopicoService.obtenerDetalleTopico(id);
        if (topico == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(topico);
    }
}
