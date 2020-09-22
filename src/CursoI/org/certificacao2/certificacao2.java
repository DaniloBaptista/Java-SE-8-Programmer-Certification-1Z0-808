package CursoI.org.certificacao2;

public class certificacao2 {
	public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
        // a variavel de dentro do for s� pode ser utilizada aqui dentro
        	
            System.out.println(i);
        }
        int i = 15;
        //podemos declara-la novamente pois est� em outro lugar.
        //a anterior s� � visivel dentro do for, e essa est� em outro escopo.
        System.out.println(i);
    }
}
