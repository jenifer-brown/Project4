import java.util.ArrayList;
import java.util.Arrays;

public class MySongs {
    public static void main(String[] args) {
        Musician miles = new TrumpetPlayer("Miles Davis", "USA", "jazz", "brass");
        Musician curtis = new Vocalist ("Curtis Mayfield", "USA", "soul", "alto");
        Musician gary = new Guitarist("Gary Clark Jr", "USA", "blues", 6);
        Musician gwenStefani = new Vocalist ("Gwen Stefani", "USA", "pop", "mezzo-soprana");
        Musician macDemarco = new Vocalist ("Mac Demarco", "Canada", "indie", "baritone");
        Musician macDemarcoGuitar = new Guitarist("Mac Demarco", "Canada", "indie", 6);

        ArrayList<Song> library = new ArrayList<Song>();   // Create our library

        // Cool by Gwen Stefani
        ArrayList<Musician> musicians = new ArrayList() {{ add(gwenStefani); }};
        Song hollaback = new Song("Hollaback Girl", musicians, "pop",
                "https://www.youtube.com/watch?v=Kgjkth6BRRY");
        library.add(hollaback);

        // My Kind of Woman by Mac Demarco
        ArrayList<Musician> ms = new ArrayList() {{ add(macDemarco);
            add(macDemarcoGuitar); }};
        Song woman = new Song("My Kind of Woman", ms, "indie",
                "https://www.youtube.com/watch?v=wIuBcb2T55Q");
        library.add(woman);

        // People Get Ready by Curtis Mayfield
        ArrayList<Musician> mu = new ArrayList() {{ add(curtis); }};
        Song s = new Song("People Get Ready", mu, "relaxing",
                "https://www.youtube.com/watch?v=VOXmaSCt4ZE");
        library.add(s);

        // This Land by Gary Clark Jr.
        ArrayList<Musician> mus = new ArrayList() {{ add(gary); }};
        Song land = new Song("This Land", mus, "blues/soul",
                "https://www.youtube.com/watch?v=9KgNaRQ_J-c");
        library.add(land);

        for (Song song : library) {
            System.out.println(song.toString() +"\n\n");
        }


    }
}
