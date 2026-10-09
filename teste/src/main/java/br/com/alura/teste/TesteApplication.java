package br.com.alura.teste;

import br.com.alura.teste.model.caracteris;
import br.com.alura.teste.service.consumoApi;
import br.com.alura.teste.service.coversorDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class TesteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var consumoApi = new consumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		coversorDados converte = new coversorDados();
		caracteris dados = converte.obterdado(json,caracteris.class);
		System.out.println(dados);
	}
}
