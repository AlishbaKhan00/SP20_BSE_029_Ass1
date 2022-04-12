package com.example.sp20_bse_029_ass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionFragment.Communication {
    private AddRecordFrag addRecordFrag;
    private SearchRecordFrag searchRecordFrag;
    private  FragmentManager fragmentManager;
    private ActionFragment actionFragment;
    private MessageFragment messageFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int orientation=getResources().getConfiguration().orientation;

        if(orientation== Configuration.ORIENTATION_LANDSCAPE) {
         fragmentManager = getSupportFragmentManager();
         fragmentTransaction = fragmentManager.beginTransaction();

         actionFragment = actionFragment.newInstance();
         messageFragment = messageFragment.newInstance();

         fragmentTransaction.replace(R.id.layoutLeft,actionFragment);
         fragmentTransaction.replace(R.id.layoutRight,messageFragment);
         fragmentTransaction.commitNow();
        }
    }

    @Override
    public void addRecordFrag() {
        fragmentTransaction = fragmentManager.beginTransaction();

        addRecordFrag = addRecordFrag.newInstance();

        fragmentTransaction.replace(R.id.layoutRight,addRecordFrag);
        fragmentTransaction.commitNow();
    }
}