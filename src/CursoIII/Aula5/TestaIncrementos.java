package CursoIII.Aula5;

public class TestaIncrementos {
    public static void main(String[] args) {
        int i = 5;
        //System.out.println(i--);
        //ele vai imprimir 5 , pois primeiroe ele devolve o i q veio primeiro e depois o --

        System.out.println(--i);
        //aki ele vai imprimir o 4 mesmo, pos descremento

        //pos incremento: ele vai pegar o o valor aplicar o incremento e vai aparecer o valor com incremento.

        i += 2;
        i-=2;
        i*=5;
        i /=10;
        i*=100;
        i %=3;//resto de 200 dividido por 3 é 2
        System.out.println(i+=3);

        byte b = 15;
        b += 3 ;
        System.out.println(b);
        //b = b + 3;
        //ja nesse não vai dar certo
        //um int + um byte vai dar um int, e byte n pode receber int.


        int a = 10;
        a += ++a + a + ++a;
        //a = a ++a + a + ++a;
        //a = 10 ++a + a + ++a;
        //a = 10 + 11 + a + ++a;
        //a=10 + 11 + 11 + 12;
        //a =44;
        System.out.println(a);

        int x = 15,g = 20, h = 30;
        x = (g = h)+1;
        System.out.println(x);
        System.out.println(g);
        System.out.println(h);

    }
}
