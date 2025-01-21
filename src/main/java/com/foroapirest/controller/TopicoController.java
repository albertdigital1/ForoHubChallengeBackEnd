package com.foroapirest.controller;

import com.foroapirest.dto.TopicoRequest;
import com.foroapirest.entity.Topico;
import com.foroapirest.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/topicos")
@Validated
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping("/registro")
    public ResponseEntity<?> registrarTopico(@Valid @RequestBody TopicoRequest topicoRequest) {
        topicoService.validarYRegistrarTopico(topicoRequest);
        return new ResponseEntity<>("Tópico registrado exitosamente", HttpStatus.CREATED);
    }
}
