package com.example.firstform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText1 = editText1.findViewById(R.id.et1);
        editText2 = editText2.findViewById(R.id.et2);

        button = button.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.getText();
                editText2.getText();
                if (editText1.equals("skg") && editText2.equals("123")) {
                    Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Bye-Bye", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}