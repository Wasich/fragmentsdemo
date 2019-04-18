package com.example.designer2.fragmentsdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designer2.fragmentsdemo.Model.Category;
import com.example.designer2.fragmentsdemo.R;
import com.example.designer2.fragmentsdemo.adapter.HorizontalAdapter;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {
    private static final String JASON_URL = "https://mufassirislam.com/apps/blog/api/category.php?action=getCategoryList";
    public RecyclerView horizontalRecyclerView;
    public HorizontalAdapter adapter;
    public List<Category> firscategory;

    SearchView searchView;




    public Fragment1() {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_fragment1, container, false);
        

    }

}
