package com.example.projectbp2705

object ListBuku {
    // Arraylist and return the Arraylist
    fun getDataBuku():ArrayList<BukuModel>{
        // create an arraylist of type employee class
        val ListBuku=ArrayList<BukuModel>()

        val buku1=BukuModel(R.drawable.buku1, "Dr. Seuss's Horse Museum",
            "SuS banget kamu Doc")
        ListBuku.add(buku1)

        val buku2=BukuModel(R.drawable.buku2, "Little Monkey",
            "Dasar Monyet Kecil")
        ListBuku.add(buku2)

        val buku3=BukuModel(R.drawable.buku3, "Best Friend",
            "Besto Purento")
        ListBuku.add(buku3)

        val buku4=BukuModel(R.drawable.buku4, "Lost in the Woods",
            "Tersesat oh Tersesat")
        ListBuku.add(buku4)

        val buku5=BukuModel(R.drawable.buku5, "A Kite for Moon",
            "Layangan Terbang ke Bulan")
        ListBuku.add(buku5)

        val buku6=BukuModel(R.drawable.buku6, "Story Book",
            "Puteri Salju??")
        ListBuku.add(buku6)

        return  ListBuku
    }
}