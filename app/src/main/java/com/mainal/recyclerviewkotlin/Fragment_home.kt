package com.mainal.recyclerviewkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tiara.recyclerviewkotlin.R
import com.tiara.recyclerviewkotlin.databinding.FragmentHomeBinding

class Fragment_home : Fragment() {

    private var binding : FragmentHomeBinding? = null
    lateinit var rv_makan : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL
        rv_makan = view.findViewById(R.id.rv_makan)

        val adapterMakan = SuperAdapter(ArrayMakan, activity)
        rv_makan.setHasFixedSize(true)
        rv_makan.layoutManager = lm
        rv_makan.adapter = adapterMakan

        return view
    }

    val ArrayMakan: ArrayList<Supermakan>
        get() {
            val arraymakan = ArrayList<Supermakan>()

            val superhero1 = Supermakan()
            superhero1.imgSupermakan = R.drawable.makan1
            superhero1.nameSupermakan = "Tempe Orek"

            val superhero2 = Supermakan()
            superhero2.imgSupermakan = R.drawable.makan2
            superhero2.nameSupermakan = "Sayur Lodeh"


            val superhero3 = Supermakan()
            superhero3.imgSupermakan = R.drawable.makan3
            superhero3.nameSupermakan = "Tongkol"


            val superhero4 = Supermakan()
            superhero4.imgSupermakan = R.drawable.makan4
            superhero4.nameSupermakan = "Telur Dadar"


            val superhero5 = Supermakan()
            superhero5.imgSupermakan = R.drawable.makan5
            superhero5.nameSupermakan = "Lele Goreng"


            val superhero6 = Supermakan()
            superhero6.imgSupermakan = R.drawable.makan6
            superhero6.nameSupermakan = "Ayam Goreng"


            val superhero7 = Supermakan()
            superhero7.imgSupermakan = R.drawable.makan7
            superhero7.nameSupermakan = "Perkedel Kentang"


            val superhero8 = Supermakan()
            superhero8.imgSupermakan = R.drawable.makan8
            superhero8.nameSupermakan = "Terong Balado"


            val superhero9 = Supermakan()
            superhero9.imgSupermakan = R.drawable.makan9
            superhero9.nameSupermakan = "Sop"


            val superhero10 = Supermakan()
            superhero10.imgSupermakan = R.drawable.makan10
            superhero10.nameSupermakan = "Sayur Asem"


            arraymakan.add(superhero1)
            arraymakan.add(superhero2)
            arraymakan.add(superhero4)
            arraymakan.add(superhero5)
            arraymakan.add(superhero6)
            arraymakan.add(superhero7)
            arraymakan.add(superhero8)
            arraymakan.add(superhero9)
            arraymakan.add(superhero10)

            return arraymakan
        }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }
}

