package com.hippo.glview.example;

import android.os.Bundle;
import android.util.Log;

import com.hippo.glview.view.GLRootView;

public class MainActivity extends GLActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GLRootView glRootView = getGLRootView();
        glRootView.setContentPane(new GLTestView());
    }

    @Override
    protected int getGLRootViewId() {
        return R.id.gl_root;
    }

    @Override
    public void onGLThreadStarts() {
        Log.d("TAG", "onGLThreadStarts");
    }

    @Override
    public void onGLThreadExits() {
        Log.d("TAG", "onGLThreadExits");
    }

    @Override
    public void onGLThreadPause() {
        Log.d("TAG", "onGLThreadPause");
    }

    @Override
    public void onGLThreadResume() {
        Log.d("TAG", "onGLThreadResume");
    }
}
