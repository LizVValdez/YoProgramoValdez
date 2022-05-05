package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String urlEducacion;
    private String tituloEducacion;
    private String institucionEducacion;
    private String tiempoEducacion;

    public Educacion() {
    }

    public Educacion(long id, String urlEducacion, String tituloEducacion, String institucionEducacion, String tiempoEducacion) {
        this.id = id;
        this.urlEducacion = urlEducacion;
        this.tituloEducacion = tituloEducacion;
        this.institucionEducacion = institucionEducacion;
        this.tiempoEducacion = tiempoEducacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlEducacion() {
        return urlEducacion;
    }

    public void setUrlEducacion(String urlEducacion) {
        this.urlEducacion = urlEducacion;
    }

    public String getTituloEducacion() {
        return tituloEducacion;
    }

    public void setTituloEducacion(String tituloEducacion) {
        this.tituloEducacion = tituloEducacion;
    }

    public String getInstitucionEducacion() {
        return institucionEducacion;
    }

    public void setInstitucionEducacion(String institucionEducacion) {
        this.institucionEducacion = institucionEducacion;
    }

    public String getTiempoEducacion() {
        return tiempoEducacion;
    }

    public void setTiempoEducacion(String tiempoEducacion) {
        this.tiempoEducacion = tiempoEducacion;
    }
}
