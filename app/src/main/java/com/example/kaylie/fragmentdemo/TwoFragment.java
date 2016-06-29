package com.example.kaylie.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by kaylie on 6/27/16.
 */
public class TwoFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This is where you do initialization for non view related things
        // Create your ArrayLists
        // Create your adapters
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate a view and return it
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvLabel = (TextView)view.findViewById(R.id.tvLabel);
        EditText etInput = (EditText)view.findViewById(R.id.etInput);
        // This is where you do view configuration
        // FindViewByIds
        // setText on TV
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Activity fully created
        // Do anything related to setup activity
    }


}

