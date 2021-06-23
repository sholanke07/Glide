package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
Button btndown;
ImageView img, img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndown=(Button)findViewById(R.id.button);
        img=(ImageView)findViewById(R.id.imgview);
        img1=(ImageView)findViewById(R.id.imgview1);
        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // for (int i = 0; i < 2; i++) {
                    //if (i == 0) {
                        DownloadImage ("https://thumbs.dreamstime.com/z/hello-friday-hand-drawn-vector-lettering-quote-cartoon-style-isolated-white-background-design-holiday-greeting-cards-logo-140628398.jpg");
                    //} else {
                        DownloadImage1("https://upload.wikimedia.org/wikipedia/commons/thumb/d/db/Hello.pdf/page1-1200px-Hello.pdf.jpg");
                   // }
                //}
            }
        });

    }

    private void DownloadImage(String url)
    {
        Glide.with(this).load(url).into(img);

    }
    private void DownloadImage1(String url){
        Glide.with(this).load(url).into(img1);
    }
}