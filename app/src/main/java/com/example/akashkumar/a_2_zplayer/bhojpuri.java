package com.example.akashkumar.a_2_zplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

import static com.example.akashkumar.a_2_zplayer.R.layout.activity_bhojpuri;

public class bhojpuri extends YouTubeBaseActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;
    private static  final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_bhojpuri);
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
        Button first=findViewById(R.id.bhojpuri1);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YouTubePlayerView mYouTubePlayerView;
                mYouTubePlayerView=findViewById(R.id.bhojuriyoutube);
                YouTubePlayer.OnInitializedListener mOnInitializedListener;
                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {


                        YouTubePlayer.PlayerStyle style = YouTubePlayer.PlayerStyle.DEFAULT;

                        Log.d(TAG,"onclick: done initilizing");


                        // youTubePlayer.loadVideo("NFsEqOBG51M");
                        //  youTubePlayer.loadVideo("uQ763VvqiEM");
                        // youTubePlayer.cueVideo();
                        youTubePlayer.loadPlaylist("PLJ3M6AoVR-gb2udj-kcoKVBpyEy82t5z-");

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

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Wd2B8OAotU8");
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "N2-HsIYd0Go");
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "k4yXQkG2s1E");
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "xmU0s2QtaEY");
                startActivity(intent);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "1YBl3Zbt80A");
                startActivity(intent);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "dZ0fwJojhrs");
                startActivity(intent);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "bPk9bSvQQoc");
                startActivity(intent);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "nCD2hj6zJEc");
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "95I5VaR7GeU");
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "wo0ospGvxXc");
                startActivity(intent);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "SAcpESN_Fk4");
                startActivity(intent);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "hzTg4zPBtDU");
                startActivity(intent);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Ek17-Sh7jtA");
                startActivity(intent);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "EEX_XM6SxmY");
                startActivity(intent);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "1tVL11ULjYY");
                startActivity(intent);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "bqGtrvcR5ls");
                startActivity(intent);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "zpsVpnvFfZQ");
                startActivity(intent);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "f6vY6tYvKGA");
                startActivity(intent);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "2nBJ_FFQuLI");
                startActivity(intent);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(bhojpuri.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "NTHz9ephYTw");
                startActivity(intent);
            }
        });
    }
}
