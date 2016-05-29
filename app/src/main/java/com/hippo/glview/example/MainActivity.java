package com.hippo.glview.example;

import android.app.Activity;
import android.os.Bundle;

import com.hippo.glview.view.GLRootView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GLRootView glRootView = (GLRootView) findViewById(R.id.gl_root);
        glRootView.setContentPane(new GLTestView());
    }
}
