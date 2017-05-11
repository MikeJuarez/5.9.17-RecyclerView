package com.bignerdranch.android.a5917_recyclerview;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by user on 5/9/2017.
 */

public class BabyFactory {

    private static BabyFactory sBabyFactory;
    private List<Baby> sBabyList;

    public static BabyFactory get(Context context){
        if (sBabyFactory == null)
            sBabyFactory = new BabyFactory(context);
        return sBabyFactory;
    }

    private BabyFactory(Context context)
    {
        sBabyList = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            Baby newBaby = new Baby();
            newBaby.setAge(i);
            newBaby.setBabyName("Baby " + i);

            sBabyList.add(newBaby);
        }

    }

    public List<Baby> getsBabyList() {
        return sBabyList;
    }

    public Baby getBaby(UUID ssn)
    {
        for (Baby baby: sBabyList)
        {
            if (baby.getSSN().equals(ssn))
                return baby;
        }

        return null;
    }









}
