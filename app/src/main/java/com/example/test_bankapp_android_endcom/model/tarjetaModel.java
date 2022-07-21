package com.example.test_bankapp_android_endcom.model;

public class tarjetaModel {
    private int idTarjeta;
    private String numTarjeta;
    private String nombreTarjeta;
    private int saldo;
    private String estado;
    private String tipo;

    public tarjetaModel(int idTarjeta, String numTarjeta, String nombreTarjeta, int saldo, String estado, String tipo) {
        this.idTarjeta = idTarjeta;
        this.numTarjeta = numTarjeta;
        this.nombreTarjeta = nombreTarjeta;
        this.saldo = saldo;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
