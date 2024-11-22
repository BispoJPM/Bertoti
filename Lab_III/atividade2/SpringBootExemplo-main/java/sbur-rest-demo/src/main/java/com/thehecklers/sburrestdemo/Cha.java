package com.thehecklers.sburrestdemo;

import java.util.UUID;

public class Cha {
    private final String id;
    private String tipo;
    private String sabor;

    public Cha(String tipo, String sabor) {
        this.id = UUID.randomUUID().toString();
        this.tipo = tipo;
        this.sabor = sabor;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
