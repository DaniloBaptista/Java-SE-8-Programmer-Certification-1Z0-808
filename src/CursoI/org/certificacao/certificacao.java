package CursoI.org.certificacao;

public class certificacao {
	static int dan = 3;
	String nomeInstanciado ="Guilherme";
	//variavel de instancia pode ser acesada por qualquer metodo da classe ou construtor
	public static void main(String[] args) {
		certificacao t = new certificacao();
		t.m2();
		t.nomeInstanciado= "joao";
		System.out.println(t.nomeInstanciado);
	
		DaniloTeste p = new DaniloTeste();
		System.out.println(p.id);
		System.out.println(DaniloTeste.id);
		p.metodo();
		//S� funciona se for statico
		
		System.out.println("dsadas"+ p.u);
		
		System.out.println("dsad"+ dan);
	}
	public void m2() {
		System.out.println(nomeInstanciado);
	}
	public certificacao() {
		//variavel local nome s� existe dentro do bloco q ela foi acessada
		for(int i=0, j=0; i<=10; i++)j++;
		//no for msm sem as chaves a variavel s� vai existir dentro do for
		System.out.println(this.nomeInstanciado + 2);

	}
}
