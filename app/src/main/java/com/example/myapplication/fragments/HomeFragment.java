package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.CategoryAdapter;
import com.example.myapplication.adapters.SliderAdapter;
import com.example.myapplication.models.CategoryModel;
import com.google.firebase.Firebase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView catRecyclerView;
    CategoryAdapter categoryAdapter;
    List<CategoryModel> categoryModelList;


    FirebaseFirestore db ;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        catRecyclerView = root.findViewById(R.id.rec_category);

        catRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        categoryModelList = new ArrayList<>();
        categoryAdapter = new CategoryAdapter(getActivity(),categoryModelList);
        catRecyclerView.setAdapter(categoryAdapter);


//        ImageSlider imageSlider = root.findViewById(R.id.image_slider);
//        List<SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel(R.drawable.banner1,"Discount on Shoe Items", ScaleTypes.CENTER_CROP));
//        slideModels.add(new SlideModel(R.drawable.banner2,"Discount on perfume", ScaleTypes.CENTER_CROP));
//        slideModels.add(new SlideModel(R.drawable.banner3,"70% OFF", ScaleTypes.CENTER_CROP));
//        imageSlider.setImageList(slideModels);

        // Inflate the layout for this fragment
        return root;
    }
}