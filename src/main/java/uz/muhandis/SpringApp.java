package uz.muhandis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayerBean = context.getBean(MusicPlayer.class);
        musicPlayerBean.playMusic();
        System.out.println(musicPlayerBean.getName()+ musicPlayerBean.getVolume());
        PopMusic popMusic1 = context.getBean(PopMusic.class);
        PopMusic popMusic2= context.getBean(PopMusic.class);
        System.out.println(popMusic1==popMusic2);
        context.close();
        /**
         *Daxshat, MusicPlayerni ichiga List e'lon qilib, List<Music> bergan edim
         * daxshat, springni o'zi hamma music janrlarini arraylistga autoinject
         * qilib, musicPlayerga DI qilib yubordi
         *
         * */

    }
}
