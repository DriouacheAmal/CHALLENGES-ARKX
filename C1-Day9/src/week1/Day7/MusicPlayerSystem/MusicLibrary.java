package week1.Day7.MusicPlayerSystem;

import java.util.ArrayList;
import java.util.List;

class MusicLibrary {
    private Playable Song;
    private List<Playable> displaySong;

    public MusicLibrary() {this.displaySong = new ArrayList<>();};
    public void addSong (Playable Playable){this.displaySong.add(Song);};

    public void playSong(Playable Song){
        if (Song != null)
            Song.play();
    }
    public void pauseSong(Playable Song) {
        if (Song != null)
            Song.pause();
    }
    public void StopSong(Playable Song){
        if (Song != null) {
            Song.stop();
            Song = null;
        }
    }



}
