package com.example.test_bankapp_android_endcom.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test_bankapp_android_endcom.R;
import com.example.test_bankapp_android_endcom.model.MovimientosModel;
import com.example.test_bankapp_android_endcom.model.SaldosModel;

import java.util.ArrayList;

public class AdapterMovimientos extends RecyclerView.Adapter<AdapterMovimientos.ViewHolder> {
    private Context mContext;
    private ArrayList<MovimientosModel> mLista;

    public AdapterMovimientos(Context mContext, ArrayList<MovimientosModel> mLista) {
        this.mContext = mContext;
        this.mLista = mLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_movimientos, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MovimientosModel model = mLista.get(position);

        String tituloMovimiento = model.getTipo();
        String fecha = model.getFecha();
        String cantidad = model.getMont();

        holder.tvTituloMovimiento.setText(tituloMovimiento);
        holder.tvFecha.setText(fecha);
        holder.tvCantidadMovimiento.setText("$" + cantidad);

    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvTituloMovimiento;
        public TextView tvFecha;
        public TextView tvCantidadMovimiento;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTituloMovimiento = itemView.findViewById(R.id.TvTituloMovimiento);
            tvFecha = itemView.findViewById(R.id.tvFecha);
            tvCantidadMovimiento = itemView.findViewById(R.id.TvCantidadMovimiento);

        }
    }
}
