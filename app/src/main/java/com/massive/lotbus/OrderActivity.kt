package com.massive.lotbus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.massive.lotbus.data.Kendaraan

class OrderActivity : AppCompatActivity() {
    private lateinit var im_Detail:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val detailKendaraan=intent.getParcelableExtra<Kendaraan>("kendaraan")
        val im_detail:ImageView = findViewById(R.id.im_detailKendaraan)
        val tv_kapasitasDetail:TextView = findViewById(R.id.tv_kapasitas)
        val tv_jmlDetail:TextView = findViewById(R.id.textView)
        val tv_harga:TextView =findViewById(R.id.tv_harga)

        if (detailKendaraan != null) {
            im_detail.setImageResource(detailKendaraan.img_kendaraan)
            tv_kapasitasDetail.text=detailKendaraan.kapasitas
            tv_jmlDetail.text=detailKendaraan.jml_tersedia
            tv_harga.text=detailKendaraan.harga


        }


    }
}