/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.teatime;

import static android.support.test.espresso.Espresso.onView;
 import static android.support.test.espresso.action.ViewActions.click;
 import static android.support.test.espresso.assertion.ViewAssertions.matches;
 import static android.support.test.espresso.matcher.ViewMatchers.withId;
 import static android.support.test.espresso.matcher.ViewMatchers.withText;
 import android.support.test.rule.ActivityTestRule;
 import android.support.test.runner.AndroidJUnit4;
 import org.junit.Rule;
 import org.junit.Test;
 import org.junit.runner.RunWith;


/**
 * This test demos a user clicking the decrement button and verifying that it properly decrease
 * the quantity the total cost.
 */

// TODO (1) Add annotation to specify AndroidJUnitRunner class as the default test runner
@RunWith(AndroidJUnit4.class)
public class OrderActivityBasicTest {
 @Rule
 public ActivityTestRule<OrderActivity> mActivityTestRule =
                    new ActivityTestRule<>(OrderActivity.class);

@Test
  public void clickDecrementButton_ChangesQuantityAndCost() {


        //1. Find the view

        //2. Perform action on the view
        onView((withId(R.id.increment_button))).perform(click());

       //3. Check if the view what you expected
    onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
    onView(withId(R.id.cost_text_view)).check(matches(withText("$5.00")));
    }


}