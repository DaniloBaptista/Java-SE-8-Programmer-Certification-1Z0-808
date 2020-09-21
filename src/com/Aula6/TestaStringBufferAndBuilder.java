package com.Aula6;

import com.aula4.Carro;

public class TestaStringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Caelum");
        buffer.append(" - ");
        buffer.append("Ensino e inovação");
        System.out.println(buffer.toString());

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.toString());
        //vai imprimir um string buffer de tamanho 50 vazia.

        StringBuilder sb3 = new StringBuilder(buffer);
        sb3.append(" e Alura e casa do código");
        sb3.append("x");
        sb3.append(buffer);
        sb3.append(new Carro());
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("fCaelum - Inovacao2");
        sb4.insert(9, "Ensino e ");
        //insere na posição 9;
        System.out.println(sb4);
        sb4.delete(6,15);
        System.out.println(sb4);

        String valor = sb4.toString();
        System.out.println(new StringBuffer("guilherme").reverse());

        StringBuilder sb5 = new StringBuilder("Carlum - ensino e inovacao");
        System.out.println(sb5.substring(6,15));
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder("danilo danilo");
        sb6.delete(2,3);
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder("danilo danilo");
        System.out.println(sb7.substring(2,3));
        System.out.println(sb7);
    }
}
