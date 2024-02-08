package week1.Day7.MusicPlayerSystem;
interface Playable {
    void play();
    void pause();
    void stop();
}

abstract class AudioPlayer implements Playable {
    private String volumeControl;

    public AudioPlayer (){

    }

    public void setVolumeControl(String volumeControl){
        this.volumeControl = volumeControl;
        System.out.println("volume : " + volumeControl);

    }
    public String getVolumeControl(){
        return volumeControl;

    }


}
