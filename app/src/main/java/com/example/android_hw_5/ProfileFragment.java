package com.example.android_hw_5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        ImageView profileImage = view.findViewById(R.id.profile_image);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView name = view.findViewById(R.id.name);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView phone = view.findViewById(R.id.phone);

        // Set profile data
        profileImage.setImageResource(R.drawable.ic_launcher_foreground);
        name.setText("John Doe");
        phone.setText("+1234567890");

        return view;
    }
}