package uz.muhandis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayerBean.playMusic();
        context.close();

        /**
         * Qachonki classni ichida boshqa object (new Object()) yaratilsa
         * u class o'sha objectni classiga qattiq bog'langan deyiladi.
         * Bu yaxshi emas. Chunk class iloji boricha mustaqil bo'lishi lozim.
         * Shu sababdan bog'liqlikdan qochish uchun new Objectni konstruktor
         * yoki setter orqali tashqaridan berilishi mumkin. Bu esa IoC yani
         * Inversion of control deyiladi.
         * IoCni Spring freamworkida xml konfiguratsiya, java code yoki
         * annotation orqali ham hosil qilish mumkin. Bu DI ya'ni
         * dependency injection deyiladi. https://habr.com/ru/articles/131993/
         * yaxshi yozilgan ekan.
         *
         *
         * */

    }
}
