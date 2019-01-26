package com.example.akashkumar.a_2_zplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class International extends YouTubeBaseActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_international);



        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        bt10=findViewById(R.id.bt10);

        bt11=findViewById(R.id.bt11);
        bt12=findViewById(R.id.bt12);
        bt13=findViewById(R.id.bt13);
        bt14=findViewById(R.id.bt14);
        bt15=findViewById(R.id.bt15);
        bt16=findViewById(R.id.bt16);
        bt17=findViewById(R.id.bt17);
        bt18=findViewById(R.id.bt18);
        bt19=findViewById(R.id.bt19);
        bt20=findViewById(R.id.bt20);

        MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");

        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "R9yNWbetJVU");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "RgKAFK5djSk");
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "JGwWNGJdvx8");
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "9bZkp7q19f0");
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "UqyT8IEBkvY");
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "HCTgU5RhvHU");
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "-8YO2YOLPFw");
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "WqTMRvhif3Q");
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "NGLxoKOvzu4");
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "ycb4bNzCBfE");
                startActivity(intent);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "FzG4uDgje3M");
                startActivity(intent);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "YqeW9_5kURI");
                startActivity(intent);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Y963o_1q71M");
                startActivity(intent);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "nfs8NYg7yQM");
                startActivity(intent);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "60ItHLz5WEA");
                startActivity(intent);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "jzD_yyEcp0M");
                startActivity(intent);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "k2qgadSvNyU");
                startActivity(intent);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "papuvlVeZg8");
                startActivity(intent);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "PMivT7MJ41M");
                startActivity(intent);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(International.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "lp-EO5I60KA");
                startActivity(intent);
            }
        });

    }
}
