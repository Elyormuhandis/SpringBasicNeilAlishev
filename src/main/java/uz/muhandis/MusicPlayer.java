package uz.muhandis;

public class MusicPlayer {
    Music music;

    public MusicPlayer(){}

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing " + music.getMusic());
    }
}
