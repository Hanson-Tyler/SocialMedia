package socialmedia;

/**
 * Created by Tyler on 11/30/2016.
 */

public class YouTubeAdapter implements SocialMediaEntry{
    YouTubeVideo video;

    public YouTubeAdapter(YouTubeVideo video){
        this.video = video;
    }

    @Override
    public String getUser() {
        return video.getAuthor();
    }

    @Override
    public String getPostText() {
        return video.getTitle() + " " + video.getDescription();
    }
}
