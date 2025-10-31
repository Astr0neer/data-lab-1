package lab3;

public class DoublyLinkedPlaylist {
    Song head;
    Song tail;
    Song current;


    DoublyLinkedPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }


    void addSong(String title){
        Song newSong = new Song(title);

        if (head == null) {
            head = newSong;
            tail = newSong;
            current = newSong;
            System.out.println("First song added: " + title);
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
            System.out.println("Added to the list: " + title);
        }

    }

    void nextSong(){
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (current.next != null) {
            current = current.next;
            System.out.println("PS: Now Playing-> " + current.title);
        } else {
            System.out.println("End of playlist");
        }
    }

    void previousSong(){
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (current.prev != null) {
            current = current.prev;
            System.out.println("PS: Now Playing-> " + current.title);
        } else {
            System.out.println("Start of playlist");
        }
    }

    void showCurrent(){
        if (current != null) {
            System.out.println("The song right now: " + current.title);
        } else {
            System.out.println("List is empty.");
        }
    }
}
