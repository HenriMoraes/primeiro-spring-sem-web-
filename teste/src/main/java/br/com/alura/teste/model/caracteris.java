package br.com.alura.teste.model;

import com.fasterxml.jackson.annotation.JsonAlias;//direcionando de onde puxar as informacoes do http
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import tools.jackson.databind.exc.IgnoredPropertyException;

@JsonIgnoreProperties(ignoreUnknown = true)//ele ira buscar apenas o que vc quer, iginorando todo o resto
public record caracteris(@JsonAlias("Title") String title,
                        @JsonAlias("year") String Year,
                        @JsonAlias("imdbRating") String imdbRanting,
                        @JsonAlias("totalSeasons") int totalSeasons) {
}
