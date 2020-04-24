package com.minuth.refreshimage

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val imageUrl = "https://cnet1.cbsistatic.com/img/EwYq-3zNQBgaHRWl0z4ienqcsmk=/756x567/2020/04/03/9298a0de-7d5d-4dba-8ad0-39436d7197f5/tiger-ar.jpg";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this)
            .load(imageUrl)
            .into(imageView)

        btnRefresh.setOnClickListener {
            imageView.visibility = View.INVISIBLE
            Handler().postDelayed({
                imageView.visibility = View.VISIBLE
            },100)
        }

    }
}
