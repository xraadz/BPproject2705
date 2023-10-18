package com.example.projectbp2705

object ListKunjung {
    // Arraylist and return the Arraylist
    fun getDataKunjung():ArrayList<KunjungMod>{
        // create an arraylist of type employee class
        val ListKunjung=ArrayList<KunjungMod>()

        val kunjung1=KunjungMod(R.drawable.kunjung1, "Dr. Seuss's Horse Museum",
            "SuS banget kamu Doc")
        ListKunjung.add(kunjung1)

        val kunjung2=KunjungMod(R.drawable.kunjung2, "Little Monkey",
            "Dasar Monyet Kecil")
        ListKunjung.add(kunjung2)

        val kunjung3=KunjungMod(R.drawable.kunjung3, "Best Friend",
            "Besto Purento")
        ListKunjung.add(kunjung3)

        val kunjung4=KunjungMod(R.drawable.kunjung4, "Lost in the Woods",
            "Tersesat oh Tersesat")
        ListKunjung.add(kunjung4)

        val kunjung5=KunjungMod(R.drawable.kunjung5, "A Kite for Moon",
            "Layangan Terbang ke Bulan")
        ListKunjung.add(kunjung5)

        return  ListKunjung
    }
}