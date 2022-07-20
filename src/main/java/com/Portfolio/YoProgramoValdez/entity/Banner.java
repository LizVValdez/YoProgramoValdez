package com.Portfolio.YoProgramoValdez.entity;

import javax.persistence.*;

@Entity
@Table(name = "Banner")
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String urlBanner;

    public Banner() {
    }

    public Banner(long id, String urlBanner) {
        this.id = id;
        this.urlBanner = urlBanner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }
}
