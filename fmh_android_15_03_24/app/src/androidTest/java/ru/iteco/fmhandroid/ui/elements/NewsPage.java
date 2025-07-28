package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

public class NewsPage {

    private final Matcher<View> NewsButton = allOf(withId(android.R.id.title), withText("News"));

    public ViewInteraction NewsButtonLocator() {
        return onView(NewsButton);
    }

}