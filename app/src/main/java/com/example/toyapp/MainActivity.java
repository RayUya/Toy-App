package com.example.toyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // checks list of toys in the scroll view
        // Analyzes main content of the toy app toys
        mToysListTextView =(TextView) findViewById(R.id.play_items);

        String[] toy_names = ToyBox.getToyNames();
        String[] toyNames = ToyBox.getToyNames();

        // defines the variable stated in the public class
        // Toy app features extends app compact
        for (String toyName : toyNames) {
            mToysListTextView.append(toyName + "\n\n\n");
        }

    }
}
