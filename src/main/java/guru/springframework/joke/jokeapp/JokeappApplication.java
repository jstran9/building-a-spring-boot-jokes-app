package guru.springframework.joke.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {
        // go to, http://patorjk.com/software/taag/#p=display&f=Avatar&t=Spring%0AFramework%0AGuru
        // for generation of the banner.txt's contents.
        SpringApplication.run(JokeappApplication.class, args);
    }
}
