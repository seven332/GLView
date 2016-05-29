/*
 * Copyright 2016 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.glview.example;

import android.graphics.Color;

import com.hippo.glview.glrenderer.GLCanvas;
import com.hippo.glview.glrenderer.GLPaint;
import com.hippo.glview.view.GLView;

public class GLTestView extends GLView {

    private final GLPaint mPaint;

    public GLTestView() {
        mPaint = new GLPaint();
        mPaint.setColor(Color.WHITE);
        mPaint.setBackgroundColor(Color.BLACK);
        mPaint.setLineWidth(500);

        setBackgroundColor(Color.BLACK);
    }

    @Override
    public void onRender(GLCanvas canvas) {
        canvas.drawLine(0, 0, 200, 200, mPaint);
        //canvas.drawOval(200, 200, 100, 100, mPaint);
    }
}
