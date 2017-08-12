package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class SelectRegion extends AppCompatActivity{

    ListView list_item;

    regionAdapter adapter;
    ArrayList<RegionBean> list;

    public void initSpinner(){
        list_item=(ListView) findViewById(R.id.list_item);

        list = new ArrayList<>();
        RegionBean bean = new RegionBean("English");
        RegionBean bean1 = new RegionBean("Gujrati");
        RegionBean bean2 = new RegionBean("Hindi");
        RegionBean bean3 = new RegionBean("Kannada");
        RegionBean bean4 = new RegionBean("Malayalam");
        RegionBean bean5 = new RegionBean("Marathi");
        RegionBean bean6 = new RegionBean("Punjabi");
        RegionBean bean7 = new RegionBean("Tamil");
        RegionBean bean8 = new RegionBean("Telugu");
        RegionBean bean9 = new RegionBean("Urdu");

        list.add(bean);
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);
        list.add(bean4);
        list.add(bean5);
        list.add(bean6);
        list.add(bean7);
        list.add(bean8);
        list.add(bean9);

        //String[] lang = {"English","Gujrati","Hindi","Kannada","Malayalam","Marathi","Nepali","odia","Punjabi","Tamil","Telugu","Urdu"};
        adapter = new regionAdapter(this,R.layout.region_layout,list);

        list_item.setAdapter(adapter);
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RegionBean region=adapter.getItem(position);
                if(position==0){
                    Intent intent = new Intent(SelectRegion.this,EnglishListNews.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent = new Intent(SelectRegion.this,HindiListNews.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(SelectRegion.this,HindiListNews.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==8){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==9){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==10){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==11){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);
        initSpinner();
    }

}
