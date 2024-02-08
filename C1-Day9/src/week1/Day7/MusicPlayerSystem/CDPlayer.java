package week1.Day7.MusicPlayerSystem;

class CDPlayer extends AudioPlayer{
    private String cdFile;
    public CDPlayer(String cdFile) {
        this.cdFile = cdFile;

    }

    @Override
    public void play() {
        System.out.println("Play CD :" + cdFile);

    }

    @Override
    public void pause() {
        System.out.println("Pause CD :" + cdFile);

    }

    @Override
    public void stop() {
        System.out.println("Stop CD :" + cdFile);

    }
}
