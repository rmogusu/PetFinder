package com.moringaschool.petfinder;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyPetsArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mPets;
    private String[] mBreed;

    public MyPetsArrayAdapter(Context mContext, int resource, String[] mPets, String[] mBreed) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mPets  = mPets;
        this.mBreed  = mBreed;
    }
}
