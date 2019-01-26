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

public class kanika extends YouTubeBaseActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    private static  final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanika);

        Button first=findViewById(R.id.kanika1);
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

        MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");

        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);



        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YouTubePlayerView mYouTubePlayerView;
                mYouTubePlayerView=findViewById(R.id.kanikayoutube1);
                YouTubePlayer.OnInitializedListener mOnInitializedListener;
                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                        YouTubePlayer.PlayerStyle style = YouTubePlayer.PlayerStyle.DEFAULT;

                        Log.d(TAG,"onclick: done initilizing");


                        // youTubePlayer.loadVideo("NFsEqOBG51M");
                        //  youTubePlayer.loadVideo("uQ763VvqiEM");
                        // youTubePlayer.cueVideo();
                        youTubePlayer.loadPlaylist("PL9bw4S5ePsEG8qqFPOjnUsZ72j_PBcny3");

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

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "RLwkTRce4f8");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "jn_nnZQ0oIg");
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "zpsVpnvFfZQ");
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "yeyBEpsZfrs");
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "LfqQ7v0sprY");
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "HT7g_9eNnYk");
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "R7spJ7YjNOY");
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "kShTN0Jz6Jg");
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "4dF1uxUTYZI");
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(kanika.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Ym3lZtbwbEw");
                startActivity(intent);
            }
        });

    }
}
