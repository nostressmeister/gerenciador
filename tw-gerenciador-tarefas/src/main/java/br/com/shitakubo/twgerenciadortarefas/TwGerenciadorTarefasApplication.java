package br.com.shitakubo.twgerenciadortarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

public class TwGerenciadorTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwGerenciadorTarefasApplication.class, args);
	}

}
