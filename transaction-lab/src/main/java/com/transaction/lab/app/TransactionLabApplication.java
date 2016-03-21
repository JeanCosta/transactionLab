package com.transaction.lab.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(value = "com.transaction.lab")
@PropertySource("classpath:application.properties")
@EntityScan(basePackages = "com.transaction.lab.entity")
@EnableJpaRepositories(basePackages = "com.transaction.lab.repository")
@EnableTransactionManagement
public class TransactionLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionLabApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate(clientHttpRequestFactory());
	}

	private ClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(60000);
		factory.setConnectTimeout(60000);
		return factory;
	}
}
