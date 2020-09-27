package CursoIII.Aula7;

public class TesteCasting {
    public static void main(String[] args) {
        double d = 15.3;
        //int i = d;
        //System.out.println(i);
        //n compila pois pode perder informação
        //naquela tabela n posso fazer conversão da direita pra esquerda
        //vai perder precisão e n vai compilar.

        int i = (int) d;//casting, arredondasse o numero
        System.out.println(i);
        //fez o casting, assumiu q podia perder imprecisão, e falou pro compilador pra ocnverter msm assim
        // o casting basicamente arredonda, só tira o ponto flutuante, mesmo em numeros negativos.

        double o = 0.9999;
        int u = (int) o;
        System.out.println(u);

        long l = 151515151515l;
        int l2 = (int) l;
        System.out.println(l2);

        char c = 10;
        long l5 = c;


        int i7 = 3/2;
        //divisão de numeros inteiros e convertido pra inteiro =1;
        double i8 = 3/2;
        //divisão inteira q depois é promovida pra double: 1.0
        double i9 = 3/2.0;
        System.out.println(i8+i7+i9);
    }
}
