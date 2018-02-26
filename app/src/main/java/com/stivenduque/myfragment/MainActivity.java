package com.stivenduque.myfragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.FragmentManager fragmentManager = getFragmentManager();

                android.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

                BlankFragment fragment = new BlankFragment();
                transaction.add(R.id.Fragment, fragment).commit();
            }
        });
    }




    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
