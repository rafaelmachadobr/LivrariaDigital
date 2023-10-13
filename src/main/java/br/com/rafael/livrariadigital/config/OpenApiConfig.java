package br.com.rafael.livrariadigital.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Livraria Digital",
                version = "1.0",
                description = "API para gerenciamento de livros e autores",
                contact = @Contact(
                        name = "Rafael",
                        url = "https://github.com/rafaelmachadobr/"
                ),
                license = @License(
                        name = "MIT",
                        url = "https://opensource.org/licenses/MIT"
                ),
                termsOfService = "https://opensource.org/licenses/MIT"
        ),
        servers = @Server(
                description = "Local ENV",
                url = "http://localhost:8080"
        ))
public class OpenApiConfig {
}
