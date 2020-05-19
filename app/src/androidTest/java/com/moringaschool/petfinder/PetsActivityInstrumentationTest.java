package com.moringaschool.petfinder;
import android.view.View;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.IsNot.not;

@RunWith(AndroidJUnit4.class)
public class PetsActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<PetsActivity> activityTestRule =
            new ActivityTestRule<>(PetsActivity.class);
    @Test
    public void listItemClickDisplaysToastWithCorrectPet() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();
        String petName = "London";
        onData(anything())
                .inAdapterView(withId(R.id.listView))
                .atPosition(0)
                .perform(click());
        onView(withText(petName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(petName)));
    }
}
