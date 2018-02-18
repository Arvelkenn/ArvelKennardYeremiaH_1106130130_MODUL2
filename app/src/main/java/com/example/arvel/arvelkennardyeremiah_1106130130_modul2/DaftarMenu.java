package com.example.arvel.arvelkennardyeremiah_1106130130_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarMenu.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Nasi Goreng", "Harga : Rp. 15.000", "-"));
        mahasiswaArrayList.add(new Mahasiswa("Mi Goreng Spesial", "Harga : Rp. 15.000", "-"));
        mahasiswaArrayList.add(new Mahasiswa("Mi Kuah Spesial", "Harga : Rp. 15.000", "-"));
        mahasiswaArrayList.add(new Mahasiswa("Sate Madura", "Harga : Rp. 15.000", "-"));
    }

}