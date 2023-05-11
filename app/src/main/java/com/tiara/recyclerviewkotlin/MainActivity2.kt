package com.tiara.recyclerviewkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity2 : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.makan1,
                "Tempe Orek",
                "Tempe orek merupakan olahan tempe yang dipotong memanjang atau dadu dan ditumis bersama kecap, bawang putih, dan cabai. Tempe orek memiliki rasa manis, gurih, dan pedas."

            ),
            Superhero(
                R.drawable.makan2,
                "Sayur Lodeh",
                "Sayur ini merupakan olahan kuah bersantan yang berisi sayuran seperti kacang panjang, terong, dan banyak lagi."
            ),
            Superhero(
                R.drawable.makan3,
                "Tongkol",
                "Tongkol biasanya digoreng, dimasak menjadi balado atau kuah kuning. Tongkol bisa menjadi pelengkap nasi hangat."
            ),
            Superhero(
                R.drawable.makan4,
                "Telur Dadar",
                "Telur dadar ala warteg merupakan telur dadar tebal yang dimasak bersama cacahan daun bawang, kol, irisan bawang merah, dan bawang putih."

            ),
            Superhero(
                R.drawable.makan5,
                "Lele Goreng",
                "ikan lele dengan rasanya yang gurih. Lele juga biasa digoreng atau dimasak bersama kuah kuning."

            ),
            Superhero(
                R.drawable.makan6,
                "Ayam Goreng",
                "Ayam biasa diolah menjadi banyak masakan seperti ayam goreng, semur, balado, usus, ati ampela, dan banyak lagi."

            ),
            Superhero(
                R.drawable.makan7,
                "Perkedel Kentang",
                "perkedel kentang di warteg diberi campuran daun seledri dan ayam. Beberapa warteg juga biasa menyediakan perkedel tahu dan perkedel jagung."

            ),
            Superhero(
                R.drawable.makan8,
                "Terong Balado",
                "balado terong yang tak kalah lezat. Rasanya yang pedas dan gurih sangat nikmat sebagai menu makan siang."

            ),
            Superhero(
                R.drawable.makan9,
                "Sop",
                "Sayuran berkuah yang sering hadir di warteg adalah sayur sup. Sayur ini biasanya berisi kol, seledri, wortel, kentang, dan ayam. Sayur lainnya yang biasa tersedia adalah sayur bayam, sayur labu siam, dan banyak lagi."

            ),
            Superhero(
                R.drawable.makan10,
                "Sayur Asem",
                "Aneka sayur yang kerap ditemui di warteg selanjutnya adalah sayur asam. Sayur ini memiliki cita rasa segar dengan potongan jagung dan daun melinjo."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


                }


        }

    }



