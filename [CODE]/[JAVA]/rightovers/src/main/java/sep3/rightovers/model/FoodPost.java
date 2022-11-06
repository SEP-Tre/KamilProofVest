package sep3.rightovers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class FoodPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postId;
    private String title;

    private String postCategory;
    private String description;
    private String pictureUrl;
    private String daysUntilExpired;
    private String postState;
    private LocalDate postDate;
    private Timestamp postTimestamp;

    public FoodPost() {
    }

    // For use in the proof of concept for getting all food posts
    public FoodPost(String title, String category) {
        this.title = title;
        this.postCategory = category;
        // Default values are fine... for now
    }

    public FoodPost(String title, String category, String description, String picture_url, String daysUntilExpired) {
        this.title = title;
        this.postCategory = category;
        this.description = description;
        this.pictureUrl = picture_url;
        this.daysUntilExpired = daysUntilExpired;
        this.postId=-1;//Todo change this id to the one retrieved from DB somehow
        this.postState ="VISIBLE";
        this.postDate = LocalDate.now();
        this.postTimestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "FoodPost{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", category='" + postCategory + '\'' +
                ", description='" + description + '\'' +
                ", picture_url='" + pictureUrl + '\'' +
                ", daysUntilExpired='" + daysUntilExpired + '\'' +
                ", postState='" + postState + '\'' +
                ", postDate=" + postDate +
                ", timestamp=" + postTimestamp +
                '}';
    }

    public String getCategory() {
        return postCategory;
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getDaysUntilExpired() {
        return daysUntilExpired;
    }

    public String getPostState() {
        return postState;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public Timestamp getTimestamp() {
        return postTimestamp;
    }
}
