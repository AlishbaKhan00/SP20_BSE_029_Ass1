package com.example.sp20_bse_029_ass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LeftFragment.FragmentLeftComInterface {
    private LeftFragment leftFragment;
    private RightFragment rightFragment;
    private AddRecordFrag addRecordFrag;
    private SearchRecordFrag searchRecordFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation=getResources().getConfiguration().orientation;

        if(orientation== Configuration.ORIENTATION_LANDSCAPE) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            LeftFragment = (LeftFragment) fragmentManager.findFragmentById(R.id.fragmentContainerViewLeft);
            RightFragment = (RightFragment) fragmentManager.findFragmentById(R.id.fragmentContainerViewRight);
        }    }

    public void sendmessage(String message){ RightFragment.getMessage(message);}
    }