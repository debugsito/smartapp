package com.example.smartappramos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smartappramos.adapter.GeneracionAdapter
import com.example.smartappramos.model.GeneracionModel

class GeneracionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generacion)

        val rvGeneraciones: RecyclerView = findViewById(R.id.rvGeneraciones)
        rvGeneraciones.adapter = GeneracionAdapter(listSong())
        rvGeneraciones.layoutManager = LinearLayoutManager(this)
    }

    private fun listSong(): List<GeneracionModel>{
        val lstSong: ArrayList<GeneracionModel> = ArrayList()
        lstSong.add(GeneracionModel(1,R.drawable.eltesoro, "Genercion Z","2021-2023"))
        lstSong.add(GeneracionModel(2,R.drawable.dinastiaescorpio, "Milenial","La Dinastía Escorpio",))
        lstSong.add(GeneracionModel(3,R.drawable.one_piece, "¡We Are!","Openings"))
        lstSong.add(GeneracionModel(4,R.drawable.suertecampeon, "Rayo lento","Suerte campeón"))
        lstSong.add(GeneracionModel(5,R.drawable.violencia, "Violencia","Violencia"))
        return  lstSong;
    }
}