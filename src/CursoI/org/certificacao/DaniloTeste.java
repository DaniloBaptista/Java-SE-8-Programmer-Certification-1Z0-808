package CursoI.org.certificacao;

public class DaniloTeste {
	static int id = 2;
	//variaveis estaticas podem ser acessas atraves de 
	//qualquer escopo, atraves da referencia ou da classe.
	//Regras das variaveis estaticas:
	/*podem ser acessadas a partir de qualquer lugar
	 *desde que sejam respeitadas os modificadores de acesso
	 *atraves do nome da classe ou da instancia da classe ou daquele tipo
	 *nomeDoTipo.variavel
	 *Instancia.variavel 
	 * */
	
	 void metodo() {
		System.out.println("dsadsa" + id);
		this.setX(3);
		System.out.println("Chama metodo x" + x);
		this.setY(4);
		System.out.println("Chama metodo y" + y);
	}
	
	static int x = 0;
	public static void setX(int x) {
		DaniloTeste.x=x;
	}
	int u = 2;
	int y = 0;
	public void setY(int y) {
		this.y=y;
	}
	
	/*Shadowing
	 * esconder, se eu tenho uma variavel 'a'
	 * eu posso te um m�todo com um uma variavel 'a'
	 * eu escondi a variavel de instancia quando eu criei a variavel local a
	 * Shadowing faz acessar a variavel local
	 */
	class X{
		int a =10;
		public void metod() {
			int a = 20;
			System.out.println(a);
		}
		
	}
	/*Variavel local: dentro de um m�todo ou construtor, vivem dentro do bloco
	 * Variavel de instancia ou membro ou atributo ou variavel de objeto
	 * variaveis estaticas ou da classe podem ser acessadas de qualquer lugar
	 * desde que sejam referenciadas atraves de um objeto de instancia ou atraves do nome da classe.
	 * 
	 * Conflito de escopo:
	 * no mesmo escopo static e instancia  n�o pode mesmo nome.
	 * s� pode static e local e membro e local.
	 * 
	 * */
	
	/*N�o posso: duas variaveis com mesmo nome
	 * 
	 * 
	 * 
	 * */
}
