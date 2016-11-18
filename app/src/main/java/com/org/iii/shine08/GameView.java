package com.org.iii.shine08;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Timer;

public class GameView extends View{
    private Resources res;
    private Context context;
    private int viewH,viewW;
    private boolean isInit;
    private Bitmap bmpBall;
    private Matrix matrix;
    private float ballW,ballH;
    Timer timer;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        res = context.getResources();
        matrix = new Matrix();
        timer = new Timer();
        //setBackgroundColor(Color.YELLOW);
    }
    private void init(){
        viewH =getHeight();viewW=getWidth();
        Log.v("shine",viewW +"x" + viewH);

        bmpBall = BitmapFactory.decodeResource(res,R.drawable.b1);
        ballW = viewW/12f; ballH = ballW;
        bmpBall = resizeBmp(bmpBall, ballW, ballH);

        isInit = true;
    }

    Bitmap resizeBmp(Bitmap src, float width, float height){
        matrix.reset();
        matrix.postScale(width/src.getWidth(), height/src.getHeight());
        return Bitmap.createBitmap(src,0,0,src.getWidth(),src.getHeight(),matrix,false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(!isInit) init();

        canvas.drawBitmap(bmpBall,0,0,null);  //畫個ball

    }
}
