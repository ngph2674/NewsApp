package com.example.newsapp;

import android.content.Context;

import java.util.List;

import android.content.AsyncTaskLoader;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private final String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        return QueryUtils.fetchNewsData(mUrl);
    }
}