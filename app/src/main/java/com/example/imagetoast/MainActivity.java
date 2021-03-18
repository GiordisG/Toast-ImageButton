package com.example.imagetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton image;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.textView);
        image = findViewById(R.id.imageButton);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText("CONGRATS YOU'RE MORE INTELLIGENT");
                Toast toast = Toast.makeText(getApplicationContext(), "AHORA ERES FAMOSO", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}