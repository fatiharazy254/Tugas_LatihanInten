package com.example.latihaninten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextClock
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {

    private lateinit var txtProses: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        //binding
        txtProses = findViewById(R.id.txt_proses)

        //membuat bundle dan mengambil data dari putExtra
        val bundle: Bundle? = intent.extras

        //variabel utk menampung nilainya
        var nim = bundle?.get("nim").toString()
        var nama = bundle?.get("nama").toString()
        var nilai = bundle?.get("nilai").toString()
        var nilaihuruf = hitung(nilai)

        txtProses.text = """
            NIM : ${nim}
            Nama : ${nama}
            Nilai : ${nilai}
            Nilai Huruf : ${nilaihuruf}
        """.trimIndent()
    }

    fun hitung(nilai: String): String{
        var nilaiDouble = nilai.toFloat()
        if (nilaiDouble >= 80){
            return "A"
        } else if (nilaiDouble >= 60){
            return "B"
        } else if (nilaiDouble >= 40){
            return "C"
        } else if (nilaiDouble >= 20){
            return "D"
        } else {
            return "E"
        }
    }
}
