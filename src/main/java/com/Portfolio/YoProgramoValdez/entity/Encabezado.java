package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "encabezado")
public class Encabezado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String urlArgPrograma;
    private String urlFacebook;
    private String urlGithub;
    private String urlEmail;
    private String urlBanner;

    public Encabezado() {
    }

    public Encabezado(long id, String urlArgPrograma, String urlFacebook, String urlGithub, String urlEmail, String urlBanner) {
        this.id = id;
        this.urlArgPrograma = urlArgPrograma;
        this.urlFacebook = urlFacebook;
        this.urlGithub = urlGithub;
        this.urlEmail = urlEmail;
        this.urlBanner = urlBanner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrlArgPrograma() {
        return urlArgPrograma;
    }

    public void setUrlArgPrograma(String urlArgPrograma) {
        this.urlArgPrograma = urlArgPrograma;
    }

    public String getUrlFacebook() {
        return urlFacebook;
    }

    public void setUrlFacebook(String urlFacebook) {
        this.urlFacebook = urlFacebook;
    }

    public String getUrlGithub() {
        return urlGithub;
    }

    public void setUrlGithub(String urlGithub) {
        this.urlGithub = urlGithub;
    }

    public String getUrlEmail() {
        return urlEmail;
    }

    public void setUrlEmail(String urlEmail) {
        this.urlEmail = urlEmail;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }
}
