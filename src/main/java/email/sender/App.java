package email.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
public class App
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
        System.out.println("Hello World!");
    }
}
