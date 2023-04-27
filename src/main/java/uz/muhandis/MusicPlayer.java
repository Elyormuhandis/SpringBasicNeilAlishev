package uz.muhandis;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MusicPlayer implements InitializingBean, DisposableBean {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(){}

    @Autowired
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

    //init method

    public void musicPlayerInitMethod(){
        System.out.println("This is musicPlayerInitMethod");
    }
    //destroy method
    public void musicPlayerDestroyMethod(){
        System.out.println("This is musicPlayerDestroyMethod");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("@PostConstruct deprecated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("@PreDestroy deprecated");
    }
}
