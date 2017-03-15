package com.example.damian.app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText(View view) {
        EditText nameEditText = ((EditText) findViewById(R.id.nameEditText));
        TextView nameTextView = (TextView) findViewById(R.id.outputTextView);

        if (!nameEditText.getText().toString().isEmpty()) {
            nameTextView.setText(nameEditText.getText());
            nameEditText.setEnabled(false);
        } else {
            nameEditText.setError(getResources().getString(R.string.emptyField));
        }

        if (!nameEditText.isEnabled()) {

        }
    }
}
