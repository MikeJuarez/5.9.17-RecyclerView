package com.bignerdranch.android.a5917_recyclerview;

import android.support.v4.app.Fragment;

public class RecyclerViewActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment()
    {
        return new RecyclerFragment();
    }
}
