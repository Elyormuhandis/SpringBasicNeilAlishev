package uz.muhandis;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getMusic() {
        return "Hungarian rapsody";
    }
}
