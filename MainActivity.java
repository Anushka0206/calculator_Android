package com.example.calculator;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // ✅ Fix this

        EditText editTextText, editTextText2;
        TextView po;
        Button badd, bsub, bmul, bdiv;

        editTextText = findViewById(R.id.editTextText); // ✅ You missed this line
        editTextText2 = findViewById(R.id.editTextText2);
        badd = findViewById(R.id.button);
        bsub = findViewById(R.id.button2);
        bmul = findViewById(R.id.button3);
        bdiv = findViewById(R.id.button4);
        po = findViewById(R.id.textView);

        badd.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editTextText.getText().toString());
            int num2 = Integer.parseInt(editTextText2.getText().toString());
            int result = num1 + num2;
            po.setText(String.valueOf(result));
        });

        bsub.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editTextText.getText().toString());
            int num2 = Integer.parseInt(editTextText2.getText().toString());
            int result = num1 - num2;
            po.setText(String.valueOf(result));
        });

        bmul.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editTextText.getText().toString());
            int num2 = Integer.parseInt(editTextText2.getText().toString());
            int result = num1 * num2;
            po.setText(String.valueOf(result));
        });

        bdiv.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editTextText.getText().toString());
            int num2 = Integer.parseInt(editTextText2.getText().toString());

            if (num2 != 0) {
                int result = num1 / num2;
                po.setText(String.valueOf(result));
            } else {
                po.setText("Cannot divide by zero");
            }
        });
    }
}
