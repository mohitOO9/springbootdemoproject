package guru.springframework.spring5framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackages = {"entity"})
@ComponentScan(basePackages = {"bootstrap,controller"})
public class Spring5frameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5frameworkApplication.class, args);
	}

}
