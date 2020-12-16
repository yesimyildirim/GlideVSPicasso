package com.yesimartik.glidepicassokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.VideoView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var image1 : ImageView

    val URL = "https://media.emailonacid.com/wp-content/uploads/2019/03/2019-GifsInEmail.gif"
    val URL2 = "https://miro.medium.com/max/1200/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image1 = findViewById(R.id.imageView)
    }

    fun picassoFoto(view: View) {
        Picasso.get()
            .load(URL2)
            .into(image1)
    }
    fun glideFoto(view: View) {

            Glide.with(this)
                .load(URL2)
                .into(this.image1)

    }
    fun glideGif(view: View) {
        Glide.with(this)
            .load(URL)
            .into(image1)
    }
    fun picassoGif(view: View) {
        Picasso.get()
            .load(URL)
            .into(image1)
    }

}