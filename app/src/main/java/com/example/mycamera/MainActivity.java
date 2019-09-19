package com.example.mycamera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    private Camera camera;
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
