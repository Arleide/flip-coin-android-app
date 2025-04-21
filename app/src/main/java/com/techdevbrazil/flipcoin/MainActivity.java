package com.techdevbrazil.flipcoin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    private TextView textViewResultado;
    private ImageView imagemMoeda;
    private Button buttonJogar;

    private Random random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultado);
        imagemMoeda = findViewById(R.id.imageViewMoeda);
        buttonJogar = findViewById(R.id.btnJogar);

        random = new Random();

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int resuktado = random.nextInt(2);

                if (resuktado == 0){
                    imagemMoeda.setImageResource(R.drawable.cara);
                    textViewResultado.setText("Deu Cara");
                }else {
                    imagemMoeda.setImageResource(R.drawable.coroa);
                    textViewResultado.setText("Deu Coroa");
                }
            }
        });


    }
}