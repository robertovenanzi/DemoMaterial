package com.dreamteam.demomaterial;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private DrawerLayout dLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nav);
        layout = (RelativeLayout) findViewById(R.id.layout);
        setNavigationDrawer();
        setToolBar();

        // set up the hamburger icon to open and close the drawer
        mDrawerToggle = new ActionBarDrawerToggle(this, dLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        dLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }


    private void setToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
        ab.setDisplayHomeAsUpEnabled(true);
    }

    private void setNavigationDrawer() {
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navView = (NavigationView) findViewById(R.id.navigation);

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                Fragment frag = null;
                int itemId = menuItem.getItemId();

                if (itemId == R.id.fab) {
                    frag = new NotaFragment();
                } else if (itemId == R.id.star) {
                    frag = new Fragment2();
                }

                if (frag != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                    transaction.replace(R.id.frame, frag);
                    transaction.commit();
                    dLayout.closeDrawers();
                    return true;
                }

                return false;
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        String btnName = null;

        switch(itemId) {
            case R.id.menu_settings:
                btnName = "Settings";
                break;
            case R.id.menu_compass:
                btnName = "Compass";
                break;
            case R.id.menu_help:
                btnName = "Help";
                break;

        }

        // Snackbar.make(layout, "Button " + btnName, Snackbar.LENGTH_SHORT).show();
        return true;
    }


}
