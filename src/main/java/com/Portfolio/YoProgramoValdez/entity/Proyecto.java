package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombreProyecto;
    private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(long id, String nombreProyecto, String urlProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.urlProyecto = urlProyecto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getUrlProyecto() {
        return urlProyecto;
    }

    public void setUrlProyecto(String urlProyecto) {
        this.urlProyecto = urlProyecto;
    }
}
