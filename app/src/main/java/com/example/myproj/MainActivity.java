package com.example.myproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button start;
    Button stop;
    Button pause;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button);
        pause=findViewById(R.id.button2);
        stop=findViewById(R.id.button2);
        mediaPlayer =MediaPlayer.create(this,R.raw.music);
        start.setOnClickListener(new OnClickListener(){
@Override
            public void onClick(View view){
    mediaPlayer.start();
            }
        });
        pause.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.pause();
            }
        });
        stop.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.stop();
            }
        });
        VideoView videoView=findViewById(R.id.)

    }
}