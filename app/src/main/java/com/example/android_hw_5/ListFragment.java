package com.example.android_hw_5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFragment extends Fragment {

    public ListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ListAdapter adapter = new ListAdapter(getData());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Item> getData() {
        return new ArrayList<>(Arrays.asList(
                new Item("Item 1", "Description 1", R.drawable.ic_launcher_foreground),
                new Item("Item 2", "Description 2", R.drawable.ic_launcher_foreground)));
    }
}