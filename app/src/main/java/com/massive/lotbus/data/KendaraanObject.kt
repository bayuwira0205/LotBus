package com.massive.lotbus.data

import com.massive.lotbus.R

object KendaraanObject {
    private var merkKendaraan= arrayOf("Isuzu long elf","Suzuki APV","Daihatsu Luxio")

    private var gambarKendaraan= intArrayOf(R.drawable.isuzu_long_elf,R.drawable.apv,R.drawable.luxio)

    private var kapasitasKendaraan= arrayOf("6","7","7")

    private var jumlahKendaraan= arrayOf("2 Tersedia", "1 Tersedia", "3 Tersedia")

    private var hargaKendaraan= arrayOf("Rp.180.000/hari","Rp.120.000/hari","Rp.150.000/hari")

    val listData: ArrayList<Kendaraan>
        get() {
            val list = arrayListOf<Kendaraan>()
            for (position in merkKendaraan.indices) {
                val kendaraan = Kendaraan()
                kendaraan.merk = merkKendaraan[position]
                kendaraan.img_kendaraan = gambarKendaraan[position]
                kendaraan.kapasitas = kapasitasKendaraan[position]
                kendaraan.jml_tersedia= jumlahKendaraan[position]
                kendaraan.harga= hargaKendaraan[position]
                list.add(kendaraan)
            }
            return list
        }


}