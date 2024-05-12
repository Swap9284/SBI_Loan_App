package in.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

        int a=10;

		String s = "hi";

		SpringApplication.run(MyAppApplication.class, args);

		String s2 = "hello";
	}

}
