package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String url_perfil;
    private String nombre;
    private String titulo;
    private String acerca_de;

    public Persona() {
    }

    public Persona(long id, String url_perfil, String nombre, String titulo, String acerca_de) {
        this.id = id;
        this.url_perfil = url_perfil;
        this.nombre = nombre;
        this.titulo = titulo;
        this.acerca_de = acerca_de;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl_perfil() {
        return url_perfil;
    }

    public void setUrl_perfil(String url_perfil) {
        this.url_perfil = url_perfil;
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

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }
}
