package knol.nashtech.jibdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JibdemoApplication {

	public static void main(String[] args) {
		System.out.print("Hello world from Jib!!!");
		SpringApplication.run(JibdemoApplication.class, args);
	}

}
