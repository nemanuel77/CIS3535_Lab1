package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.btnClickMe);
        final TextView myText = findViewById(R.id.textView2);


        myButton.setOnClickListener((new View.OnClickListener() {
            int count = 0;

            @Override
            public void onClick(View v) {
                count++;
             Log.d("You clicked", "the button!");
             myText.setText("You've clicked the RAM-eating button " + count + " times!");
            }
        }));


    }
}