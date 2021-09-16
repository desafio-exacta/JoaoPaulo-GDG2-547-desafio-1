package br.com.exactaworks.desafioclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioClientApplication.class, args);
	}

}
