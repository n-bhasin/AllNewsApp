package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MyListView extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    ArrayList<NewsSubject> newsList;
    userAdapter adapter;
    /*ArrayAdapter<String> adapter;*/

    public  void initList(){
        listView=(ListView)findViewById(R.id.listView);

        //creating the object

        NewsSubject n3=new NewsSubject(R.drawable.cnn,"CNN");

        NewsSubject n5=new NewsSubject(R.drawable.bbc,"BBC");

        NewsSubject n8=new NewsSubject(R.drawable.indianexpress,"IndianExpress");

        newsList=new ArrayList<>();

        newsList.add(n3);
        newsList.add(n5);

        newsList.add(n8);

        adapter = new userAdapter(this,R.layout.list_item,newsList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        /*adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("AajTak");//0
        adapter.add("ZeeNews");
        adapter.add("StarNews");
        adapter.add("CNN");
        adapter.add("IndiaToday");
        adapter.add("Tribune");
        adapter.add("Mh1");
        adapter.add("IndianExpress");//n-1*/




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
      //  String NewsName=adapter.getItem(position);
        //String newsName = (String) adapter.getItem(position);
        //Toast.makeText(this,"You Selected: "+newsName,Toast.LENGTH_SHORT).show();
        switch (position){

            case 3:
                String url3="http://edition.cnn.com/";
                Intent intent3 = new Intent(MyListView.this,NewsActivity.class);
                intent3.putExtra("keyCNN",url3);
                startActivity(intent3);
                break;
            case 4:
                String url4="http://www.bbc.com/news";
                Intent intent4 = new Intent(MyListView.this,NewsActivity.class);
                intent4.putExtra("keyIndiaToday",url4);
                startActivity(intent4);
                break;
            case 7:
                String url7="http://indianexpress.com/";
                Intent intent7 = new Intent(MyListView.this,NewsActivity.class);
                intent7.putExtra("keyIndiaExpress",url7);
                startActivity(intent7);
                break;

        }
    }
}
