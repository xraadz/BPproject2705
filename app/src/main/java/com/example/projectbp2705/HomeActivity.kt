package com.example.projectbp2705

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.menu4)
        val btnKid:Button = findViewById(R.id.menu1)
        val btnSpace:Button = findViewById(R.id.menu3)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)
        val rvKunjung:RecyclerView = findViewById(R.id.recyclerViewKunjung)

        //set layout manager di recyclerview
        rvBuku.layoutManager = LinearLayoutManager(this)

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure",
            "Aku Sayang"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure",
            "Kamu Juga Sayang"))
        data.add(BukuModel(R.drawable.book4, "Mermaid to Rescue",
            "Tapi Sayang Kita Berjauhan"))

        data.add(BukuModel(R.drawable.buku1, "Dr. Seuss's Horse Museum",
            "SuS banget kamu Doc"))
        data.add(BukuModel(R.drawable.buku2, "Little Monkey",
            "Dasar Monyet Kecil"))
        data.add(BukuModel(R.drawable.buku3, "Best Friend",
            "Besto Purento"))
        data.add(BukuModel(R.drawable.buku4, "Lost in the Woods",
            "Tersesat oh Tersesat"))
        data.add(BukuModel(R.drawable.buku5, "A Kite for Moon",
            "Layangan Terbang ke Bulan"))
        data.add(BukuModel(R.drawable.buku6, "Story Book",
            "Puteri Salju??"))


        //set adapter
        val adapter = AdapterHome(data)
        val adapterKun = AdapterResponsi(data)

        //set adapter ke recycler view
        rvBuku.adapter = adapter
        rvKunjung.adapter = adapterKun

        //action buttonu
        btnMore.setOnClickListener {
            val intent = Intent( this,AboutActivity::class.java)
            startActivity(intent)
        }

        btnSpace.setOnClickListener {
            val intent = Intent( this,ResponsiActivity::class.java)
            startActivity(intent)

        btnKid.setOnClickListener {
            val intent = Intent( this,BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}