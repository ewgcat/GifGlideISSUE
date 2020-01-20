# Glide 加载gif的bug

1.需要圆角
2.需要指定大小


## 这个指定宽高,指定圆角,宽高不成功，圆角成功
        val width = ScreenUtil.getScreenWidth(this)-CommonUtil.dp2px(this,20f)
        val height=width/4
        var options1 = RequestOptions()
        options1 = options1.override(width, height)
        options1 = options1.transform(GlideRoundTransform())
        Glide.with(this).load("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif").apply(options1).into(imageView1)



## 这个指定宽高,不指定圆角,宽高成功，圆角不成功
        var options2 = RequestOptions()
        options2 = options2.override(width, height)
        Glide.with(this).load("https://cs-jiaomigo.gialen.com/image/pic/6a/da/1579485053817.gif").apply(options2).into(imageView2)
