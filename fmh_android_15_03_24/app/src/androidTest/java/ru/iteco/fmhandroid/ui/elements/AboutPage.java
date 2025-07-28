package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class AboutPage {

    private final Matcher<View> BoutElementButtonAbout = allOf(withId(android.R.id.title), withText("About")) ;
    private final Matcher<View> BoutElementButtonPrivacyPolicy = withId(R.id.about_privacy_policy_value_text_view);
    private final Matcher<View> BoutElementButtonTermsOfUse = withId(R.id.about_terms_of_use_value_text_view);
    private final Matcher<View> PressBackButton = withContentDescription("Navigate up");


        public ViewInteraction BoutElement() {
            return onView(BoutElementButtonAbout);
        }
        public ViewInteraction BoutElementButtonPrivacy () {
        return onView(BoutElementButtonPrivacyPolicy);
         }
        public ViewInteraction BoutElementButtonTerms() {
        return onView(BoutElementButtonTermsOfUse);
        }
        public ViewInteraction PressBack() {
        return onView(PressBackButton);
    }

}
