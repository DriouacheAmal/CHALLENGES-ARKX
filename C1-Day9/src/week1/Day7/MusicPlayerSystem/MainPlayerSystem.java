package week1.Day7.MusicPlayerSystem;

public class MainPlayerSystem {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player("ANGEL NUMBERS");
        CDPlayer cdPlayer = new CDPlayer("Maccarena");
        MusicLibrary musicLibrary = new MusicLibrary();

        musicLibrary.playSong(mp3Player);
        musicLibrary.StopSong(mp3Player);
        musicLibrary.pauseSong(mp3Player);


        musicLibrary.playSong(cdPlayer);
        musicLibrary.StopSong(cdPlayer);
        musicLibrary.pauseSong(mp3Player);

    }
}
