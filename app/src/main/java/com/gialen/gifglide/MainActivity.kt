package com.gialen.gifglide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val width = ScreenUtil.getScreenWidth(this)-CommonUtil.dp2px(this,20f)
        val height=width/4
        var options1 = RequestOptions()
        options1 = options1.override(width, height)
        options1 = options1.transform(GlideRoundTransform())
        Glide.with(this).load("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif").apply(options1).into(imageView1)

        var options2 = RequestOptions()
        options2 = options2.override(width, height)
        //TODO
//        options2 = options2.transform(GlideRoundTransform())
        Glide.with(this).load("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif").apply(options2).into(imageView2)


    }
}