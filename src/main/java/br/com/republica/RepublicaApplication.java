package br.com.republica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.republica")
@EnableTransactionManagement
@EnableAutoConfiguration
public class RepublicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepublicaApplication.class, args);
	}
	

}
