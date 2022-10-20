package com.example.aplikasimenumakanan;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterMakanan extends ArrayAdapter {
    String nama_makanan[];
    String deskripsi_makanan[];
    int gambar_makanan[];
    Activity activity;

    public AdapterMakanan(MainMakanan activity, String[] nama_makanan, String[] deskripsi_makanan, int[] gambar_makanan) {
        super(activity,R.layout.list_item,nama_makanan);
        this.nama_makanan = nama_makanan;
        this.deskripsi_makanan = deskripsi_makanan;
        this.gambar_makanan = gambar_makanan;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item, null );

        ImageView gambarmakanan;
        TextView namamakanan;

        gambarmakanan = v.findViewById(R.id.gambar_makanan);
        namamakanan = v.findViewById(R.id.nama_makanan);

        gambarmakanan.setImageResource(gambar_makanan[position]);
        namamakanan.setText(nama_makanan[position]);

        return v;
    }
}