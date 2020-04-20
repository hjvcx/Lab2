package com.example.lab2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.lab2.R;
import com.example.lab2.TestClass;

public class PageFragment extends Fragment {

    private int pageNumber;

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        Bundle args=new Bundle();
        args.putInt("num", page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TestClass testClass1 = new TestClass(1, "1");
        //TestClass testClass2 = new TestClass(2, "2");

        TestClass[] testObject = new TestClass[10];
        for (int i = 0; i < 10; i++) {
            testObject[i] = new TestClass(i + 100, Integer.toString(i + 200));
        }

        //View result=inflater.inflate(R.layout.fragment_page, container, false);
        View result=inflater.inflate(R.layout.test_fragment_page, container, false);
        //TextView pageHeader1 = (TextView)result.findViewById(R.id.displayText);

        TextView pageHeader1 = (TextView)result.findViewById(R.id.displayText1);
        TextView pageHeader2 = (TextView)result.findViewById(R.id.displayText2);

        //String header = String.format("Фрагмент %d", pageNumber + 1);

        String header1 = String.format("a = %d", testObject[pageNumber].getA());
        String header2 = String.format("b = %s", testObject[pageNumber].getB());

        pageHeader1.setText(header1);
        pageHeader2.setText(header2);
        return result;
    }
}