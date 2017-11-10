package com.example.admin.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.example.admin.quizapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.a2:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.a3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.a4:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.b1:
                if (checked)
                    break;
                else
                    // Remove the meat
                    break;
            case R.id.b2:
                if (checked)
                    break;
                    // Cheese me
                else
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
            case R.id.b3:
                if (checked)
                    break;
                else
                    // Remove the meat
                    break;
            case R.id.b4:
                if (checked)
                    break;
                    // Cheese me
                else
                    // I'm lactose intolerant
                    break;
                // TODO: Veggie sandwich
        }
    }
}