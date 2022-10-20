package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambarmakanan_masuk;
    TextView nama_makanan_masuk,deskripsi_makanan_masuk;

    String nm_kunci="nmakanan";
    String des_kunci="des";
    int gmakanan;

    String namamakanane;
    String desmakanane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        gambarmakanan_masuk=findViewById(R.id.gambarterima);
        nama_makanan_masuk=findViewById(R.id.nmmakanan);
        deskripsi_makanan_masuk=findViewById(R.id.de_makanan);
        Bundle bundle=getIntent().getExtras();

        gmakanan=bundle.getInt(String.valueOf("gmakanan"));
        gambarmakanan_masuk.setImageResource(gmakanan);

        namamakanane=bundle.getString("nmakanan");
        desmakanane=bundle.getString("des");

        nama_makanan_masuk.setText(namamakanane);
        deskripsi_makanan_masuk.setText(desmakanane);
    }

}