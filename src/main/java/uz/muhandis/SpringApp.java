package uz.muhandis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayerBean.playMusic();
        context.close();
    }
}
