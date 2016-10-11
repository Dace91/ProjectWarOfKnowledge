package com.project.alexis.warofknowledge;

/**
 * Created by Alexis on 03/09/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textResult = (TextView) findViewById(R.id.textResult);

        Bundle b = getIntent().getExtras();

        int score = b.getInt("score");

        textResult.setText("Votre score est de " + " " + score + ". félicitations pour ce résultat.");

    }

    public void playagain(View o) {

        Intent intent = new Intent(this, MenuActivity.class);

        startActivity(intent);

    }
}
