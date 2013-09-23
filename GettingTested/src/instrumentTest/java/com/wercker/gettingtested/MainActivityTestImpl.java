package com.wercker.gettingtested;

import android.app.Activity;
import android.test.InstrumentationTestCase;
import android.widget.TextView;

import junit.framework.Assert;

/**
 * Created by jacco on 9/23/13.
 */
public class MainActivityTestImpl extends InstrumentationTestCase {

       public MainActivityTestImpl() {
            super()
       }

    public void testText() throws Exception {


        MainActivity activity;
        activity = getActivity();
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
