package com.massive.lotbus.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.massive.lotbus.R
import com.massive.lotbus.data.Kendaraan
import com.massive.lotbus.data.Riwayat

class RiwayatAdapter(private val listRiwayat:ArrayList<Riwayat>):RecyclerView.Adapter<RiwayatAdapter.ListViewHolder>() {

    var onItemClick : ((Riwayat)->Unit)?=null

    class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvMerk:TextView =itemView.findViewById(R.id.tv_merkKendaraan)
        var imgGambar:ImageView =itemView.findViewById(R.id.im_kendaraan)
        var tvLokasi:TextView =itemView.findViewById(R.id.tv_lokasi)
        var tvHari:TextView=itemView.findViewById(R.id.tv_hari)
        var tvHarga: TextView=itemView.findViewById(R.id.tv_harga)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View=LayoutInflater.from(parent.context).inflate(R.layout.item_list_riawayat,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listRiwayat.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val riwayat= listRiwayat[position]
        holder.tvMerk.text= riwayat.merk_Kendaraan
        Glide.with(holder.itemView.context)
            .load(riwayat.img_kendaraan)
            .apply(RequestOptions().override(100,100))
            .into(holder.imgGambar)
        holder.tvLokasi.text=riwayat.lokasi
        holder.tvHari.text=riwayat.waktu_sewa
        holder.tvHarga.text=riwayat.harga

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(riwayat)
        }

    }
}


