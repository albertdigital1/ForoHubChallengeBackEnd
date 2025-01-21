package com.foroapirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "topico")
public class Topico {

    @Id
    private int id;
    private int idUsuario;
    private int idCurso;
    private String titulo;
    private String mensaje;
    private String fechaCreacion;
    private int status;
    private int activo;

    // Getters y setters
}
