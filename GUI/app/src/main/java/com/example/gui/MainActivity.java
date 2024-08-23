package com.example.gui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView titleTextView;
    private EditText nameEditText;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.title_text_view);
        nameEditText = findViewById(R.id.name_edit_text);
        submitButton = findViewById(R.id.submit_button);

        // Set
        titleTextView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/"));
    }
}