package com.moringaschool.petfinder;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
    }
}
