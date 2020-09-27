package CursoIII.Aula4;

public class TestaOperadoresLogicos {
    public static void main(String[] args) {
        System.out.println(1 == 1 & 1 > 2);//e
        System.out.println(1 == 1 | 1>2);//ou
        System.out.println(1 == 1 ^ 1>2);//ou exclusivo
        System.out.println(!(1 == 1));

        int danilo =2;
        if(danilo> 1 & danilo> 0){
            System.out.println("deu certo");
        }

        //Os simbolos assim é pelo short circuit
        //Esse short circuit é pra quando o valor da esquerda já for verdadeiro
        // e nem for necessáiro executar a proxima parte.
        //quando vc ja rsouber o resultado sem nem ver a sgeunda parte.
        //Sem o short circuit ele  sempre executa os dois lados
        //Com, ele executa o primeiro, se o resultado for suficiente ele para por ai.
        System.out.println(1 == 1 && metodo("primeiro"));//e
        System.out.println(1 != 1 && metodo("segundo"));//ou
        System.out.println(1 == 1 ^ metodo("terceiro"));//ou exclusivo
        //n tem shor circuit pra ou exclusivo.
        System.out.println(!(1 == 1));

    }
        public static boolean metodo(String msg){
            System.out.println(msg);
            return true;
        }
}
