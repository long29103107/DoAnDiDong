package com.example.myapplication.ui.mon_phu;

import androidx.lifecycle.ViewModel;

import com.example.myapplication.adapters.MonAnAdapter;
import com.example.myapplication.model.MonAn;

import java.util.LinkedList;

public class MonPhuViewModel extends ViewModel {
    private MonAnAdapter adapter;

    public MonPhuViewModel() {
        LinkedList<MonAn> monAns=new LinkedList<>();
        for(int i=0;i<10;i++){
            MonAn food=new MonAn(i,"MonAnPhu "+i,66666,"");
            monAns.add(food);
        }
        adapter=new MonAnAdapter(monAns);
    }

    public MonAnAdapter getAdapter() {
        return adapter;
    }
}