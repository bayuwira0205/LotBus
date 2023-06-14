package com.massive.lotbus

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.massive.lotbus.Adapter.RiwayatAdapter
import com.massive.lotbus.data.Kendaraan
import com.massive.lotbus.data.Riwayat
import com.massive.lotbus.data.RiwayatObject

class RiwayatFragment : Fragment() {
    private lateinit var rvRiwayat: RecyclerView
    private var list: ArrayList<Riwayat> = arrayListOf()

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_riwayat, container, false)

        rvRiwayat = view.findViewById(R.id.rv_riwayat)
        rvRiwayat.setHasFixedSize(true)

        list.addAll(RiwayatObject.listData)
        rvRiwayat.layoutManager = LinearLayoutManager(requireContext())
        val listHeroAdapter = RiwayatAdapter(list)
        rvRiwayat.adapter = listHeroAdapter

        return (view)
    }


}