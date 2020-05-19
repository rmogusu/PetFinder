package com.moringaschool.petfinder;

import android.content.Intent;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.TestCase.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;
    @Before
    public void setup(){
        activity = Robolectric.setupActivity(MainActivity.class);
    }
    @Test
    public void validateTextViewContent(){
        TextView appNameTextView = activity.findViewById(R.id.appNameTextView);
        assertTrue("PetFinder".equals(appNameTextView.getText().toString()));
    }
    @Test
    public void secondActivityStarted(){
        activity.findViewById(R.id.findPetsButton).performClick();
        Intent expectedIntent = new Intent(activity, PetsActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }
}
