package com.rk.is;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageSwitcher IS_1_IDJAVA;
    Button B_1_IDJAVA, B_2_IDJAVA;

    int[] GambarGambar = {
            R.drawable.gambar1,
            R.drawable.gambar2,
            R.drawable.gambar3,
            R.drawable.gambar4,
            R.drawable.gambar5,
            R.drawable.gambar6,
            R.drawable.gambar7,
    };

    int Posisi = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IS_1_IDJAVA = findViewById(R.id.IS_1_IDXML);
        B_1_IDJAVA = findViewById(R.id.B_1_IDXML);
        B_2_IDJAVA = findViewById(R.id.B_2_IDXML);

        IS_1_IDJAVA.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView IV = new ImageView(getApplicationContext());
                IV.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return IV;
            }
        });

        B_1_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Posisi > 0) {
                    Posisi = Posisi - 1;
                    IS_1_IDJAVA.setBackgroundResource(GambarGambar[Posisi]);
                }
            }
        });

        B_2_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Posisi < GambarGambar.length - 1) {
                    Posisi = Posisi + 1;
                    IS_1_IDJAVA.setBackgroundResource(GambarGambar[Posisi]);
                }
            }
        });

    }
}
