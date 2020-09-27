package CursoIII.Aula2;

public class TestaAritmetica {
    public static void main(String[] args) {
        int dois = 2;
        int dez = 10;
        //long dez = 10
        //se eu mudar pra long os de baixo vão da erro
        //pq to tentando colocar um long em int.
        //operações entre o maior e o menor sempre vai dar o maior
        //então entre long e int sempre vai dari o long.
        //byte dois
        // se eu fizer operação entre dois bites ele vai resolver um int,
        //é o minimo q resolve é um int.
        int doze = dez + dois;
        int oito = dez - dois;
        int vinte = dez * dois;
        int cinco = dez / dois;
        int restoDivisao = 5 % 2;

        System.out.println(restoDivisao);

        byte dan1 = 3;
        byte dan2 =4;
        int dd= dan1+dan2;
        //aki vai dar certo, o minimo q vai retornar é int, então ele atribui dois valores bites que na operação
        //vão dar int ao dd q é int.
        //se tentar atribuir o resultado dos dois(int) ao dd sendo byte vai dar erro de tentar colocar int em byte.
        //então o resultado da operação tem q ser inteiro. operações sempre o menor valor vai ser inte.
        //e entre dois valores diferentes vai ser o maior tipo em int e long vai ser long;
        System.out.println(dd);

    }
}
