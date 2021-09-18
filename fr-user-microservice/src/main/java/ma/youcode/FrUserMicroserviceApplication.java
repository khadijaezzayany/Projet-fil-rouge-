package ma.youcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("ma.youcode.*")
public class FrUserMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrUserMicroserviceApplication.class, args);
	}

}
