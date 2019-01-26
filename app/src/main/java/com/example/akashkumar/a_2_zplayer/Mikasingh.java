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

public class Mikasingh extends YouTubeBaseActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;
    private static  final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mikasingh);

        Button first=findViewById(R.id.mika1);

        MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");

        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);

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
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YouTubePlayerView mYouTubePlayerView;
                mYouTubePlayerView=findViewById(R.id.mikayoutube1);
                YouTubePlayer.OnInitializedListener mOnInitializedListener;
                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                        YouTubePlayer.PlayerStyle style = YouTubePlayer.PlayerStyle.DEFAULT;

                        Log.d(TAG,"onclick: done initilizing");


                        // youTubePlayer.loadVideo("NFsEqOBG51M");
                        //  youTubePlayer.loadVideo("uQ763VvqiEM");
                        // youTubePlayer.cueVideo();
                        youTubePlayer.loadPlaylist("PL9bw4S5ePsEHXuySwZszSHfEMgRhtAT37");

                        youTubePlayer.setPlayerStyle(style);
                        youTubePlayer.setShowFullscreenButton(false);




                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                        Log.d(TAG,"onclick: failed to initilizing");


                    }
                };
                Log.d(TAG,"onClick: intializing youtube player.");

                mYouTubePlayerView.initialize(YouTubeconfig.getApiKey(),mOnInitializedListener);
                Log.d(TAG,"onclick: done initilizing");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "2ll4IA146YI");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Y-xtph3p6fc");
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "x4UjdNUjwoQ");
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "yeyBEpsZfrs");
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "5dmwtnQBkLk");
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "p6D8u6lEDjQ");
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "dv_Qjzca56k");
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "-2VZsMrWbag");
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "wrUDQPcYgFA");
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Y7G-tYRzwYY");
                startActivity(intent);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "PaDaoNnOQaM");
                startActivity(intent);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "iMoB_jOhEtU");
                startActivity(intent);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "gcVbtUGLDNk");
                startActivity(intent);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "HJEO3sFC2sk");
                startActivity(intent);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "_n4zpsn_nJA");
                startActivity(intent);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "I3IyUUXTu1c");
                startActivity(intent);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "nEWp0dTrqlk");
                startActivity(intent);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "eO5du5L02TQ");
                startActivity(intent);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "TIRCJJu-JZI");
                startActivity(intent);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Mikasingh.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Q4al4hxbWHM");
                startActivity(intent);
            }
        });
    }
}
