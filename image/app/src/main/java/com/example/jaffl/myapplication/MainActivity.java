package com.example.jaffl.myapplication;

import android.content.Context;
import android.graphics.Point;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView grid = null;
    GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        grid = this.findViewById(R.id.grid);
        //ViewGroup.LayoutParams params = grid.getLayoutParams();

        gridViewAdapter = new GridViewAdapter(this);
       // params.height = size.x;
        //params.width = size.y;
        //grid.setLayoutParams(params);
        grid.setNumColumns(2);
        grid.setAdapter(gridViewAdapter);
    }
}
