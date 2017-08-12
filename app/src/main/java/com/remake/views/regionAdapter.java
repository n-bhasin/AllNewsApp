package com.remake.views;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by pc on 12-08-2017.
 */

public class regionAdapter extends ArrayAdapter<RegionBean> {
    Context context;
    int resource;
    ArrayList<RegionBean> objects;
    public regionAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<RegionBean> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = null;

        view = LayoutInflater.from(context).inflate(resource,parent,false);

        TextView name = (TextView)view.findViewById(R.id.textView);
        RegionBean bean = objects.get(position);
        name.setText(bean.getName());
        return view;
    }
}
