package com.example.arvel.arvelkennardyeremiah_1106130130_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbDineIn, rbTakeAway;
    Button btnPesanSekarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbDineIn = (RadioButton)findViewById(R.id.rbDineIn);
        rbTakeAway = (RadioButton)findViewById(R.id.rbTakeAway);
        btnPesanSekarang = (Button)findViewById(R.id.btnPesanSekarang);



    }

    public void onClickPesanSekarang(View view){
        if (view.getId() == R.id.btnPesanSekarang){
            if (rbDineIn.isChecked()){
                Intent i = new Intent(this, DineInActivity.class);
                startActivity(i);
            }else if (rbTakeAway.isChecked()){
                Intent i = new Intent(this, TakeAwayActivity.class);
                startActivity(i);
            }
        }
    }
}
