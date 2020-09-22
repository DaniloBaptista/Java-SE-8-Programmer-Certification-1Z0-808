package CursoII.aula5;

public class aula5 {
    int idade;
    String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void imprime(){
        System.out.println(getNome());
        //dentro do objeti aula5 eu n preciso colcoar o this, posso mas nao preciso.
    }
}
