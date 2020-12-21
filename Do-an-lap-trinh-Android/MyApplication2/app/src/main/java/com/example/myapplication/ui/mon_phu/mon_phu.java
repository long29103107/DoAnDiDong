package com.example.myapplication.ui.mon_phu;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

public class mon_phu extends Fragment {

    private MonPhuViewModel mViewModel;
    private RecyclerView rv;
    public static mon_phu newInstance() {
        return new mon_phu();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.mon_phu_fragment, container, false);
        rv=inflate.findViewById(R.id.rv_mon_phu);
        mViewModel=new MonPhuViewModel();
        rv.setAdapter(mViewModel.getAdapter());
        rv.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MonPhuViewModel.class);
        // TODO: Use the ViewModel
    }

}