package edu.eci.arep.SecureApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class SecureAppApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SecureAppApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", String.valueOf(getPort())));
		app.run(args);
	}

	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
	}

}