package swathi.socialmediawebservice.model;

import java.util.Date;

/**
 * Created by swathi on 6/22/2015.
 */
public class Comments {

    private long id;
    private String comment;
    private String author;
    private Date date;

    public Comments(long id, String comment, String author) {
        this.id = id;
        this.comment = comment;
        this.author = author;
        this.date = new Date();
    }

    public Comments(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }




}
