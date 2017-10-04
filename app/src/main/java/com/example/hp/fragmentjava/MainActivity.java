package com.example.hp.fragmentjava;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.io.FileDescriptor;
import java.io.PrintWriter;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Myfragment frag=new Myfragment();
        FragmentManager manag=getFragmentManager();
        FragmentTransaction trans=manag.beginTransaction();
       trans.add(R.id.lay1,frag,"myfragment");
        trans.commit();
    }


}
