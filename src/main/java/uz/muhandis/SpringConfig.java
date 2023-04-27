package uz.muhandis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    List<Music> musicList(){
        return new ArrayList<>(Arrays.asList(classicalMusic(), popMusic(), rockMusic()));
    }
    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

}
