package androidproject.api.androidprojectapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@Configuration
public class AndroidprojectapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndroidprojectapiApplication.class, args);
	}

}
