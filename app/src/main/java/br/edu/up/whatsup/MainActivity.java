package br.edu.up.whatsup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText input_cellphone;
    private TextInputEditText input_message;
    private Button button_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_cellphone = findViewById(R.id.input_cellphone);
        input_message = findViewById(R.id.input_message);
        button_send = findViewById(R.id.button_send);

        button_send.setOnClickListener(v -> {
            String cellphone = input_cellphone.getText().toString();
            String message = input_message.getText().toString();

            Uri webpage = Uri.parse("https://wa.me/55" + cellphone + "?text=" + message);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

            startActivity(intent);
        });
    }
}