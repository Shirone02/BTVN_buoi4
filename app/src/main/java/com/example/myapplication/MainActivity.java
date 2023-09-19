package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private NewFeedAdapter mNewFeedAdapter;
    private ArrayList<NewFeed> mListNewFeeds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        initData();
        initView();
        
    }

    private void initView() {
        listView = findViewById(R.id.listView);
        mNewFeedAdapter = new NewFeedAdapter(mListNewFeeds,this);

        listView.setAdapter(mNewFeedAdapter);
    }

    private void initData() {
        mListNewFeeds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            NewFeed newFeed = new NewFeed();
            newFeed.setUserName("UserName: " + (i + 1));
            newFeed.setContent("Honkai star rail patch: " + (i+1));
            newFeed.setAvatar("https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/honkai-star-rail-thump-1.jpg");
            newFeed.setImg("https://assetsio.reedpopcdn.com/Honkai-Star-Rail-new-year.jpg?width=1600&height=900&fit=crop&quality=100&format=png&enable=upscale&auto=webp");

            mListNewFeeds.add(newFeed);
        }

    }
}