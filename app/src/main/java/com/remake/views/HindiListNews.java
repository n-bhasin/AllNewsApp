package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiListNews extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    ListView hindiListNews;
    ArrayList<NewsSubject> HindiListNews;
    userAdapter adapter;

    public  void initList(){
        hindiListNews = (ListView)findViewById(R.id.hindiListNews);

        NewsSubject n5 =new  NewsSubject(R.drawable.aajatk,"Aaj Tak");
        NewsSubject n6 =new  NewsSubject(R.drawable.zee,"Zee News");
        NewsSubject n7 =new  NewsSubject(R.drawable.ndtv,"NDTV");
        NewsSubject n8 =new  NewsSubject(R.drawable.abp,"ABP News");
        NewsSubject n9 =new  NewsSubject(R.drawable.dd,"DD News");
        NewsSubject n10 =new  NewsSubject(R.drawable.indiatv,"India TV");


        HindiListNews = new ArrayList<>();
        HindiListNews.add(n5);
        HindiListNews.add(n6);
        HindiListNews.add(n7);
        HindiListNews.add(n8);
        HindiListNews.add(n9);
        HindiListNews.add(n10);

        adapter = new userAdapter(this,R.layout.list_item,HindiListNews);
        hindiListNews.setAdapter(adapter);
        hindiListNews.setOnItemClickListener(this);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_list_news);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                String url="http://aajtak.intoday.in/";
                Intent intent = new Intent(HindiListNews.this,NewsActivity.class);
                intent.putExtra("keyUrl",url);
                startActivity(intent);
                break;
            case 1:
                String url1="http://zeenews.india.com/";
                Intent intent1 = new Intent(HindiListNews.this,NewsActivity.class);
                intent1.putExtra("KeyZeeNews",url1);
                startActivity(intent1);
                break;
            case 2:
                String url2="http://www.ndtv.com/";
                Intent intent2 = new Intent(HindiListNews.this,NewsActivity.class);
                intent2.putExtra("keyNDTV",url2);
                startActivity(intent2);
                break;
            case 3:
                String url3="http://www.abplive.in/";
                Intent intent3 = new Intent(HindiListNews.this,NewsActivity.class);
                intent3.putExtra("keyABPLive",url3);
                startActivity(intent3);
                break;
            case 4:
                String url4=" http://www.ddinews.gov.in/Default.aspx";
                Intent intent4 = new Intent(HindiListNews.this,NewsActivity.class);
                intent4.putExtra("keyDD",url4);
                startActivity(intent4);
                break;
            case 5:
                String url5="http://www.indiatvnews.com/";
                Intent intent5 = new Intent(HindiListNews.this,NewsActivity.class);
                intent5.putExtra("keyIndiaTV",url5);
                startActivity(intent5);
                break;

        }
    }
}
