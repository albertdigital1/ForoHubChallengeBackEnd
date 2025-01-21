package com.foroapirest.dto;

import java.time.LocalDateTime;

public class DetalleTopicoResponse {
    private Integer id;
    private Integer idUsuario;
    private Integer idCurso;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Integer status;
    private Integer activo;

    // Constructor
    public DetalleTopicoResponse(Integer id, Integer idUsuario, Integer idCurso, String titulo, String mensaje,
                                 LocalDateTime fechaCreacion, Integer status, Integer activo) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idCurso = idCurso;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = fechaCreacion;
        this.status = status;
        this.activo = activo;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }
}
