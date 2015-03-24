package lab5.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab5Application {

    public static void main(String[] args) {
    	System.out.println("Hello");
    	System.out.println("TESTE");
        SpringApplication.run(Lab5Application.class, args);
    }
}
