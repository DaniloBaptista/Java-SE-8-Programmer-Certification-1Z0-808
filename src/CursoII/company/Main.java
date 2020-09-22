package CursoII.company;
class ObjetoMeu{
    int valor;
}
class B {
    int v = 15;
}
public class Main {
    public static void main(String[] args) {
        ObjetoMeu o1 = new ObjetoMeu();
        o1.valor = 10;
        ObjetoMeu o2 = o1;
        o1.valor = o1.valor + 5;
        System.out.println(o1.valor);
        System.out.println(o2.valor);
        // a diferenca de é q aki em cima, é referenciado um unico objeto.
        // referencias diferentes pro mesmo objeto na memória com um valor unico.
        //já as variaveis abaixo só é copiado o valor de uma pra outra.

        int x1;
        x1 = 10;
        int x2 = x1;
        x1 = x1 + 5;
        System.out.println(x1);
        System.out.println(x2);

        B x = new B();
        B y = x;
        y.v++;
        System.out.println("ddd"+ y.v);
        x.v++;
        System.out.println(x.v);
        B z = y;
        z.v--;
        System.out.println(z.v);

        System.out.println("teste termina aki: "+x.v + y.v + z.v);

        /*Imprime 48, pois a atribuição de objetos é feita por cópia da referência, criamos somente um único objeto do tipo B.*/

        B a = new B();
        a.v++;
        B d = new B();
        d.v++;
        B f = new B();
        f.v++;
        System.out.println(a.v);
        System.out.println(d.v);
        System.out.println(f.v);
        // são diferentes criações de objeto mesmo sendo o mesmo valor, como são 3 news, cada um acrescenta.


    }
}
