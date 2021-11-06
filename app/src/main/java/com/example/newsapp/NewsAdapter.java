package com.example.newsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, ArrayList<News> newsArrayAdapter) {
        super(context, 0, newsArrayAdapter);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentListView = convertView;

        if (currentListView == null) {
            currentListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_news, parent, false);
        }

        News currentNews = getItem(position);

        TextView title = currentListView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        TextView sectionName = currentListView.findViewById(R.id.section);
        sectionName.setText(currentNews.getSectionName());

        TextView dateView = currentListView.findViewById(R.id.date);
        dateView.setText(formatDate(currentNews.getDate()));

        TextView author = currentListView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());

        return currentListView;
    }
    private String formatDate(Date dateObject) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
}
