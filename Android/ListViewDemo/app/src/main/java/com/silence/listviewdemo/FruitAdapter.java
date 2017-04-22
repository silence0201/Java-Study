package com.silence.listviewdemo;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by silence on 2017/4/22.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId ;
    public FruitAdapter(Context context,int textViewResourceId, List<Fruit> objects) {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position) ;
        View view ;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false) ;
        }else{
            view = convertView ;
        }

        ImageView fruiteImage = (ImageView) view.findViewById(R.id.fruit_image) ;
        TextView fruitName = (TextView)view.findViewById(R.id.fruit_name) ;
        fruiteImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view ;
    }
}
