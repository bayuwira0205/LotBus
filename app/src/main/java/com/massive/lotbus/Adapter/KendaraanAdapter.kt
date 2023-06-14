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

class KendaraanAdapter(private val lisKendaraan:ArrayList<Kendaraan>):RecyclerView.Adapter<KendaraanAdapter.ListViewHolder>() {

    var onItemClick : ((Kendaraan)->Unit)?=null

    class ListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvMerk:TextView =itemView.findViewById(R.id.tv_title)
        var imgGambar:ImageView =itemView.findViewById(R.id.im_kendaraan)
        var tvKapasitas:TextView =itemView.findViewById(R.id.tv_kapasitas)
        var tvJmlKendaraan:TextView=itemView.findViewById(R.id.tv_jumlahTersedia)
        var tvHarga: TextView=itemView.findViewById(R.id.tv_harga)
        var cardKendaraan:CardView=itemView.findViewById(R.id.card_Kendaraan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View=LayoutInflater.from(parent.context).inflate(R.layout.item_list_mobil,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lisKendaraan.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kendaraan= lisKendaraan[position]
        holder.tvMerk.text= kendaraan.merk
        Glide.with(holder.itemView.context)
            .load(kendaraan.img_kendaraan)
            .apply(RequestOptions().override(100,100))
            .into(holder.imgGambar)
        holder.tvKapasitas.text=kendaraan.kapasitas
        holder.tvJmlKendaraan.text=kendaraan.jml_tersedia
        holder.tvHarga.text=kendaraan.harga

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(kendaraan)
        }

    }
}


