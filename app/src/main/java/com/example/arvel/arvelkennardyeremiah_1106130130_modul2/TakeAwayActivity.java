package com.example.arvel.arvelkennardyeremiah_1106130130_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
    public void onClickPilihPesanan(View view){
        Intent i = new Intent(this, DaftarMenu.class);
        startActivity(i);
    }
}
