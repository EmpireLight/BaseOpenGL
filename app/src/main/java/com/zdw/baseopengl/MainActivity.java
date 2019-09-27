package com.zdw.baseopengl;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.zdw.baseopengl.render.MyGLRenderer;
import com.zdw.baseopengl.render.Square;
import com.zdw.baseopengl.render.Triangle;
import com.zdw.baseopengl.render.Trianglev2;

public class MainActivity extends AppCompatActivity {

    GLSurfaceView glSurfaceView;
//    Square square;
//    Triangle triangle;
    Trianglev2 trianglev2;
    boolean rendererSet;
//    MyGLRenderer myGLRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glSurfaceView = findViewById(R.id.gl_sv);

        // 创建OpenGL ES 2.0的上下文
        glSurfaceView.setEGLContextClientVersion(2);
//        myGLRenderer = new MyGLRenderer();
        trianglev2 = new Trianglev2();
        //设置Renderer用于绘图
//        glSurfaceView.setRenderer(myGLRenderer);
        glSurfaceView.setRenderer(trianglev2);
        //只有在绘制数据改变时才绘制view，可以防止GLSurfaceView帧重绘
        glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


    @Override
    protected void onResume() {
        super.onResume();

//        if (glSurfaceView != null)
//            glSurfaceView.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
//        if (glSurfaceView != null)
//            glSurfaceView.onPause();
    }
}
