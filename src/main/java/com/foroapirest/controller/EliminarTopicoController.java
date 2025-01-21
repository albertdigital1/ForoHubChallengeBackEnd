package com.foroapirest.controller;

import com.foroapirest.service.EliminarTopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/topicos")
public class EliminarTopicoController {

    @Autowired
    private EliminarTopicoService eliminarTopicoService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }

        boolean eliminado = eliminarTopicoService.eliminarTopico(id);

        if (!eliminado) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
