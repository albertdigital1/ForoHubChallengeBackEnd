package com.foroapirest.dto;

public class ActualizarTopicoResponse {
    private Integer id;
    private String titulo;
    private String mensaje;
    private Integer status;
    private Integer activo;

    // Constructor
    public ActualizarTopicoResponse(Integer id, String titulo, String mensaje, Integer status, Integer activo) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
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
