package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class MainPage {
    private final Matcher<View> MainElementsButtonMainMenu = withId(R.id.main_menu_image_button);
    private final Matcher<View> MainElementsButtonMain = allOf(withId(android.R.id.title), withText("Main"));
    private final Matcher<View> MainElementsButtonToRollUpAllNews = withId(R.id.expand_material_button);
    private final Matcher<View> MainElementsTitleNews = allOf(withText("News"), withParent(withParent(withId(R.id.container_list_news_include_on_fragment_main))));
    private final Matcher<View> MainElementsButtonAllNews = allOf(withId(R.id.all_news_text_view), withText("ALL NEWS"));
    public int mainMenuButton;
    public int buttonToExpandNews;
    public int allNews;

    public ViewInteraction MainLocatorButtonMainMenu(){
        return onView(MainElementsButtonMainMenu);
    }
    public ViewInteraction MainLocatorButtonMain(){
        return onView(MainElementsButtonMain);
    }
    public ViewInteraction MainLocatorButtonToRollUpAllNews(){
        return onView(MainElementsButtonToRollUpAllNews);
    }
    public ViewInteraction MainLocatorTitleNews(){
        return onView(MainElementsTitleNews);
    }
    public ViewInteraction MainLocatorButtonAllNews(){
        return onView(MainElementsButtonAllNews);
    }

    public MainPage() {


        mainMenuButton = R.id.main_menu_image_button;
        buttonToExpandNews = R.id.expand_material_button;
        allNews = R.id.all_news_text_view;

    }
}
