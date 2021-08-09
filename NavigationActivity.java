package com.example.monthlybill;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.GridLayout;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.monthlybill.databinding.ActivityNavigationBinding;

import org.jetbrains.annotations.NotNull;

public class NavigationActivity extends AppCompatActivity {


    GridLayout homeAction;

    

    private AppBarConfiguration mAppBarConfiguration;
    public ActivityNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarNavigation.toolbar);
        binding.appBarNavigation.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_setting,R.id.nav_offer,R.id.nav_feedbak,R.id.nav_about,R.id.nav_inbox,R.id.nav_update,
                R.id.nav_share,R.id.nav_rate,R.id.nav_other)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_navigation);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);









        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.nav_home:
                        break;
                    case R.id.nav_setting:
                        Intent i = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(i);
                        break;
                    case R.id.nav_offer:
                        Intent j = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(j);
                        break;
                    case R.id.nav_feedbak:
                        Intent k = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(k);
                        break;
                    case R.id.nav_about:
                        Intent l = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(l);
                        break;
                    case R.id.nav_inbox:
                        Intent m = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(m);
                        break;
                    case R.id.nav_update:
                        Intent n = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(n);
                        break;
                    case R.id.nav_share:
                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plane");
                        String shareBody="http//play.google.com/store/apps";
                        String sharesubject="Ibank App";
                        sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                        startActivity(Intent.createChooser(sharingIntent,"Share Using"));
                        break;
                    case R.id.nav_rate:
                        Intent o = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(o);
                        break;
                    case R.id.nav_other:
                        Intent p = new Intent(NavigationActivity.this,Policy.class);
                        startActivity(p);
                        break;
                }
                drawer.closeDrawers();
                return false;
            }
        });



















                    homeAction=(GridLayout) findViewById(R.id.homeAction);

        setsingleEvent(homeAction);

    }

    private void setsingleEvent(GridLayout homeAction) {

        for(int i=0;i<homeAction.getChildCount();i++)
        {
            CardView cardView =(CardView)homeAction.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(NavigationActivity.this,maindservice.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(NavigationActivity.this,Accountmain.class);
                        startActivity(intent);
                    }
                    else if(finalI==2)
                    {
                        Intent intent = new Intent(NavigationActivity.this,MainActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==3)
                    {
                        Intent intent = new Intent(NavigationActivity.this,Loan.class);
                        startActivity(intent);
                    }
                    else if(finalI==4)
                    {
                        Intent intent = new Intent(NavigationActivity.this,Card_Service.class);
                        startActivity(intent);
                    }
                    else if(finalI==5)
                    {
                        Intent intent = new Intent(NavigationActivity.this,insurance.class);
                        startActivity(intent);
                    }
                }
            });
        }

    }

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_navigation);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_privacy){
            Intent intent = new Intent(NavigationActivity.this,Policy.class);
            startActivity(intent);
            finish();

            return true;
        }
        else
        if (id == R.id.action_about){
            Intent intent = new Intent(NavigationActivity.this,Policy.class);
            startActivity(intent);
            finish();
            return true;
        }

        else
        if (id ==R.id.action_contact){
            Intent intent = new Intent(NavigationActivity.this,Policy.class);
            startActivity(intent);
            finish();
            return true;
        }
        else
        if (id ==R.id.action_logout){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Do you want to Logout?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            NavigationActivity.super.onBackPressed();

                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();

                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            return true;

        }
        else



        return super.onOptionsItemSelected(item);
    }
}