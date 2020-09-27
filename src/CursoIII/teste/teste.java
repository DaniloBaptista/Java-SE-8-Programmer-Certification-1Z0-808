package CursoIII.teste;

public class teste {
    public static void main(String[] args) {


        System.out.println(1 == 1 && metodo("primeiro"));//e
        System.out.println(1 != 1 && metodo("segundo"));//ou
        System.out.println(1 != 1 || metodo("terceiro"));
        float f = 0.0f;
        int o = (byte)5;
    }
    public static boolean metodo(String msg){

        System.out.println(msg);
        return true;


    }
}
