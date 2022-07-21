package com.example.test_bankapp_android_endcom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test_bankapp_android_endcom.controller.AdapterMovimientos;
import com.example.test_bankapp_android_endcom.controller.AdapterSaldos;
import com.example.test_bankapp_android_endcom.controller.AdapterTarjestas;
import com.example.test_bankapp_android_endcom.model.MovimientosModel;
import com.example.test_bankapp_android_endcom.model.SaldosModel;
import com.example.test_bankapp_android_endcom.model.tarjetaModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView recyclerTarjetas;
    private RecyclerView recyclerTMovimientos;
    private SaldosModel saldomodel;
    private tarjetaModel modelTarjeta;
    private MovimientosModel modelMovimiento;
    private ArrayList<SaldosModel> lista;
    private ArrayList<tarjetaModel> listatarjeta;
    private ArrayList<MovimientosModel> listaMovimientos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.RvSaldos);
        recyclerTarjetas = findViewById(R.id.RvTarjetas);
        recyclerTMovimientos = findViewById(R.id.RvMovimientos);

        lista = new ArrayList<>();
        listatarjeta = new ArrayList<>();
        listaMovimientos = new ArrayList<>();

        saldomodel = new SaldosModel(2, 200, 300,300,200);
        lista.add(saldomodel);

        modelTarjeta = new tarjetaModel(2,"122566533", "GUSTAVO SEBASTIAN", 20000, "Activo", "Titular");
        listatarjeta.add(modelTarjeta);

        modelTarjeta = new tarjetaModel(2,"122566533", "GUSTAVO SEBASTIAN", 20000, "Activo", "Titular");
        listatarjeta.add(modelTarjeta);

        modelMovimiento = new MovimientosModel("19-07-2022","2000","Abono",2);
        listaMovimientos.add(modelMovimiento);
        modelMovimiento = new MovimientosModel("19-07-2022","2000","Abono",2);
        listaMovimientos.add(modelMovimiento);
        modelMovimiento = new MovimientosModel("19-07-2022","2000","Abono",2);
        listaMovimientos.add(modelMovimiento);
        modelMovimiento = new MovimientosModel("19-07-2022","2000","Abono",2);
        listaMovimientos.add(modelMovimiento);
        modelMovimiento = new MovimientosModel("19-07-2022","2000","Abono",2);
        listaMovimientos.add(modelMovimiento);



        AdapterSaldos myAdapter = new AdapterSaldos(this, lista);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(myAdapter);

        AdapterTarjestas adapterTarjestas = new AdapterTarjestas(this, listatarjeta);
        recyclerTarjetas.setLayoutManager(new LinearLayoutManager(this));
        recyclerTarjetas.setAdapter(adapterTarjestas);

        AdapterMovimientos adapterMovimientos = new AdapterMovimientos(this, listaMovimientos);
        recyclerTMovimientos.setLayoutManager(new LinearLayoutManager(this));
        recyclerTMovimientos.setAdapter(adapterMovimientos);

    }


}