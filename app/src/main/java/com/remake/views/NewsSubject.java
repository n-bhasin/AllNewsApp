package com.remake.views;

/**
 * Created by pc on 11-07-2017.
 */

public class NewsSubject  {

   int image;
    String newsTitle;

    public NewsSubject(int image, String newsTitle) {
        this.image = image;
        this.newsTitle = newsTitle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }
}
