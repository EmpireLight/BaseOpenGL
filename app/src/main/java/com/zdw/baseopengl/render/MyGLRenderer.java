package com.zdw.baseopengl.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {
    private static final String TAG = MyGLRenderer.class.getSimpleName();

//    private Triangle mTriangle;
    private Trianglev2 mTriangle;

    @Override
    public void onSurfaceCreated(GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
        Log.i(TAG, "onSurfaceCreated: ");
//        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);//白色不透明
        GLES20.glClearColor(0.5f,0.5f,0.5f,1.0f);
//        mTriangle = new Triangle();
        mTriangle = new Trianglev2();
    }

    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height) {//当view的几何形状发生变化时调用，比如设备屏幕方向改变时
        Log.i(TAG, "onSurfaceChanged: ");
        //绘制窗口
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 unused) {//每次重绘view时调用
        Log.i(TAG, "onDrawFrame: ");
        //重绘背景色
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        mTriangle.draw();
    }
}
