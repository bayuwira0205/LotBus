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
import com.massive.lotbus.Adapter.KendaraanAdapter
import com.massive.lotbus.data.Kendaraan
import com.massive.lotbus.data.KendaraanObject


class HomeFragment : Fragment() {
    private lateinit var rvKendaraan: RecyclerView
    private var list: ArrayList<Kendaraan> = arrayListOf()

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_home, container, false)

        rvKendaraan = view.findViewById(R.id.rv_Kendaraan)
        rvKendaraan.setHasFixedSize(true)

        list.addAll(KendaraanObject.listData)
        rvKendaraan.layoutManager = LinearLayoutManager(requireContext())
        val listHeroAdapter =KendaraanAdapter(list)
        rvKendaraan.adapter = listHeroAdapter

        listHeroAdapter.onItemClick ={
            val intent= Intent(requireContext(),OrderActivity::class.java)
            intent.putExtra("kendaraan",it)
            startActivity(intent)
        }
        return (view)
    }



}