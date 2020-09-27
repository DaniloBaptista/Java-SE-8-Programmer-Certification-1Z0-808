package CursoIII.Aula3;

public class TestaComparacao {
    public static void main(String[] args) {
        System.out.println(1 == 1);
        System.out.println(1 != 1);

        System.out.println(2 >= 1);
        System.out.println(2 <= 1);
        System.out.println(2 > 1);
        System.out.println(2 < 1);

        //essas comparações n diferencia se é double ou float ou int, tanto faz pra ele.
        //ignora os tipos.

        //Se tiver referencia os unicos operadores de comparação são:
        //== ou !=

        //só podem ser comparados entre si:
        //boolean
        //referencia pra objeto
        //tipos primitivos numéricos
        //Não se comparam esses 3 entre si.

        //UM unico igual é operador de atribuição
        //DOIS iguais é operador de comparação.

        System.out.println(1 == (100.0 / 100.0));
        //no ponto flutuante pode dar erros de precisão.

    }
}
