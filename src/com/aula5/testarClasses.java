package com.aula5;

public class testarClasses {
    public static void main(String[] args) {
        aula5 p = new aula5();
        p.setNome("Guilherme",15);
        String nome = p.getNome();
        System.out.println(nome);
        System.out.println(p.getNome());
        p.imprime();
    }
}
