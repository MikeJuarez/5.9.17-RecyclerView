package com.bignerdranch.android.a5917_recyclerview;

import java.util.UUID;

/**
 * Created by user on 5/9/2017.
 */

public class Baby {

    private String mBabyName;
    private int mAge;
    private UUID mSSN;

    public Baby() {
        mSSN = UUID.randomUUID();
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    public String getBabyName() {
        return mBabyName;
    }

    public void setBabyName(String babyName) {
        mBabyName = babyName;
    }

    public UUID getSSN() {
        return mSSN;
    }





}
