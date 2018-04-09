package com.example.android.applicationsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.applicationsample.R;

public class MainActivity extends AppCompatActivity {

    /** Radio variables */
    RadioGroup q2_radio;
    RadioButton radioButton2b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        /** Check q1 and q3 EditText */
        int Score = 0;

        EditText answer1 = findViewById(R.id.editText1);
        String answerQ1 = answer1.getText().toString();
        if (answerQ1.equals("'ekahi"))
            Score = Score + 1;

        EditText answer3 = findViewById(R.id.editText3);
        String answerQ3 = answer3.getText().toString();
        if (answerQ3.equals("'umi"))
            Score = Score + 1;

        /** Check q2 radio */
        q2_radio = findViewById(R.id.q2_radio);
        int q2Answer = q2_radio.getCheckedRadioButtonId();
        radioButton2b = findViewById(q2Answer);
        RadioButton q2Correct = findViewById(R.id.q2_b);
        if (q2Correct.isChecked()) {
            Score = Score + 1;
        }
        /**Check q4 checkbox */
        CheckBox q4a = (CheckBox) findViewById(R.id.q4_a);
        if (q4a.isChecked()) {
            Score = Score + 1;
        }
        CheckBox q4b = (CheckBox) findViewById(R.id.q4_b);
        if (q4b.isChecked()) {
            Score = Score + 1;
        }
        CheckBox q4c = (CheckBox) findViewById(R.id.q4_c);
        if (q4c.isChecked()) {
            Score = Score + 1;
        }

        /** Toast x out of 6 correct */
        Toast.makeText(this, String.valueOf(Score) + " out of 6 correct!", Toast.LENGTH_SHORT).show();

        /** Reset answers */

        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
