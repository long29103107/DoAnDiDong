package com.example.myapplication.ui.mon_chinh;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.adapters.MonAnAdapter;
import com.example.myapplication.model.MonAn;

import java.util.LinkedList;

public class MenuMonChinhViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MonAnAdapter adapter;

    public MenuMonChinhViewModel() {
        LinkedList<MonAn> monAns=new LinkedList<>();

        for(int i=0;i<10;i++){
            MonAn food=new MonAn(i,"MonAnChinh "+i,66666,"");
            food.setHinhAnh("https://images.viblo.asia/avatar/48521ea9-cc68-4eba-9280-1c3d9aaa0c9a.jpg");
            monAns.add(food);
        }

        adapter=new MonAnAdapter(monAns);
    }

    public MonAnAdapter getAdapter() {
        return adapter;
    }
}