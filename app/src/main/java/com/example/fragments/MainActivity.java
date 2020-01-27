package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IButtonFragment{
TextFragment textFragment=new TextFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeFragment(R.id.container,Button_Fragment.create(this));
        //teeext
    }
    public void changeFragment(int container, Fragment fragment){
        FragmentManager manager=getSupportFragmentManager(); //Достаем существующий фрагмент именно сапорт реализует обратную совместимость
        FragmentTransaction transaction=manager.beginTransaction();// будет менять фрагменты
        transaction.replace(container,fragment);
        transaction.commit();
    }

    @Override
    public void showTExtFragment() {
        changeFragment(R.id.container2,textFragment);
    }

    @Override
    public void showButtonFragment() {
   //  changeFragment(R.id.container2,Button_Fragment.create(this));
textFragment.changeText("New Text Absolutely");
    }
}
