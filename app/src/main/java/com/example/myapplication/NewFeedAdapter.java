package com.example.myapplication;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class NewFeedAdapter extends BaseAdapter {

    private ArrayList<NewFeed> mListNewFeeds;

    private Activity mActivity;

    public NewFeedAdapter(ArrayList<NewFeed> listNewFeeds, Activity mActivity) {
        this.mListNewFeeds = listNewFeeds;
        this.mActivity = mActivity;
    }

    @Override
    public int getCount() {
        return mListNewFeeds != null? mListNewFeeds.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return mListNewFeeds.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            view = mActivity.getLayoutInflater().inflate(R.layout.layout_item,null,false);
        }

        ImageView imgAvatar = view.findViewById(R.id.iv_avatar);
        TextView tvUserName = view.findViewById(R.id.tv_username);
        TextView tvContent = view.findViewById(R.id.tv_content);
        ImageView img = view.findViewById(R.id.image);

        NewFeed newFeed = mListNewFeeds.get(i);
        tvUserName.setText(newFeed.getUserName());
        tvContent.setText(newFeed.getContent());

        Glide.with(mActivity).load(newFeed.getAvatar()).into(imgAvatar);
        Glide.with(mActivity).load(newFeed.getImg()).into(img);


        return view;
    }
}
