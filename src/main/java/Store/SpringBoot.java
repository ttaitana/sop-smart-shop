package Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class SpringBoot{
    public static ArrayList<BubbleTea> ORDER = new ArrayList<BubbleTea>();

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Welcome to SOP Smart BubbleTea Shop!";
    }

    @RequestMapping("/shop")
    BubbleTeaMenu[] viewMenuList(){
        return BubbleTeaFactory.viewMenuList();
    }
}