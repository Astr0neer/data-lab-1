package lab3;

public class Song {
    String title;
    Song next;
    Song prev;

    Song(String title){
        this.title = title;
        this.next = null;
        this.prev = null;

    }
}
