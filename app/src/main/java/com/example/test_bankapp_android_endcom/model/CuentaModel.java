package com.example.test_bankapp_android_endcom.model;

public class CuentaModel {
    private int cuentaId;
    private String cuentaNumero;
    private String CuentaNombre;
    private String UltimaSesion;

    public int getCuentaId() {
        return cuentaId;
    }

    public void setCuentaId(int cuentaId) {
        this.cuentaId = cuentaId;
    }

    public String getCuentaNumero() {
        return cuentaNumero;
    }

    public void setCuentaNumero(String cuentaNumero) {
        this.cuentaNumero = cuentaNumero;
    }

    public String getCuentaNombre() {
        return CuentaNombre;
    }

    public void setCuentaNombre(String cuentaNombre) {
        CuentaNombre = cuentaNombre;
    }

    public String getUltimaSesion() {
        return UltimaSesion;
    }

    public void setUltimaSesion(String ultimaSesion) {
        UltimaSesion = ultimaSesion;
    }
}
