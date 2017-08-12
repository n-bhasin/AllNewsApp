package com.remake.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectRegion extends AppCompatActivity{

    Spinner spRegion;

    ArrayAdapter<String> adapter;
    public void initSpinner(){

        spRegion=(Spinner)findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);

        adapter.add("--Select Region--");//0
        adapter.add("Punjabi");//1
        adapter.add("Hindi");//2
        adapter.add("English");
        adapter.add("Kannada");
        adapter.add("Bengali");
        adapter.add("Tamil");
        adapter.add("Telugu");
        adapter.add("Malayalam");

        spRegion.setAdapter(adapter);
        spRegion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String region=adapter.getItem(position);
                if(position==1){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(SelectRegion.this,HindiListNews.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(SelectRegion.this,EnglishListNews.class);
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
                else if(position==7){
                    Intent intent = new Intent(SelectRegion.this,PunjabListNews.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SelectRegion.this,"First Select Your Region!",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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
