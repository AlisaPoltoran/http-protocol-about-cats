import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat {
    public final String id;
    public final String text;
    public final String type;
    public final String user;
    public final String upvotes;

    public Cat(
        @JsonProperty("id") String id,
        @JsonProperty("text") String text,
        @JsonProperty("type") String type,
        @JsonProperty("user") String user,
        @JsonProperty("upvotes") String upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes='" + upvotes + '\'' +
                '}';
    }

    public String getUpvotes() {
        return upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }
}
