package com.jpsappclub.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class CalculateActivity extends AppCompatActivity {
    ImageView redView, greenView, blueView, yellowView, cyanView, pinkView, resultView;

    public boolean redSelected, greenSelected, blueSelected, yellowSelected, cyanSelected, pinkSelected = false;

    public ArrayList<Color> selectedColors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        redView = (ImageView) findViewById(R.id.redView);
        redView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!redSelected) {
                    selectedColors.add(Color.redColor);
                    redSelected = true;
                }
            }
        });

        greenView = (ImageView) findViewById(R.id.greenView);
        greenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!greenSelected) {
                    selectedColors.add(Color.greenColor);
                    greenSelected = true;
                }
            }
        });

        blueView = (ImageView) findViewById(R.id.blueView);
        blueView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!blueSelected) {
                    selectedColors.add(Color.blueColor);
                    blueSelected = true;
                }
            }
        });

        yellowView = (ImageView) findViewById(R.id.yellowView);
        yellowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!yellowSelected) {
                    selectedColors.add(Color.yellowColor);
                    yellowSelected = true;
                }
            }
        });

        cyanView = (ImageView) findViewById(R.id.cyanView);
        cyanView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cyanSelected) {
                    selectedColors.add(Color.cyanColor);
                    cyanSelected = true;
                }
            }
        });

        pinkView = (ImageView) findViewById(R.id.pinkView);
        pinkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pinkSelected) {
                    selectedColors.add(Color.pinkColor);
                    pinkSelected = true;
                }
            }
        });

        resultView = (ImageView) findViewById(R.id.resultView);

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedColors.size() > 0) {
                    final Color result = ColorCalculator.addColors(selectedColors);
                    resultView.setBackgroundColor(
                        android.graphics.Color.rgb(result.getRed(), result.getGreen(), result.getBlue())
                    );
                    selectedColors.clear();
                    redSelected = false;
                    greenSelected = false;
                    blueSelected = false;
                    yellowSelected = false;
                    cyanSelected = false;
                    pinkSelected = false;
                }
            }
        });
    }
}
