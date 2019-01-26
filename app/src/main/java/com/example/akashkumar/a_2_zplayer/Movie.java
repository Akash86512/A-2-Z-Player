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

public class Movie extends AppCompatActivity {

    Button judwa,kaabil,bang,pk,kick,dhoni,talash,rustum,villion,singum,yehdiwani,aagnipath,aasque,baby,dirtypicture,dirtypoltics,bodyguard,gang,idiate,ragni,student,mujhse,khoobsurat;
    Button welcome,ready,humskla,mastizade,bhagum,bake,herapheri,great,guest,pyar,enter;
    Button gajni,krish3,rawdi,heropanthi,wanted,don2,sonofsardar,pantom,tezz,zila;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        gajni=findViewById(R.id.gajni);
        krish3=findViewById(R.id.krish3);
        rawdi=findViewById(R.id.rawdi);
        heropanthi=findViewById(R.id.heropanthi);
        wanted=findViewById(R.id.wanted);
        don2=findViewById(R.id.don2);
        sonofsardar=findViewById(R.id.sonossardar);
        pantom=findViewById(R.id.phanton);
        tezz=findViewById(R.id.tezz);
        zila=findViewById(R.id.zila);

        welcome=findViewById(R.id.welcome);
        ready=findViewById(R.id.ready);
        humskla=findViewById(R.id.humskal);
        mastizade=findViewById(R.id.mastizade);
        welcome=findViewById(R.id.welcome);
        bhagum=findViewById(R.id.bhagum);
        bake=findViewById(R.id.bake);
        herapheri=findViewById(R.id.herapheri);
        great=findViewById(R.id.grategrand);
        guest=findViewById(R.id.guest);
        pyar=findViewById(R.id.pyarka);
        enter=findViewById(R.id.entertenment);



        judwa=findViewById(R.id.judwa);
        kaabil=findViewById(R.id.kabil);
        bang=findViewById(R.id.bang);
        pk=findViewById(R.id.pk);
        kick=findViewById(R.id.kick);
        dhoni=findViewById(R.id.dhoni);
        bake=findViewById(R.id.bake);
        talash=findViewById(R.id.talash);
        rustum=findViewById(R.id.rustum);
        villion=findViewById(R.id.ekvillion);
        singum=findViewById(R.id.singum);
        yehdiwani=findViewById(R.id.yehjwani);

        aagnipath=findViewById(R.id.aagnipath);
        aasque=findViewById(R.id.aashqui);
        baby=findViewById(R.id.baby);
        dirtypicture=findViewById(R.id.dirty);
        dirtypoltics=findViewById(R.id.dirtypicture);
        dhoni=findViewById(R.id.dhoni);
        bodyguard=findViewById(R.id.bodyguard);
        gang=findViewById(R.id.gang);
        idiate=findViewById(R.id.idiate);
        ragni=findViewById(R.id.ragni);
        student=findViewById(R.id.studentofyear);
        mujhse=findViewById(R.id.mujhse);
        khoobsurat=findViewById(R.id.khoobsurat);



        MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");

        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);




        gajni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "QM0goPDJrGI");
                startActivity(intent);
            }
        });
        krish3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "seuVd3yU4Ko");
                startActivity(intent);
            }
        });

        rawdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "tdv2Lizfp0c");
                startActivity(intent);
            }
        });

        heropanthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "GI7iS1s7wxo");
                startActivity(intent);
            }
        });

        wanted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "lg2i2oqnoy0");
                startActivity(intent);
            }
        });


        don2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "A3fM4tYy2F0");
                startActivity(intent);
            }
        });

        sonofsardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "XXL0921MdXE");
                startActivity(intent);
            }
        });

        pantom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Cc3Tn1KbNG4");
                startActivity(intent);
            }
        });

        tezz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "G9ZV4NZ5Ulw");
                startActivity(intent);
            }
        });

        zila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "aEd7k9sG5cQ");
                startActivity(intent);
            }
        });




        //comedy movie

        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "LPCk2UWZk14");
                startActivity(intent);
            }
        });

        ready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "-t0Y9SwwjbI");
                startActivity(intent);
            }
        });

        humskla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Qnamx27uUYA");
                startActivity(intent);
            }
        });

        mastizade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "P5B0KVl3xa8");
                startActivity(intent);
            }
        });

        bhagum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "jj2StPWNWiI");
                startActivity(intent);
            }
        });

        bake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "sRlZ4HsVP1w");
                startActivity(intent);
            }
        });

        herapheri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "NG_geLWfo2g");
                startActivity(intent);
            }
        });

        great.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "J9Fg_0L7yHY");
                startActivity(intent);
            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "g-mL3vXfH1c");
                startActivity(intent);
            }
        });
        pyar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "ikNpjJTEF-8");
                startActivity(intent);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "LXXkiUKDK4w");
                startActivity(intent);
            }
        });


//superhit movie

        judwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "Pgax0vTc5vo");
                startActivity(intent);
            }
        });
        kaabil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "1whROm4UH-I");
                startActivity(intent);
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "y0NCtJPY3zY");
                startActivity(intent);
            }
        });
        pk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "MvSn2HLKs6Q");
                startActivity(intent);
            }
        });
        kick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "13E2PrG2kYM");
                startActivity(intent);
            }
        });
        dhoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "sQ8Ic5ihzYk");
                startActivity(intent);
            }
        });

        talash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "fS3371JGDso");
                startActivity(intent);
            }
        });
        rustum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "VSynObleVMk");
                startActivity(intent);
            }
        });
        villion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "FUf6wPVoNB8");
                startActivity(intent);
            }
        });

        singum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "odMJEaP0GGg");
                startActivity(intent);
            }
        });
        yehdiwani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "oze35VbeAkM");
                startActivity(intent);
            }
        });
        aagnipath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "AYhZe1QT1DQ");
                startActivity(intent);
            }
        });
        aasque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "n_BRrvlxChA");
                startActivity(intent);
            }
        });
        baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "3_UnxDqgwbc");
                startActivity(intent);
            }
        });
        dirtypicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "NwOwZos4nR0");
                startActivity(intent);
            }
        });
        dirtypoltics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "kh7lCdB412w");
                startActivity(intent);
            }
        });
        bodyguard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "jWZ2-mezzhY");
                startActivity(intent);
            }
        });
        gang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "dz3uCM-MrGY");
                startActivity(intent);
            }
        });
        idiate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "sSMqJzDt5w0");
                startActivity(intent);
            }
        });
        ragni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "quTSwgIyy9k");
                startActivity(intent);
            }
        });
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "uA2x_yT61LI");
                startActivity(intent);
            }
        });
        mujhse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "IzBVFkUM7eQ");
                startActivity(intent);
            }
        });
        khoobsurat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = YouTubeStandalonePlayer.createVideoIntent(Movie.this, "AIzaSyBSy06FYgybDhwNHysa_SNMgPbc9TwtLic", "SU_23gzG-KQ");
                startActivity(intent);
            }
        });





    }
}
