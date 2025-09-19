package br.com.senai.entregas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "API do Projeto UrbanSwift",
        version = "1.0",
        description = "API responsável pelo gerenciamento de usuários, entregas e veiculos da empresa UrbanSwift"
))
public class EntregasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntregasApplication.class, args);
	}

}
