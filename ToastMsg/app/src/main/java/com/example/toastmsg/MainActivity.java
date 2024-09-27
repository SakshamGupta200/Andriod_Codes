package com.example.toastmsg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editText1,editText2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);
        button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String text = editText1.getText().toString();
             String text1 = editText2.getText().toString();

                Toast.makeText(MainActivity.this, "User Id: shubhangi  & Password: 123", Toast.LENGTH_SHORT).show();

                if (text.equals("shubhangi") && text1.equals("123")) {

                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}