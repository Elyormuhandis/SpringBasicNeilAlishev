package uz.muhandis;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;


    public MusicPlayer(){}

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music music:musicList
             ) {
            System.out.println("Playing " + music.getMusic());
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
