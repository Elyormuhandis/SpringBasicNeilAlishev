package uz.muhandis;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "singleton")
@Scope(value = "prototype")
public class PopMusic implements Music{
    @Override
    public String getMusic() {
        return "Bailando";
    }
}
