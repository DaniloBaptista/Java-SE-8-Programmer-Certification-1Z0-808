package com.aula3;

public class MainAula3 {
    public static void main(String[] args) {
        Carro a = new Carro();
        a.modelo = "Palio";
        System.out.println(a.modelo);
        a.setModelo("Palio2");
        System.out.println(a.getDadosImpressos());
        System.out.println(a.ano);
        System.out.println(a.modelo.length());
    }
}
