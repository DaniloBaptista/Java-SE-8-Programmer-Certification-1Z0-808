//estrutura, primeiro package, depois imports
package CursoI.aula2;
//o arquivo pode ser compilado mesmo que n�o tenha nada dentro dele.
import java.util.Date;
//classe ou interface vem depois do package e dos imports
//comentarios podem vir a aqualquer momento
//comentario: // e /*
//javadoc: /**
class Pessoa {
	
	
	
	//este atributo \/ precisa d euma instancia de uma classe  ou objeto pra poder ter valor, uma pessoa precisa existir pra poder ter o nome.
	String nome;
	//dentro da classe posso ter as variaveis de instancia por exemplo ou variaveis de objeto ou membros;
	
	//J� este\/ n�o precisa de uma pessoa ou classe pra existir
	static int totalDePessoas = 0;
	// essa variavel � uma s� com unico valor pelo q entendi, � a variavel estatica.
	
	//CONSTRUTOR NUNCA TEM VOID, QUANDO TIVER VOID � UM M�TODO, O CONSTRUTOR GERALMENTE � S� O NOME DA CLASSE IGUAL. E S� ESSE NOME.
	//no java eu s� posso ter uma classe,interface, um tipo: publico.
	//e se qualquer classe for publica(classe msm), ela tem q ter o msm nome do arquivo.
	Pessoa(String nome){
	//posso ter construtores com variaveis que s�o parametros.	
	//construtor N�O RETORNA NADA. Da pra colocar return sem nada.
		if(nome == null) {
			nome = "Guilherme";
			return;
		}
	this.nome=nome;
	}
	public String getNome() {
		String sobrenome = "silveira";
		return nome + sobrenome;
	} 
	//posso ter metodos e variaveis locais dentro desses m�todos.
	//tudo dentro da minha classe.
}

interface A {
	final int TAMANHO =5;
	//Interface tem variaveis constantes e final
	// podemos ter m�todos abstratos publicos
	void autentica(String nome, String senha);
	
	//por padr�o a variavel � publica e estatica, e ela � FINAL TAMB�M POR PADRAO, MESMO Q N COLOQUE
	//public static final int TAMANHO =5;
	//SE EU ALTERAR O VALOR DA VARIAVEL FINAL, N�O VAI COMPILAR PQ VALOR DE VARIAVEL FINAL N�O SE MUDA.
	//EX A.TAMANHO = 15 N�O VAI COMPILAR
	
	
	//m�todo por padr�o � publico e abstrato
	//public abstract void autentica(String nome, String senha);
	//mesmo q n�o coloque, na interface ambos s�o assim.
}