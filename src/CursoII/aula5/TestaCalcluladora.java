package CursoII.aula5;

class Calculadora{
    public int soma(int... numeros){
        //var args, é um array, um array n é um var args.
        //vai receber quantos ints forem colcoados, qualquer quantidade
        //argumento de quantidade variavel é um array.
//é um tipo só de 0 até o infinitivo, só pode ser int nesse exemplo.
        //ah tem q ser o ultimo argumento do método
        //se tiver um primeiro parametro antes, ai ele é obrigatorio e o de quantidade variavel não.
//se é um array só recebe arrays, se e um var args(int ...) recebe tanto o array quanto o var args.

        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma +=numeros[i];
        }
        return soma;
    }
}
class TestaCalcluladora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.soma(3,5));
        System.out.println(c.soma(3,5,8,9));
        System.out.println(c.soma(3,5,3,1));
        System.out.println(c.soma(3));
        System.out.println(0);
        //pode receber até 0 argumentos tbm sem problemas.

    }
}
