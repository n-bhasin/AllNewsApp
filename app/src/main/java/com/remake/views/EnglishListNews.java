package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishListNews extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView englishListNews;
    ArrayList<NewsSubject> EnglishListNew;
    userAdapter adapter;

    public  void initList(){
       englishListNews=(ListView)findViewById(R.id.englishList);

        NewsSubject n11 =new  NewsSubject(R.drawable.aajatk,"The Economic Times");
        NewsSubject n12=new NewsSubject(R.drawable.cnn,"CNN");
        NewsSubject n13=new NewsSubject(R.drawable.bbc,"BBC");
        NewsSubject n14=new NewsSubject(R.drawable.indianexpress,"IndianExpress");
      /*  NewsSubject n9 =new  NewsSubject(R.drawable.dd,"DD News");
        NewsSubject n10 =new  NewsSubject(R.drawable.indiatv,"India TV");*/


        EnglishListNew = new ArrayList<>();
        EnglishListNew.add(n11);
        EnglishListNew.add(n12);
        EnglishListNew.add(n13);
        EnglishListNew.add(n14);

        /*adapter.add(n9);
        adapter.add(n10);*/

        adapter = new userAdapter(this,R.layout.list_item,EnglishListNew);
        englishListNews.setAdapter(adapter);
        englishListNews.setOnItemClickListener(this);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_list_news);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                String url="  http://economictimes.indiatimes.com/";
                Intent intent = new Intent(EnglishListNews.this,NewsActivity.class);
                intent.putExtra("keyEconomic",url);
                startActivity(intent);
                break;
            case 1:
                String url2="http://edition.cnn.com/";
                Intent intent2 = new Intent(EnglishListNews.this,NewsActivity.class);
                intent2.putExtra("keyCNN",url2);
                startActivity(intent2);
                break;
            case 2:
                String url3="http://www.bbc.com/news";
                Intent intent3 = new Intent(EnglishListNews.this,NewsActivity.class);
                intent3.putExtra("keyIndiaToday",url3);
                startActivity(intent3);
                break;
            case 3:
                String url4="http://indianexpress.com/";
                Intent intent4 = new Intent(EnglishListNews.this,NewsActivity.class);
                intent4.putExtra("keyIndiaExpress",url4);
                startActivity(intent4);
                break;

        }
    }
}
