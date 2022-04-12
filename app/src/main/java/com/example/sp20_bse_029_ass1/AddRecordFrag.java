package com.example.sp20_bse_029_ass1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddRecordFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddRecordFrag extends Fragment {


    public AddRecordFrag() {
        // Required empty public constructor
    }


    public static AddRecordFrag newInstance() {
        AddRecordFrag fragment = new AddRecordFrag();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_record, container, false);
    }
}