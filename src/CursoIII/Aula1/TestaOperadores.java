package CursoIII.Aula1;
import java.util.ArrayList;
import java.util.List;
public class TestaOperadores {
    public static void main(String[] args) {
        int i = 15;
        long idade = 15;
        //byte -> short -> int -> long -- do menor pra o maior
        //o caminho contrario o compilador vai reclamar
        //por exemplo int no short, o compilador vai reclamar.
        //perde precisão, por padrão não compila.
        //posso fazer do menor para o maior mas não do maior
        //para o menor.

        //float - > double -- ponto fluutante
        //char só é numero positivo.
        int a = 10;
        long b = 20;
        short c = 3;
        byte d = 4;

        // Um valor é compatível com uma variável se ele for do mesmo tipo dela ou de um tipo menos abrangente

        double e = 30.0;
        float f = 40.3f;
        double g = 40.3f;
        f=a;
        f=b;
        f=c;
        f=d;
        g=a;
        g=b;
        g=c;
        g=d;
        b=a;
        //a=b;
        //long não cabe dentro do int, o compilador vai reclamar

        //quando trabalho com tipos primitivos: valor
        //quando trabalho com objetos: referencia;
        ArrayList<String> lista = new ArrayList<String>();
        ArrayList<String> lista2 = lista;

        //neste de baixo copiamos o valor da referencia mas o objeto é o msm.
        ArrayList<String> list3 = new ArrayList<String>();
        List<String> lista4 = lista;
        //Eu consigo igualar List a array list
        //pq List é mais generico e arraylist é mais abrangente;
        //duas variaveis referenciando o msm objeto em memória.

//Lembre que as atribuições em Java são por cópia de valor, sempre. No tipo primitivo, copiamos o valor, em referências a objetos, copiamos o valor da referência (não duplicamos o objeto)

        //Então a regra é:
        //tipo + brangente pro -abrangente -> n compila
        //tipo - abrangente pro + abrangete -> compila

        int teste = 3;
        //double teste2 = 2;
        //int danilo = teste + teste2;
        //System.out.println(danilo);
        ///vai dar erro pq ele espera um int e ta passando um double.
        //É double pq o o resultado da operação sempre vai ser do tipo maior, nocaso é o double mesmo.

        //não pode dividir numero inteiro por 0

        double divisao1 = 5/0.0;
        double divisao2 = 5.0/0;
        //em ponto flutuante funciona.
        System.out.println(divisao1);
        System.out.println(divisao2);

        System.out.println((b + 0.0) / 2);
        //double dividido por int é double, ai n vai dar exception.


    }
}
