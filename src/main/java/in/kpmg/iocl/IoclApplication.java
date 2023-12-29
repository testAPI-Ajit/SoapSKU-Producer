package in.kpmg.iocl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoclApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoclApplication.class, args);
		System.out.println("................Inside Main class.........");
	}

}
