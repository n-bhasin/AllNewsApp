package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PunjabListNews extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    ArrayList<NewsSubject>  punjabNewsList;
    userAdapter adapter;
    public  void initList(){
        listView=(ListView)findViewById(R.id.punjabList);
        //creating the objects
        NewsSubject n1=new NewsSubject(R.drawable.abpsanjha,"ABP Sanjha");
        NewsSubject n2=new NewsSubject(R.drawable.ptc,"PTC News");
        NewsSubject n3=new NewsSubject(R.drawable.mh1,"MH1");
        NewsSubject n4=new NewsSubject(R.drawable.zeepunjabi,"Zee Punjabi");

        punjabNewsList = new ArrayList<>();
        punjabNewsList.add(n1);
        punjabNewsList.add(n2);
        punjabNewsList.add(n3);
        punjabNewsList.add(n4);

        adapter = new userAdapter(this,R.layout.list_item,punjabNewsList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab_list_news);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                String urlp1="http://abpsanjha.abplive.in/";
                Intent intent = new Intent(PunjabListNews.this,NewsActivity.class);
                intent.putExtra("keyABPSanjha",urlp1);
                startActivity(intent);
                break;
            case 1:
                String urlp2="https://www.ptcnews.tv/";
                Intent intent1 = new Intent(PunjabListNews.this,NewsActivity.class);
                intent1.putExtra("keyptc",urlp2);
                startActivity(intent1);
                break;
            case 2:
                String url2="http://mhone.in/";
                Intent intent2 = new Intent(PunjabListNews.this,NewsActivity.class);
                intent2.putExtra("keyMh1",url2);
                startActivity(intent2);
                break;
            case 3:
                String urlp3="http://www.zeepunjab.com/";
                Intent intent3 = new Intent(PunjabListNews.this,NewsActivity.class);
                intent3.putExtra("keyZeePunjabi",urlp3);
                startActivity(intent3);
                break;

        }
    }
}
