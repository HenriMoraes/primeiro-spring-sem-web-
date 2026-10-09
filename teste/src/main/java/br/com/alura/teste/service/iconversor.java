package br.com.alura.teste.service;

public interface iconversor {
   <t> t  obterdado (String json, Class<t>  classe);
   //esse "t" significa generic, no caso aqui, esta disendo que vai pegar uma dado qualquer
    //e transformar ele em jason da classe que eu puxar
}
