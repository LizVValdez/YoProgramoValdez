package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String urlExperiencia;
    private String tituloExperiencia;
    private String institucionExperiencia;

    private String descripcionExperiencia;
    private String tiempoExperiencia;

    public Experiencia() {
    }

    public Experiencia(long id, String urlExperiencia, String tituloExperiencia, String institucionExperiencia, String descripcionExperiencia, String tiempoExperiencia) {
        this.id = id;
        this.urlExperiencia = urlExperiencia;
        this.tituloExperiencia = tituloExperiencia;
        this.institucionExperiencia = institucionExperiencia;
        this.descripcionExperiencia = descripcionExperiencia;
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlExperiencia() {
        return urlExperiencia;
    }

    public void setUrlExperiencia(String urlExperiencia) {
        this.urlExperiencia = urlExperiencia;
    }

    public String getTituloExperiencia() {
        return tituloExperiencia;
    }

    public void setTituloExperiencia(String tituloExperiencia) {
        this.tituloExperiencia = tituloExperiencia;
    }

    public String getInstitucionExperiencia() {
        return institucionExperiencia;
    }

    public void setInstitucionExperiencia(String institucionExperiencia) {
        this.institucionExperiencia = institucionExperiencia;
    }

    public String getDescripcionExperiencia() {
        return descripcionExperiencia;
    }

    public void setDescripcionExperiencia(String descripcionExperiencia) {
        this.descripcionExperiencia = descripcionExperiencia;
    }

    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
