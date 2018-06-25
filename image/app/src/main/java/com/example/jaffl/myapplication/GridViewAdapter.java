package com.example.jaffl.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    Context mCtx;

    public GridViewAdapter(Context ctx)
    {
        mCtx = ctx;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            LayoutInflater inflater = ((Activity)mCtx).getLayoutInflater();
            view = inflater.inflate(R.layout.row, null, false);
            holder = new ViewHolder();

            holder.imageView =  view.findViewById(R.id.ImageIcon);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        WindowManager wm = (WindowManager) mCtx.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);


        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(R.drawable.aa));
        //myimageviewsize(holder.imageView,size.y);

        return view;


    }

    private void myimageviewsize(ImageView imgid, int evenHight) {
// TODO 自動產生的方法 Stub
        ViewGroup.LayoutParams params = imgid.getLayoutParams();  //需import android.view.ViewGroup.LayoutParams;
        //params.width = evenWidth;
        params.height = evenHight - 20;
        imgid.setLayoutParams(params);
    }

    private class ViewHolder {

        ImageView imageView;
    }
}
