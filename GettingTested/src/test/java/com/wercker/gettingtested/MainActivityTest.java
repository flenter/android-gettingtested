package com.wercker.gettingtested;

import android.widget.TextView;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
//    private android.widget.TextView results;

//    @Before
//    public void setUp() throws Exception {
//        activity = new MainActivity();
//        activity.onCreate(null);
////        results = activity.findViewById(R.layout.activity_main);
//    }

    @Test
    public void shouldWelcome() throws Exception {

        MainActivity activity;
        activity = Robolectric.buildActivity(MainActivity.class).create().get();
        Assert.assertNotNull(activity);

        TextView tView;
        tView = (TextView) activity.findViewById(R.id.introText);
        Assert.assertNotNull(tView);

        String introText;
        introText = tView.getText().toString();
        Assert.assertNotNull(introText);

        Assert.assertTrue("Check intro text", introText.equals("Hello world"));

    }
}