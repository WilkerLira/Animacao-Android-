package com.example.rossana.animacaosimples;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imagemDado;
    private Button play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagemDado = (ImageView) findViewById(R.id.dadoImageView);
        imagemDado.setBackgroundResource(R.drawable.sequenciadados);

        play = (Button) findViewById(R.id.playButton);
        play.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if("Play".equals(play.getText().toString())){
            AnimationDrawable anima = (AnimationDrawable)imagemDado.getBackground();
            anima.start();
            play.animate().start();
            play.setText("Stop");
        }
        else{
            AnimationDrawable anima = (AnimationDrawable)imagemDado.getBackground();
            anima.stop();
            play.setText("Play");

        }
    }
}
