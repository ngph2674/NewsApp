package com.example.newsapp;
import java.util.Date;

public class News {

    private final String sectionName;
    private final String title;
    private final String author;
    private final Date date;
    private final String webURL;

    public News(String sectionName, String title, String author, Date date, String webURL) {
        this.sectionName = sectionName;
        this.title = title;
        this.author = author;
        this.date = date;
        this.webURL = webURL;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getWebURL() {
        return webURL;
    }
}
