package com.idlibra.purchasing.List;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.idlibra.purchasing.R;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    public static ListFragment newInstance(){
        ListFragment fragmentList = new ListFragment();
        return fragmentList;
    }

    public ListFragment() {
        // Required empty public constructor
    }

    RecyclerView rv_garasi;
    FloatingActionButton tambahmotor;
    SwipeRefreshLayout swLayoutGarasi;
    LinearLayout ll_hapus_motor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_list, container, false);
        return fragmentView;
    }

}
