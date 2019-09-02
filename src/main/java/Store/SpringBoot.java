package Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}