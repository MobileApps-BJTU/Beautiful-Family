package com.example.practice_test_2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


public class Mainpage extends Activity implements mainFragment.OnFragmentInteractionListener{

    private Spinner spinner;
    public void onFragmentInteraction(Uri uri)
    {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);



        spinner = (Spinner)findViewById(R.id.specific);
        final String item_specific[] = new String[]{
            "Medical",
            "Tomibaby",
            "Health",
            "Cook",
            "Fitment",
            "Sales",
            "Second-hand" };

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,item_specific);
        spinner.setAdapter(adapter);

       getFragmentManager().beginTransaction()
                .replace(R.id.placeHolder,new mainFragment())
                .commit();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mainpage, menu);

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
}
