package com.example.android_num4_texicost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(the_texi);
        setContentView(R.layout.activity_main);
    }
    private View.OnClickListener the_texi = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat nf = new DecimalFormat("0");
            EditText findcount = (EditText)findViewById(R.id.edit1);
            EditText findcount1 = (EditText)findViewById(R.id.edit2);
            EditText findcount2 = (EditText)findViewById(R.id.edit3);
            int basic = 75;//距離
            double distance = Double.parseDouble(findcount.getText().toString());
            double basicCount = Double.parseDouble(findcount1.getText().toString());
            double addCost = Double.parseDouble(findcount2.getText().toString());//總費用
            double count = basic + ((distance / basicCount) * addCost);
            TextView cost = (TextView)findViewById(R.id.textV4);
            if (distance < 250){ cost.setText("80 元"); }
            else if(distance >= 250 && addCost >=5){ cost.setText(nf.format(count) + "元"); }
        }
    };
}