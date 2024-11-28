package com.example.rejestracja;

import android.os.Bundle;




import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = ((EditText) findViewById(R.id.form1)).getText().toString().trim();


                String pass = ((EditText) findViewById(R.id.form2)).getText().toString().trim();
                String passConf = ((EditText) findViewById(R.id.form3)).getText().toString().trim();
                TextView text_2 = findViewById(R.id.text_2);

                if (!email.contains("@")) {
                    text_2.setText("Nieprawidłowy adres e-mail");

                } else if (!pass.equals(passConf)) {
                    text_2.setText("Hasła się różnią");
                } else {
                    text_2.setText("Witaj "+ email);

                }
            }
        });
    }
}
//koniec

