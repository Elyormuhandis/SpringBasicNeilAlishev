package uz.muhandis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
    }
}
