package com.example.arinterface;

import vuforia.SampleApplicationSession;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.webkit.WebView;

public class MyGLSurfaceView extends GLSurfaceView {

	MyRenderer renderer;

	public MyGLSurfaceView(Context context, SampleApplicationSession session,
			WebView webPreview) {
		super(context);

		// Set the Renderer for drawing on the GLSurfaceView
		setEGLContextClientVersion(2);
		renderer = new MyRenderer(context, session, webPreview);
		setRenderer(renderer);

	}

	@Override
	public boolean onTouchEvent(MotionEvent e) {

		return true;
	}
}
