package com.bignerdranch.android.a5917_recyclerview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import static android.R.id.list;

/**
 * Created by user on 5/10/2017.
 */

public class TestFagment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.list_item_baby, container, false);

        return v;
    }
}
