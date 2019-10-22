package com.example.latihaninten

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //membuat variabel yg diinisialisasikan di method lain
    private lateinit var ptNim: EditText
    private lateinit var ptNama: EditText
    private lateinit var ptNilai: EditText
    private lateinit var btnProses: Button

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //inisialisasi variabel
         ptNim = findViewById(R.id.pt_nim)
         ptNama = findViewById(R.id.pt_nama)
         ptNilai = findViewById(R.id.pt_nilai)
         btnProses = findViewById(R.id.btn_proses)

         //membuat button dapat di klik
         btnProses.setOnClickListener {
             //code agar jika di klik dapat dijalankan

             //intent (this, "inten selanjutnya"::class.java)
             intent = Intent(this, ActivityKedua::class.java)

             //agar dapat mengirim data ke activity selanjutnya
             intent.putExtra("nim", ptNim.text)
             intent.putExtra("nama", ptNama.text)
             intent.putExtra("nilai", ptNilai.text)

             //mulai aktivity selanjutnya
             startActivity(intent)
         }

    }
}
