package com.massive.lotbus.data

import android.os.Parcel
import android.os.Parcelable

class Kendaraan (
    var merk:String ="",
    var img_kendaraan:Int=0,
    var kapasitas: String="",
    var jml_tersedia:String="",
    var harga: String=""
        ):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(merk)
        parcel.writeInt(img_kendaraan)
        parcel.writeString(kapasitas)
        parcel.writeString(jml_tersedia)
        parcel.writeString(harga)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Kendaraan> {
        override fun createFromParcel(parcel: Parcel): Kendaraan {
            return Kendaraan(parcel)
        }

        override fun newArray(size: Int): Array<Kendaraan?> {
            return arrayOfNulls(size)
        }
    }
}