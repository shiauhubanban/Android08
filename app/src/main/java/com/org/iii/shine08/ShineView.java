package com.org.iii.shine08;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class ShineView extends View{
    public ShineView(Context context) {
        super(context);
        setBackgroundColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
