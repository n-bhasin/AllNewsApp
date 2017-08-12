package com.remake.views;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 11-07-2017.
 */

public class userAdapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<NewsSubject> objects;
    public userAdapter(Context context, int resource, ArrayList<NewsSubject> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }


    public View getView(int position,  View convertView, ViewGroup parent) {
        View view=null;
        view= LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        TextView textView = (TextView)view.findViewById(R.id.textViewTitle);

        NewsSubject newsSubject = objects.get(position);
        imageView.setBackgroundResource(newsSubject.getImage());
        textView.setText(newsSubject.getNewsTitle());

        return view;
    }
}
