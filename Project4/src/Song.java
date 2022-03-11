import java.util.ArrayList;

public class Song {
    private String title;
    private ArrayList<Musician> musicians;
    private String genre;
    private String url;

    Song(String title, ArrayList<Musician> musicians, String genre, String url) {
        this.title = title;
        this.musicians = musicians;
        this.genre = genre;
        this.url = url;
    }

    @Override
    public String toString() {
        String text = "Title: " + title + "\nMusicians: ";
        for (Musician m : musicians) {
            text += m.name + " (" + m.country + "), ";
        }
        text += "\nGenre: " + genre + "\n" + "Link: " + url;
        return text;
    }
}
