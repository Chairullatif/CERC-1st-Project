package com.khoirullatif.cercjeniskucing;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JenisFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JenisFragment extends Fragment {

    private RecyclerView rvCat;
    private ArrayList<Cat> listCat = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JenisFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment JenisFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JenisFragment newInstance() {
        JenisFragment fragment = new JenisFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jenis, container, false);
        rvCat = view.findViewById(R.id.rv_cats);
        rvCat.setHasFixedSize(true);

        listCat.addAll(CatsData.getListData());
        rvCat.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        ListCatAdapter listCatAdapter = new ListCatAdapter(listCat);
        rvCat.setAdapter(listCatAdapter);

        listCatAdapter.setOnItemClickCallback(new ListCatAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cat data) {
                showSelectedCat(data);
            }
        });
        return view;
    }

    private void showSelectedCat(Cat cat){
        Intent intent = new Intent(getContext(), DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_CAT, cat);
        startActivity(intent);
    }
}