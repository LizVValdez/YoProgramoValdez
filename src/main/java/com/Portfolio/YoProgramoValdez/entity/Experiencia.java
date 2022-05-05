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
    private String tiempoExperiencia;

    public Experiencia() {
    }

    public Experiencia(long id, String urlExperiencia, String tituloExperiencia, String institucionExperiencia, String tiempoExperiencia) {
        this.id = id;
        this.urlExperiencia = urlExperiencia;
        this.tituloExperiencia = tituloExperiencia;
        this.institucionExperiencia = institucionExperiencia;
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

    public String getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(String tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
