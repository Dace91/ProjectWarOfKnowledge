package com.project.alexis.warofknowledge;

/**
 * Created by Alexis on 05/09/2016.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class BoutiqueActivity extends Activity implements OnClickListener {

    Button button;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boutique);

        Button tree = (Button) findViewById(R.id.coupon2btn);
        tree.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.accueil_button);
        four.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.mapButton);
        six.setOnClickListener(this);

    }

    public void itemClicked(View v) {
        //code to check if this checkbox is checked!
        CheckBox checkBox = (CheckBox)v;
        if(checkBox.isChecked()){

        }
    }



    @Override
    public void onClick(View v) {

        final Context context = this;

        button = (Button) findViewById(R.id.mapButton);
        button = (Button) findViewById(R.id.accueil_button);
        button = (Button) findViewById(R.id.coupon2btn);


        switch (v.getId()) {

            case R.id.accueil_button:
               Intent intent = new Intent(context, MenuActivity.class);
                startActivity(intent);
                break;

            case R.id.mapButton:
                intent = new Intent(context, MapActivity.class);
                startActivity(intent);
                break;

            case R.id.coupon2btn:
                intent = new Intent(context, CouponActivity.class);
                startActivity(intent);
                break;


            default:
                break;
        }

    }

}
