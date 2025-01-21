package com.foroapirest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class TopicoRequest {

    @NotNull(message = "El campo idUsuario es obligatorio")
    private Integer idUsuario;

    @NotNull(message = "El campo idCurso es obligatorio")
    private Integer idCurso;

    @NotBlank(message = "El campo título es obligatorio")
    private String titulo;

    @NotBlank(message = "El campo mensaje es obligatorio")
    private String mensaje;

    // Getters y setters
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
}
