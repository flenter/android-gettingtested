package com.wercker.gettingtested.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.wercker.gettingtested.MainActivity;
import com.wercker.gettingtested.R;

/**
 * Created by jacco on 9/23/13.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.wercker.gettingtested", MainActivity.class);
    }


    public void testWelcomeText() {
        MainActivity activity;
        activity = (MainActivity) getActivity();
        assertNotNull(activity);

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.introText);
        assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        assertNotNull(introText);

        assertTrue("Check intro text", introText.equals("Hello world!"));
    }
}
