package remote.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(value = "remote")
@PropertySource("classpath:application.properties")
public class RemoteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteServerApplication.class, args);
	}
}
