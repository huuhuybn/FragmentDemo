package com.dotplays.fragmentdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // khai layout cho fragment
        return inflater.inflate(R.layout.fragment_blank, container,
                false);
    }

    // xu ly cac su kien tai day
    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        final TextView tvFragment = view.findViewById(R.id.tvFragment);

        tvFragment.setText("Hello FPT Poly");

        tvFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),
                        tvFragment.getText(),Toast.LENGTH_SHORT).show();
            }
        });




    }
}
