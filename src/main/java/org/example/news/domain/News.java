package org.example.news.domain;

public class News {

    public final String NewsID;
    public final String Title;
    public final String Description;

    public News(String newsID, String title, String description) {
        NewsID = newsID;
        Title = title;
        Description = description;
    }


    public String getNewsID() {
        return NewsID;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }


    @Override
    public String toString() {
        return "News{" +
                "NewsID='" + NewsID + '\'' +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
