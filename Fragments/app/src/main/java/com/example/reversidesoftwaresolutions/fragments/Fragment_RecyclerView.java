package com.example.reversidesoftwaresolutions.fragments;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_RecyclerView extends Fragment {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    Configuration config;
    LinearLayoutManager llm;
    RecyclerView rv;

    public Fragment_RecyclerView(){
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_fragment__recycler_view, container, false);

        rv = rootView.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{" Tashinga", " Max", " Neo", " Kenny", " Klass" , " Jonathan"});
        rv.setAdapter(adapter);

        llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

         config = getResources().getConfiguration();
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        /** Check the device orientation and act accordingly
         */
        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE || config.orientation == Configuration.ORIENTATION_PORTRAIT) {
            /**
             * Landscape and portrait mode of the device
             */
            Fragment_RecyclerView fragment_recyclerView = new Fragment_RecyclerView();
            fragmentTransaction.replace(android.R.id.content, fragment_recyclerView);
        }

        return rootView;
    }
}
