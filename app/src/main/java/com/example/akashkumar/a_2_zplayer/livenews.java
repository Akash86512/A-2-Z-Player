package com.example.akashkumar.a_2_zplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class livenews extends AppCompatActivity {

    Button aajtak,indiatoday,tej,dd,fox,indiatv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livenews);

        aajtak=findViewById(R.id.aajtak);
        indiatoday=findViewById(R.id.indiatoday);
        tej=findViewById(R.id.tej);
        dd=findViewById(R.id.dd);
        fox=findViewById(R.id.fox);
        indiatv=findViewById(R.id.indiatv);
        MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");

        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);

        aajtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "X7Ktabhd8a4");
                startActivity(intent);
            }
        });
        indiatv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "an1_CXsBkKk");
                startActivity(intent);
            }
        });
        tej.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "lIiU09BVwpo");
                startActivity(intent);
            }
        });
        indiatoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "62rmi9KMvVE");
                startActivity(intent);
            }
        });
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "9zETmau4MXg");
                startActivity(intent);
            }
        });
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(livenews.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "viB6c2Y_sRs");
                startActivity(intent);
            }
        });
    }
}
