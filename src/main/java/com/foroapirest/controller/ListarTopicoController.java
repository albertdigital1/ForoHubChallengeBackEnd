package com.foroapirest.controller;

import com.foroapirest.dto.ListarTopicoResponse;
import com.foroapirest.service.ListarTopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/topicos")
public class ListarTopicoController {

    @Autowired
    private ListarTopicoService listarTopicoService;

    @GetMapping("/listar")
    public ResponseEntity<List<ListarTopicoResponse>> listarTopicos() {
        List<ListarTopicoResponse> topicos = listarTopicoService.obtenerTopicos();
        return ResponseEntity.ok(topicos);
    }
}
