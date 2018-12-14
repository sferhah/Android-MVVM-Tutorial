package com.example.myself.myapplication;

import android.databinding.ObservableField;

import java.util.Random;

public class ItemViewModel {

    public ObservableField<String> title = new ObservableField<>();
    public ObservableField<String> description = new ObservableField<>();

    static Random random = new Random();
    private int x;

    public ItemViewModel(){
        assign(x = random.nextInt(100) + 1);
    }

    public void squareTwo() {
        assign(x = x*2);
    }

    private void assign(int x) {
        title.set(String.valueOf(x*2));
        description.set(String.valueOf(x));
    }

}
