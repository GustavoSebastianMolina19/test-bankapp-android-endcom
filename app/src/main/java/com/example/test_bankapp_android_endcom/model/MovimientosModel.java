package com.example.test_bankapp_android_endcom.model;

public class MovimientosModel {
    private String fecha;
    private String descripcion;
    private String mont;
    private String tipo;
    private int id;

    public MovimientosModel(String fecha, String mont, String tipo, int id) {
        this.fecha = fecha;
        this.mont = mont;
        this.tipo = tipo;
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMont() {
        return mont;
    }

    public void setMont(String mont) {
        this.mont = mont;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
