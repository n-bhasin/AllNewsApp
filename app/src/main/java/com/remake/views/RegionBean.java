package com.remake.views;

import android.widget.ArrayAdapter;

/**
 * Created by pc on 12-08-2017.
 */

public class RegionBean {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RegionBean(String name) {

        this.name = name;
    }

    String name;
}
