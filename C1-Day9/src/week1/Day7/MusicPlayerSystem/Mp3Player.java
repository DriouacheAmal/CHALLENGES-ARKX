package week1.Day7.MusicPlayerSystem;

class Mp3Player extends AudioPlayer {
    private String Mp3File;

    public Mp3Player(String mp3File) {
        this.Mp3File = mp3File;
    }

    @Override
    public void play() {
        System.out.println("Play Mp3 :" + this.Mp3File);

    }

    @Override
    public void pause() {
        System.out.println("Pause Mp3 :" + Mp3File);

    }

    @Override
    public void stop() {
        System.out.println("Stop Mp3 :" + Mp3File);

    }
}
