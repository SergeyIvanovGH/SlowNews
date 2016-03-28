package ua.com.univerpulse.model;

/**
 * Created by svivanov on 28.03.16.
 */
public class News {
    private String date;
    private String header;
    private String content;
    private String image;

    public News(String date, String header, String content, String image) {
        this.date = date;
        this.content = content;
        this.header = header;
        this.image = image;
    }

    public News() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
