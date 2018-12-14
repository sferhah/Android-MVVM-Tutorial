package com.example.myself.myapplication;

import android.app.Application;
import android.databinding.DataBindingUtil;
import com.example.myself.myapplication.helpers.RecyclerViewDataBinding;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DataBindingUtil.setDefaultComponent(new android.databinding.DataBindingComponent() {
                                                @Override
                                                public RecyclerViewDataBinding getRecyclerViewDataBinding() {
                                                    return new RecyclerViewDataBinding();
                                                }
                                            }
        );
    }
}