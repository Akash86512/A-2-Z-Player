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

public class bollywood1 extends YouTubeBaseActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;
    Button first;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    YouTubePlayerView mYouTubePlayerView;
    private static  final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bollywood1);

        first=findViewById(R.id.bolluwood1);
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

        mYouTubePlayerView=findViewById(R.id.bollywoodyoutube1);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                        YouTubePlayer.PlayerStyle style = YouTubePlayer.PlayerStyle.DEFAULT;

                        Log.d(TAG,"onclick: done initilizing");


                        // youTubePlayer.loadVideo("NFsEqOBG51M");
                        //  youTubePlayer.loadVideo("uQ763VvqiEM");
                        // youTubePlayer.cueVideo();
                        youTubePlayer.loadPlaylist("PLYVjGTi85afoJ0v6o5tZbpNmx9A3QVo6U");

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

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "dUaCEs3HfdI");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "rbVc7KlrD5E");
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "uQ763VvqiEM");
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Q-GOFPM01d0");
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "SAcpESN_Fk4");
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "k4yXQkG2s1E");
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "xmU0s2QtaEY");
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "FQS7i2z1CoA");
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "kd5KqlmcHNo");
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "8qs2dZO6wcc");
                startActivity(intent);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "NaX-oGJEZI8");
                startActivity(intent);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "6cKErCWrb44");
                startActivity(intent);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "1YBl3Zbt80A");
                startActivity(intent);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Jyst8oIHOAY");
                startActivity(intent);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "FsnYzwQm3gM");
                startActivity(intent);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "xWi8nDUjHGA");
                startActivity(intent);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "gNN7hyUi0To");
                startActivity(intent);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "FKSmVmSueok");
                startActivity(intent);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "05TA9jNnCdU");
                startActivity(intent);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bollywood1.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "v7K4vGYL9zI");
                startActivity(intent);
            }
        });

    }
}
