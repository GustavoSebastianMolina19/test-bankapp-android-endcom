package com.example.test_bankapp_android_endcom.controller;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test_bankapp_android_endcom.R;
import com.example.test_bankapp_android_endcom.model.SaldosModel;

import java.util.ArrayList;

public class AdapterSaldos extends RecyclerView.Adapter<AdapterSaldos.ViewHolder> {
    private Context mContext;
    private ArrayList<SaldosModel> mLista;

    public AdapterSaldos(Context context, ArrayList<SaldosModel> lista){
        mContext = context;
        mLista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_saldo, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SaldosModel actual = mLista.get(position);

        String saldoTitulo = "Saldo general en cuentas";
        String saldo = "$" + actual.getSaldosCuenta();
        Log.d("importante", "onBindViewHolder: " + actual.getSaldosCuenta());

        holder.Saldo.setText(saldoTitulo);
        holder.monto.setText( saldo);
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView Saldo;
        public TextView monto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Saldo = itemView.findViewById(R.id.Saldotxt);
            monto = itemView.findViewById(R.id.TvSaldoS);

        }
    }
}
