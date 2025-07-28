package ru.iteco.fmhandroid.ui.elements;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import androidx.test.espresso.ViewInteraction;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;


public class AuthorizationPage {
    private final Matcher<View> AuthorizationElementsButton = withId(R.id.enter_button);
    private final Matcher<View> AuthorizationElementsLoginField = allOf(withHint("Login"), withParent(withParent(withId(R.id.login_text_input_layout))));
    private final Matcher<View> AuthorizationElementsPasswordField = allOf(withHint("Password"), withParent(withParent(withId(R.id.password_text_input_layout))));
    private final Matcher<View> AuthorizationElementsButtonExit = withId(R.id.authorization_image_button);
    private final Matcher<View> AuthorizationElementsButtonLogOut = allOf(withId(android.R.id.title), withText("Log out"));
    private final Matcher<View> AuthorizationElementsTextAuthorization = allOf(withText("Authorization"), withParent(withParent(withId(R.id.nav_host_fragment))));
    public int loginField;
    public static String rightLogin;
    public static String rightPassword;
    public static String unregisteredLogin;
    public static String loginWithSpecialCharacters;
    public static String oneLetterLogin;
    public static String differentRegexLogin;
    public static String unregisteredPassword;
    public static String passwordWithSpecialCharacters;
    public static String oneLetterPassword;
    public static String differentRegexPassword;
    public int loginLayout;
    public int enterButton;

    public ViewInteraction AuthorizationLocatorButton(){
        return onView(AuthorizationElementsButton);
    }
    public ViewInteraction AuthorizationLocatorLoginField(){
        return onView(AuthorizationElementsLoginField);
    }
    public ViewInteraction AuthorizationLocatorPasswordField(){
        return onView(AuthorizationElementsPasswordField);
    }
    public ViewInteraction AuthorizationLocatorButtonExit(){
        return onView(AuthorizationElementsButtonExit);
    }
    public ViewInteraction AuthorizationLocatorButtonLogOut(){
        return onView(AuthorizationElementsButtonLogOut);
    }
    public ViewInteraction AuthorizationLocatorTextAuthorization(){
        return onView(AuthorizationElementsTextAuthorization);
    }



    public AuthorizationPage() {

        loginField = R.id.login_text_input_layout;
        rightLogin = "login2";
        rightPassword = "password2";
        unregisteredLogin = "login235";
        loginWithSpecialCharacters = "№;%:?*(!№";
        oneLetterLogin = "l";
        differentRegexLogin = "LoGin2";
        unregisteredPassword = "password123";
        passwordWithSpecialCharacters = "%:;%№*%:?";
        oneLetterPassword = "p";
        differentRegexPassword = "PassWord2";
        loginLayout = R.id.login_text_input_layout;
        enterButton = R.id.enter_button;
    }
}
