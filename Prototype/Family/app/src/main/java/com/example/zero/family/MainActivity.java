package com.example.zero.family;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends Activity implements MainPage.OnFragmentInteractionListener,MapCommunity.OnFragmentInteractionListener,
        Sharing.OnFragmentInteractionListener,LoginFragment.OnFragmentInteractionListener{


    public void ToNews(String news){
        getFragmentManager().beginTransaction()
                .replace(R.id.place_holder,new MainPage())
                .addToBackStack(null)
                .commit();
    }
    public void JumptoMainpage(String info)
    {
        getFragmentManager().beginTransaction()
                .replace(R.id.place_holder,new MapCommunity())
                .addToBackStack(null)
                .commit();
    }

    public void JumptoSharing(String info)
    {
        getFragmentManager().beginTransaction()
                .replace(R.id.place_holder,new Sharing())
                .addToBackStack(null)
                .commit();
    }

    public void sendPositionToDetail(String name) {
        getFragmentManager().beginTransaction()
                .replace(R.id.place_holder,DetailFragment.newInstance(name))
                .addToBackStack(null)
                .commit();

    }

    public void sendPositionToFragment2(String Cname) {
        getFragmentManager().beginTransaction()
                .replace(R.id.place_holder,Detail.newInstance(Cname))
                .addToBackStack(null)
                .commit();
    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        PackageManager pm = getPackageManager();
        try {
            PackageInfo pi = pm.getPackageInfo("com.lyt.android", 0);
            // TextView versionNumber = (TextView)
            // findViewById(R.id.versionNumber);
            // versionNumber.setText("Version " + pi.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                getFragmentManager().beginTransaction()
                        .add(R.id.place_holder,new LoginFragment())
                        .addToBackStack(null)
                        .commit();
              //  finish();
            }
        }, 2500);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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




    @Override
    public void onBackPressed()
    {
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0)
            fm.popBackStack();
        else
            super.onBackPressed();
    }
}
