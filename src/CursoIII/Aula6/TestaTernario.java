package CursoIII.Aula6;

public class TestaTernario {
    public static void main(String[] args) {
        //(condicao) ? caso_verdadeira : caso_falsa
        int i = 5;
        int resultado = (i == 5) ? 100 : 0;
        System.out.println(resultado);
        System.out.println(i==5 ? "100" : 0);
        //int resultado2 = (i == 5) ? "100" : 0;
        //no primeiro sout ele se vira coma  string, mas noc aro da variavel ele vai dar pau
        //em variavel preciso de tipos compativeis dos dois lados.
        //ai no sout , o sout recebe object ai posos suar como quiser.


        //operador de referencia: .
        String nome = "guilherme";
        int tamanho = nome.length();
        System.out.println(tamanho);

        //operador da classe string
        //ela vai ser a unica q vai aceitar o + para concatenar string.
        // ela tem o proprio operador dela
        String nomeCompleto = "guilherme " + "Silveira";
        System.out.println(nomeCompleto);

    }
}
