package com.khoirullatif.cercjeniskucing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_CAT = "extra_cat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Cat cat = getIntent().getParcelableExtra(EXTRA_CAT);

        ImageView ivPhoto = findViewById(R.id.iv_detail_image);
        TextView tvJenis = findViewById(R.id.tv_detail_jenis);
        TextView tvHarga = findViewById(R.id.tv_detail_harga);
        TextView tvDetail = findViewById(R.id.tv_detail_detail);

        ivPhoto.setImageResource(cat.getImage());
        tvJenis.setText(cat.getJenis());
        tvHarga.setText(cat.getHarga());
        tvDetail.setText(cat.getDetail());

    }
}