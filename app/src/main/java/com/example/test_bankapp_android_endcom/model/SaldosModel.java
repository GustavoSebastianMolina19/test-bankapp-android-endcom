package com.example.test_bankapp_android_endcom.model;

public class SaldosModel {
    private int saldosId;
    private int saldosCuenta;
    private int saldoGeneral;
    private int ingresos;
    private int gastos;

    public SaldosModel(int saldosId, int saldosCuenta, int saldoGeneral, int ingresos, int gastos) {
        this.saldosId = saldosId;
        this.saldosCuenta = saldosCuenta;
        this.saldoGeneral = saldoGeneral;
        this.ingresos = ingresos;
        this.gastos = gastos;
    }

    public int getSaldosId() {
        return saldosId;
    }

    public void setSaldosId(int saldosId) {
        this.saldosId = saldosId;
    }

    public int getSaldosCuenta() {
        return saldosCuenta;
    }

    public void setSaldosCuenta(int saldosCuenta) {
        this.saldosCuenta = saldosCuenta;
    }

    public int getSaldoGeneral() {
        return saldoGeneral;
    }

    public void setSaldoGeneral(int saldoGeneral) {
        this.saldoGeneral = saldoGeneral;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }
}
