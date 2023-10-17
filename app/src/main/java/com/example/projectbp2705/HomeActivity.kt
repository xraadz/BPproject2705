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
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)

        //set layout manager di recyclerview
        rvBuku.layoutManager = LinearLayoutManager(this)

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure",
            "Lorem Ipsum Sit Amet"))
        data.add(BukuModel(R.drawable.book4, "Mermaid to Rescue",
            "Lorem Ipsum Sit Amet"))



        //set adapter
        val adapter = AdapterHome(data)

        //set adapter ke recycler view
        rvBuku.adapter = adapter

        //action buttonu
        btnMore.setOnClickListener {
            val intent = Intent( this,AboutActivity::class.java)
            startActivity(intent)
        }

        btnKid.setOnClickListener {
            val intent = Intent( this,BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}