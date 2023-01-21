package com.example.evaluation_formative_01_2713413;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final   static double taux = 0.85;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    public void FunConvertion(View view)
    {
        EditText Montant = findViewById(R.id.DollarsConvertir);
        String  str = Montant.getText().toString();
        TextView result = findViewById(R.id.Resultat);
        double result_calcul;
        if (str.isEmpty()){
            result_calcul = 0.0;
            result.setTextColor(getResources().getColor(R.color.Red));
        }
        else{
            result_calcul = Double.parseDouble(str) / taux;
            result.setTextColor(getResources().getColor(R.color.Green));
        }
        result.setText(String.format("%.2f", result_calcul) + "dollars");
    }
}