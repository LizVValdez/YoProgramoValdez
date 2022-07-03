package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "habilidad")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombreHabilidad;
    private int porcentajeHabilidad;

    public Habilidad() {
    }

    public Habilidad(long id, String nombreHabilidad, int porcentajeHabilidad) {
        this.id = id;
        this.nombreHabilidad = nombreHabilidad;
        this.porcentajeHabilidad = porcentajeHabilidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public int getPorcentajeHabilidad() {
        return porcentajeHabilidad;
    }

    public void setPorcentajeHabilidad(int porcentajeHabilidad) {
        this.porcentajeHabilidad = porcentajeHabilidad;
    }

    @Override
    public String toString(){
        return "Habilidades {" +
                "id=" + id + '\'' +
                "Habilidad=" + nombreHabilidad + '\'' +
                "Porcentaje=" + porcentajeHabilidad + '\'' +
                '}';
    }
}
