package com.example.akashkumar.a_2_zplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,RewardedVideoAdListener {
    AdView adView;
    int a;
    //private RewardedVideoAd mAd;
    private InterstitialAd interstitialAd;
Button kanika,neha,neeti,palak,sakira,lady,marish,katy,modanna,wedding;
Button bollywood,bhojpuri,international,panjabi,lovesong,partysong,itemsong,yoyo,mika,badshah,arjit,guru,justil,jason,david,choris,pipbull,sherya,alltime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         MobileAds.initialize(this,"ca-app-pub-4614943972616024~8247040705");
       // AdView adView;
      adView=findViewById(R.id.adview);
      AdRequest adRequest=new AdRequest .Builder() .build();
        adView.loadAd(adRequest);


      interstitialAd=new InterstitialAd(this);
      interstitialAd.setAdUnitId("ca-app-pub-4614943972616024/2315115220");
      interstitialAd.loadAd(new AdRequest.Builder().build());

    //  MobileAds.initialize(getApplicationContext(),"ca-app-pub-3940256099942544/5224354917");
    //  mAd=MobileAds.getRewardedVideoAdInstance(this);
     //   loadRewadevideo();
     //   mAd.setRewardedVideoAdListener(this);

interstitialAd.setAdListener(new AdListener()
{
    @Override
    public void onAdClosed() {

        if(a==1)
        {
            Intent intent=new Intent(MainActivity.this,bollywood1.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==2)
        {
            Intent intent=new Intent(MainActivity.this,International.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==3)
        {

            Intent intent=new Intent(MainActivity.this,Honeysingh.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==4)
        {

            Intent intent=new Intent(MainActivity.this,Mikasingh.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==5)
        {
            Intent intent=new Intent(MainActivity.this,Badshah.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==6)
        {

            Intent intent=new Intent(MainActivity.this,Arjit.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==7)
        {

            Intent intent=new Intent(MainActivity.this,justil.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==8)
        {
            Intent intent=new Intent(MainActivity.this,sherya.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
        else if(a==9)
        {
            Intent intent=new Intent(MainActivity.this,alltime.class);
            startActivity(intent);
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }





    }
});






  Button bt=findViewById(R.id.bt);
 /* bt.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          if(mAd.isLoaded())
          {
              mAd.show();
          }
      }
  });*/
        bollywood=findViewById(R.id.bollywood);
        alltime=findViewById(R.id.alltime);
        international=findViewById(R.id.international);
        itemsong=findViewById(R.id.itemsong);
        partysong=findViewById(R.id.party);


        wedding=findViewById(R.id.wedding);

        yoyo=findViewById(R.id.yoyo);
        mika=findViewById(R.id.mika);
        badshah=findViewById(R.id.badshah);
        arjit=findViewById(R.id.arjit);
        guru=findViewById(R.id.guru);
        justil=findViewById(R.id.justil);
        jason=findViewById(R.id.joson);
        pipbull=findViewById(R.id.pipbull);
        choris=findViewById(R.id.chiris);
        david=findViewById(R.id.devid2);


        sherya=findViewById(R.id.sheray);
        kanika=findViewById(R.id.kanika);
        neha=findViewById(R.id.neha);
        neeti=findViewById(R.id.neeti);
        palak=findViewById(R.id.palak);

        sakira=findViewById(R.id.sakira);
        lady=findViewById(R.id.lady);
        modanna=findViewById(R.id.modanna);
        katy=findViewById(R.id.katy);
        marish=findViewById(R.id.marish);







        bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=1;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,bollywood1.class);
                    startActivity(intent);
                }
            }
        });
        international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=2;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,International.class);
                    startActivity(intent);
                }
            }
        });

        partysong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Partysong.class);
                startActivity(intent);
            }
        });
        itemsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,itemsong.class);
                startActivity(intent);
            }
        });

        wedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Wedding.class);
                startActivity(intent);
            }
        });
        yoyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=3;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Honeysingh.class);
                    startActivity(intent);
                }
            }
        });
        mika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=4;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Mikasingh.class);
                    startActivity(intent);
                }

            }
        });
        bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,bollywood1.class);
                startActivity(intent);
            }
        });
        badshah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=5;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Badshah.class);
                    startActivity(intent);
                }
            }
        });
        guru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,gururandhawa.class);
                startActivity(intent);
            }
        });
        arjit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                  interstitialAd.show();
                  a=6;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,Arjit.class);
                    startActivity(intent);
                }

            }
        });
        justil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=7;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,justil.class);
                    startActivity(intent);
                }
            }
        });
        jason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,jason.class);
                startActivity(intent);
            }
        });
        david.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,david.class);
                startActivity(intent);
            }
        });
        pipbull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,pipbull.class);
                startActivity(intent);
            }
        });
        choris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,chris.class);
                startActivity(intent);
            }
        });
        sherya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=8;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,sherya.class);
                    startActivity(intent);

                }
            }
        });
        kanika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,kanika.class);
                startActivity(intent);
            }
        });
        neha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,neha.class);
                startActivity(intent);
            }
        });
        neeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,neeti.class);
                startActivity(intent);
            }
        });
        palak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,palak.class);
                startActivity(intent);
            }
        });
        sakira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,sakira.class);
                startActivity(intent);
            }
        });
        lady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,lady.class);
                startActivity(intent);
            }
        });
        marish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,marish.class);
                startActivity(intent);
            }
        });
        modanna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,modonna.class);
                startActivity(intent);
            }
        });
        katy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,katy.class);
                startActivity(intent);
            }
        });

        alltime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    a=9;
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this,alltime.class);
                    startActivity(intent);
                }
            }
        });




        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        }  else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_dashboard:
                    Intent intent1=new Intent(MainActivity.this,Movie.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_notifications:

                    Intent intent=new Intent(MainActivity.this,livenews.class);
                    startActivity(intent);
                    return true;
            }
            return false;
        }
    };
   /* private void loadRewadevideo()
    {
        if(mAd.isLoaded())
        {
            mAd.loadAd("ca-app-pub-3940256099942544/5224354917",new AdRequest.Builder().build());
        }
    }*/

    @Override
    public void onRewardedVideoAdLoaded() {


    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

       // loadRewadevideo();
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }

  /*  @Override
    protected void onPause() {
        mAd.pause(this);
        super.onPause();
    }

    @Override
    protected void onResume() {
        mAd.resume(this);
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mAd.destroy(this);
        super.onDestroy();
    }*/

    /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }*/
}
