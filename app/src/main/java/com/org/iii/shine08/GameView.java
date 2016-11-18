package com.org.iii.shine08;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class GameView extends View{
    private Resources res;
    private Context context;
    private int viewH,viewW;
    private boolean isInit;
    private Bitmap bmpBaill;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        res = context.getResources();


        //setBackgroundColor(Color.YELLOW);
    }
    private void init(){
        viewH =getHeight();viewW=getWidth();
        Log.v("shine",viewW +"x" + viewH);
        bmpBaill = BitmapFactory.decodeResource(res,R.drawable.b1);
        isInit = true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(!isInit) init();

        canvas.drawBitmap(bmpBaill,0,0,null);  //畫個ball

    }
}
