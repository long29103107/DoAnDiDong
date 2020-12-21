package com.example.myapplication.ui.mon_chinh;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

public class MenuMonChinhFragment extends Fragment {

    private MenuMonChinhViewModel mViewModel;
    private RecyclerView rv;
    public static MenuMonChinhFragment newInstance() {
        return new MenuMonChinhFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.menu_mon_chinh_fragment, container, false);
        rv= root.findViewById(R.id.rv_mon_chinh);
        mViewModel=new MenuMonChinhViewModel();
        rv.setLayoutManager(new GridLayoutManager(this.getContext(),3,GridLayoutManager.VERTICAL,false));
        rv.setAdapter(mViewModel.getAdapter());
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MenuMonChinhViewModel.class);
    }

}