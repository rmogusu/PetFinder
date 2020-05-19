package com.moringaschool.petfinder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class PetsActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<PetsActivity> activityTestRule =
            new ActivityTestRule<>(PetsActivity.class);
}
