package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String urlPerfil;
    private String nombre;
    private String titulo;
    private String acercaDe;

    public Persona() {
    }

    public Persona(long id, String urlPerfil, String nombre, String titulo, String acercaDe) {
        this.id = id;
        this.urlPerfil = urlPerfil;
        this.nombre = nombre;
        this.titulo = titulo;
        this.acercaDe = acercaDe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlPerfil() {
        return urlPerfil;
    }

    public void setUrlPerfil(String urlPerfil) {
        this.urlPerfil = urlPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }
}
