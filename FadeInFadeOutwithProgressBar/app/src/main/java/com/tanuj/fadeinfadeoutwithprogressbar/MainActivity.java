package com.tanuj.fadeinfadeoutwithprogressbar;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        imageView = findViewById(R.id.imageView);


        Animation fadeIn = new AlphaAnimation((float) 0.3, (float) 1.0);

        fadeIn.setDuration(1000);
        fadeIn.setRepeatMode(ValueAnimator.REVERSE);
        fadeIn.setRepeatCount(ValueAnimator.INFINITE);

        Animation fadeOut = new AlphaAnimation((float) 1.0, (float) 0.3);
        fadeOut.setStartOffset(100);
        fadeOut.setDuration(1000);
        fadeOut.setRepeatMode(ValueAnimator.REVERSE);
        fadeOut.setRepeatCount(ValueAnimator.INFINITE);

        AnimationSet animation = new AnimationSet(true);
        ImageView loading = findViewById(R.id.imageView);
        loading.startAnimation(animation);
        animation.addAnimation(fadeIn);
        animation.addAnimation(fadeOut);

    }

    public void buGone(View view) {
        progressBar.setVisibility(View.GONE);
        imageView.setVisibility(View.GONE);

    }

    public void buShow(View view) {
        progressBar.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }

}
