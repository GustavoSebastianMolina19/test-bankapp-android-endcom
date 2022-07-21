package com.example.test_bankapp_android_endcom.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test_bankapp_android_endcom.R;
import com.example.test_bankapp_android_endcom.model.tarjetaModel;

import java.util.ArrayList;

public class AdapterTarjestas extends RecyclerView.Adapter<AdapterTarjestas.ViewHolder> {
    private Context mContext;
    private ArrayList<tarjetaModel> mLista;

    public AdapterTarjestas(Context context, ArrayList<tarjetaModel> lista){
        mContext = context;
        mLista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_tarjeta, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        tarjetaModel modelo = mLista.get(position);

        String Activa = modelo.getEstado();
        String numeroTarjeta = modelo.getNumTarjeta();
        String nombreTarjeta = modelo.getNombreTarjeta();
        String titula = modelo.getTipo();
        int saldo = modelo.getSaldo();

        holder.TvActiva.setText(Activa);
        holder.TvNumeroTarjeta.setText(numeroTarjeta);
        holder.TvNombreTarjeta.setText(nombreTarjeta);
        holder.TvTitular.setText(titula);
        holder.TvSaldo.setText("$"+ saldo);

    }


    @Override
    public int getItemCount() {
        return mLista.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView Ivimagen;
        public TextView TvActiva;
        public TextView TvNumeroTarjeta;
        public TextView TvNombreTarjeta;
        public TextView TvTitular;
        public TextView TvSaldo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Ivimagen = itemView.findViewById(R.id.Ivtarjeta);
            TvActiva = itemView.findViewById(R.id.tvActiva);
            TvNumeroTarjeta = itemView.findViewById(R.id.tvNumeroTarjeta);
            TvNombreTarjeta = itemView.findViewById(R.id.tvNombreTarjeta);
            TvTitular = itemView.findViewById(R.id.tvTitular);
            TvSaldo = itemView.findViewById(R.id.tvSaldo);

        }
    }
}
