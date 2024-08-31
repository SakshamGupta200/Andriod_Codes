package com.example.form;

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

    private EditText editText1,editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = editText1.findViewById(R.id.et1);
        editText2 = editText2.findViewById(R.id.et2);

        button = button.findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String txt = editText1.getText().toString();
                String txt1 = editText2.getText().toString();

                if (txt.equals("skg") && txt1.equals("123")) {
                    Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Bye-Bye", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}