package br.com.alura.teste.service;

import tools.jackson.databind.ObjectMapper;

public class coversorDados implements iconversor{
    public ObjectMapper mapper = new ObjectMapper();

    @Override
    public <t> t obterdado(String json, Class<t> classe) {
        return mapper.readValue(json,classe);// return de uma classe convertida
    }
}
