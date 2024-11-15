package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

// Nas configurações de execução cirar a variavel de execução
// para criar a variavel é no edit configurations
// SPRING_PROFILES_ACTIVE VALOR dev Application DEV nome e salva.
/*
entrar no site railway.app
provisionar pelo postgresql
ver dados de conexão

no projeto
criar um novo application-prod.yml
ver arquivo prod
na primeira vez que rodar o projeto colocar ddl:auto como create e depois mudar para validate

criar um novo application e colocar todas as informações que estão no site do railway.
database até o final

 */