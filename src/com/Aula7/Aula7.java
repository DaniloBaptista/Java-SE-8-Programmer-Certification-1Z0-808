package com.Aula7;

public class Aula7 {
    public static void main(String[] args) {

        /*String simportante = "estudando para a certificação";
        simportante.replace("e", 'a');
        System.out.println(simportante);*/
        //NÃO COMPILHA POIS REPLACE É COM 2 STRINGS
        //OU DOIS CHARS, E NO CASO FOI COM UMA STRING E UM CHAR.




        String nomeDireto = "Java";
        String nomeinDireto = new String("Java");
        char[] nome = new char[]{'J', 'a', 'v','a'};
        String nome1 = new String(nome);

        StringBuilder sb1 = new StringBuilder("java");
        String nome2 = new String(sb1);

        String nomeNulo = null;

        String nomeDaProva = "Certificacao" + " " + "Java";
        String nomeDaProvaComNulo = nomeDaProva + " " +  nomeNulo;
        System.out.println(nomeDaProva);
        System.out.println(nomeDaProvaComNulo);
        //Além de transformar nulos em string e concatenar, ele
        //tbm concatena numero
        System.out.println("Certificacao " + 1500);
        System.out.println(1500 + "Certificacao ");
        System.out.println(15 + 00 + "Certificacao ");
        //nesse de cima ele vai somar, pq ele não considera como concatenacao e sim como soma de duas strings
        System.out.println(15 + (99 + "Certificacao "));
        //aki ele vai concatenar por causa do parentese
        //concatenacao é sempre ad esquerda pra direita
        //se colocar antes dois numeros ele vai achar q é soma, ai tem q colcoar os aparenteses.

        //  \/String são imutaveis, não muda o valor depois q foi criada, é um objeto;
        String s = "Caelum";
        s.toUpperCase();
        System.out.println(s);

        String s2 = "Caelum";
        s2 = s2.toUpperCase();
        System.out.println(s2);
        //Assim ele atualiza a referencia, ai no caso ele vaii mudar o valor.
        //Então os métodos de string não vão alterar o valor
        //interno dela, eles vão devolver uma nova string
        //e voce usa essa referencia como quiser,
        //importante usar referencia se não, não altera a string q tava trabalhando.

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));

        System.out.println(s.length());
        System.out.println("".isEmpty());

        System.out.println("Guilherme".isEmpty());
        System.out.println("    ".isEmpty());
        //esse ultimo vai dar false pq espaco teoricamente é caracter.

        System.out.println("      joao        ");
        System.out.println("      joao        ".trim());
        //trim tira os espacos

        System.out.println("aaaaaa"+s2.replace('A', 'E'));
        System.out.println(s2.replace("CAE", "ALU"));

        String java = "Java";
        System.out.println(java.substring(1));
        System.out.println(java.substring(1,2));


        System.out.println("Certificado".compareTo("Arnaldo"));
        //se vem antes da um numero positivo
        System.out.println("Certificado".compareTo("Certificado"));
        System.out.println("Certificado".compareTo("Grecia"));
        //se vem antes é negativo, acho q no alfabeto,G VEM DEPOIS DO C AI É É NEGATIVO
        System.out.println("Mario".compareTo("mario"));
        //letra maiuscula vem antes da minuscula, então é negativo.
        System.out.println("Mario".compareToIgnoreCase("mario"));

        String texto = "Pretendo fazer";
        System.out.println("dan "+texto.indexOf("Pretendo"));
        System.out.println("dan "+texto.indexOf("e", 7));
        //last index of comeca de tras pra frente.
        //ends with se terminar com akela palavra da true, se não da false.
        //e o starts with é no inicio se comeca

        String sas = "Caelum";
        sas =sas.concat("- Ensino e Inovação");
        System.out.println(sas);

        StringBuilder ronaldo = new StringBuilder("guilherme");
        System.out.println( ronaldo.lastIndexOf("e"));
        //o ultimo e q aparece
        System.out.println(ronaldo.indexOf("k") + ronaldo.lastIndexOf("k"));


    }
}
