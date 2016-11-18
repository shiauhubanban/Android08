package com.org.iii.shine08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private ShineView shineView;
    //private BradView bradView;
    private GameView gameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //shineView = new ShineView(this);
        //setContentView(shineView);
        setContentView(R.layout.activity_main);
        gameView = (GameView)findViewById(R.id.gameView);
    }

    @Override
    public void finish() {
        if(gameView.timer !=null){
            gameView.timer.purge();
            gameView.timer.cancel();
            gameView.timer = null;
        }
        super.finish();
    }
}
