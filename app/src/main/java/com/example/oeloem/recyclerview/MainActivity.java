package com.example.oeloem.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Contact> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerviewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        setData();
    }

    private void setData() {
        Contact dataSubarjo = new Contact("Subarjo", "Tukang Gorengan", "MOBILE", R.drawable.icon);
        Contact dataLeonardo = new Contact("Leo", "Marbot", "MOBILE", R.drawable.icon2);
        Contact dataSutripno = new Contact("Sutripno", "Tukang Bakso", "MOBILE", R.drawable.icon3);
        Contact dataSutrisno = new Contact("Sutrisno", "Satpam", "MOBILE", R.drawable.icon4);
        Contact dataEddie = new Contact("Edd", "Tukang Galon", "MOBILE", R.drawable.icon5);

        contactList.add(dataSubarjo);
        contactList.add(dataSutripno);
        contactList.add(dataLeonardo);
        contactList.add(dataSutrisno);
        contactList.add(dataEddie);

        mAdapter = new RecyclerviewAdapter(contactList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
    }
}
