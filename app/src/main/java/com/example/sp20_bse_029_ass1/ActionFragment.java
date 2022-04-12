package com.example.sp20_bse_029_ass1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ActionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActionFragment extends Fragment {

    private Communication communication;
    private Button addRec;
    private Button searchRec;

    public ActionFragment() {
        // Required empty public constructor
    }


    public static ActionFragment newInstance() {
        ActionFragment fragment = new ActionFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            communication = (Communication) context;
        }catch (ClassCastException error) {
            error.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action, container, false);
        addRec = view.findViewById(R.id.AddRec);
        searchRec = view.findViewById(R.id.SearchRec);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        addRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                communication.addRecordFrag();
            }
        });
    }

    interface Communication {
        public void addRecordFrag();
    }
}