 package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;

 public class MainMakanan extends AppCompatActivity {

     ListView listView;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main_makanan);

         String nama_makanan[] = {"Cake",
                 "Cookies",
                 "Macarons"
         };

         int gambar_makanan[] = {R.drawable.cake1,
                 R.drawable.cookies1,
                 R.drawable.macarons1
         };

         String deskripsi_makanan[] = {"BIRTHDAY CAKE\n" +
                 "Harga : Rp. 35.000\n" +
                 "  Birthday Cake dengan ukuran 15cm x 20 cm, menngunakan white butter cream.\n" +
                 "dapat di dekor sesuai keinginan customer.",

                 " CHOCO COOKIES \n" +
                 "Harga: Rp. 15.000 \n" +
                 "      Choco Cookies, cookies dengan double chocolate yaitu cookie yang  \n" +
                 "yang berisikan dark coklat dan di ditaburi oleh banyak chococips \n" +
                 "dengan ukuran diaemeter 10cm.",


                 " MACARON \n" +
                 " Harga: Rp. 40.000/pack\n" +
                 "      Macaron, yang dibuat dari bahan pilihan, dan juga berbagai rasa,\n" +
                 " yaitu strawberry, vanila, matcha, chocolate.\n" +
                 " Ukuran diameter satuan macaron 5cm.",

         };

         listView = findViewById(R.id.Listdatamakanan);
         AdapterMakanan adapterMakanan = new AdapterMakanan(this, nama_makanan, deskripsi_makanan, gambar_makanan);
         listView.setAdapter(adapterMakanan);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                 String nm_makanan=nama_makanan[position].toString();
                 int gbr_makanan=gambar_makanan[position];
                 String des_makanan=deskripsi_makanan[position].toString();

                 //Toast.makeText(MainMakanan.this, ""+nm_makanan.trim(), Toast.LENGTH_SHORT).show();
                 Intent intent = new Intent(MainMakanan.this, DetailMakanan.class);
                 intent.putExtra("nmakanan",nm_makanan);
                 intent.putExtra("gmakanan",gbr_makanan);
                 intent.putExtra("des",des_makanan);
                 startActivity(intent);
             }
         });
     }
 }