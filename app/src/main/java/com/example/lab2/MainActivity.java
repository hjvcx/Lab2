package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.lab2.fragments.PageFragment1;
import com.example.lab2.fragments.PageFragment2;
import com.example.lab2.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println();

        //------------------------------------------------------------------------------------------

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        viewPager = findViewById(R.id.viewPager);
        pagerAdapter = new SliderPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);

        //------------------------------------------------------------------------------------------
    }
}
