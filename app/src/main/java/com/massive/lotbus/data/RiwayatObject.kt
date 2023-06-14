package com.massive.lotbus.data

import com.massive.lotbus.R

object RiwayatObject {
    private var riwayatmerkKendaraan= arrayOf("Isuzu long elf","Suzuki APV","Daihatsu Luxio")

    private var riwayatgambarKendaraan= intArrayOf(R.drawable.isuzu_long_elf, R.drawable.apv, R.drawable.luxio)

    private var riwayatLokasiKendaraan= arrayOf("Batam","Batam","Yogyakarta")

    private var riwayatWaktuKendaraan= arrayOf("2 Hari", "1 Hari", "3 Hari")

    private var riwayathargaKendaraan= arrayOf("Rp.360.000","Rp.120.000","Rp.450.000")

    val listData: ArrayList<Riwayat>
        get() {
            val list = arrayListOf<Riwayat>()
            for (position in riwayatmerkKendaraan.indices) {
                val riwayat = Riwayat()
                riwayat.merk_Kendaraan = riwayatmerkKendaraan[position]
                riwayat.img_kendaraan = riwayatgambarKendaraan[position]
                riwayat.lokasi = riwayatLokasiKendaraan[position]
                riwayat.waktu_sewa= riwayatWaktuKendaraan[position]
                riwayat.harga= riwayathargaKendaraan[position]
                list.add(riwayat)
            }
            return list
        }
}