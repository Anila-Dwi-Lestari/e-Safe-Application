package com.anila.stematel.bagiananila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class beranda : AppCompatActivity() {
    lateinit var cardview4:CardView
    lateinit var cardview3:CardView
    lateinit var cardview6:CardView
    lateinit var cardview5:CardView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
        cardview3 = findViewById(R.id.cardView3) as CardView
        cardview4 = findViewById(R.id.cardView4) as CardView
        cardview6 = findViewById(R.id.cardView6) as CardView
        cardview5 = findViewById(R.id.cardView5) as CardView
        cardview4.setOnClickListener {
            val intent = Intent(this, kasus_terkonfirmasi::class.java)
            startActivity(intent)
        }

        cardview3.setOnClickListener {
            val intent = Intent(this, total_kematian::class.java)
            startActivity(intent)
        }

        cardview6.setOnClickListener {
            val intent = Intent(this, pasien_sembuh::class.java)
            startActivity(intent)
        }
        cardview5.setOnClickListener {
            val intent = Intent(this, kasus_baru::class.java)
            startActivity(intent)
        }
    }
}