package com.example.layoutmng;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Find views by their IDs
        TextView textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        // Set an OnClickListener for the EditText
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event (e.g., show a message)
                // You can customize this behavior as needed
                textView.setText("EditText clicked!");
            }
        });
    }
}