package com.hippo.glview.example;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hippo.glview.view.GLRoot;

import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends GLActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GLRoot glRoot = getGLRoot();
        glRoot.setContentPane(new GLTestView());

        final GLRoot.Handler handler = new GLRoot.Handler() {
            @Override
            public void onHandle(GL10 gl) {
                Log.d("TAG", "onHandle");
            }
        };
        glRoot.registerHandler(handler);

        final Button button2 = (Button) findViewById(R.id.post);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.request();
            }
        });

        final Button button1 = (Button) findViewById(R.id.render);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                glRoot.requestRender();
            }
        });
    }

    @Override
    protected int getGLRootViewId() {
        return R.id.gl_root;
    }

    @Override
    public void onGLThreadStart() {
        Log.d("TAG", "onGLThreadStart");
    }

    @Override
    public void onGLThreadExit() {
        Log.d("TAG", "onGLThreadExit");
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
