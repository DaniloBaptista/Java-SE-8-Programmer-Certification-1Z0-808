package CursoII.aula4;

public class main {
    public static void main(String[] args) {

        //só podemos falaq um objeto é criado quando chama um construtor.
        CursoII.aula4.Carro c = new CursoII.aula4.Carro();
        //Carro é um objeto da memória e c referencia.
        //new carro é um carro na memória e c referencia um carro q ta na memória agora.
        new CursoII.aula4.Carro();//substitui a ultima referencia do objeto, então o primeiro c não ta mais acessivel.
        //TEM DOIS CARROS NESSE CÓDIGO, O PRIMEIRO FOI CRIADO NA LINHA 5
        //E O SEHUNDO NA LINHA 8.
        c.ano = 2014;
        c.modelo = "Ferrari";
        //Tenho uma variavel que referencia o objeto
        //quando tem isso o objeto é acessível.
        //Se nenhuma variavel aponta pra aquele objeto ele é inacessivel.

        c = new CursoII.aula4.Carro();//substitui a ultima referencia do objeto
        //crio um novo carro e só consigo acessar ele nas proximas linhas.
        c = null;//substitui a referencia do ultimo tambem, então o ultimo c n ta mais acesivel, eu substitui essa referencia com essa comparação de nulo ai o c faz outra coisa agora.
        //agora tenho dois objetos inacessiveis do tipo carro

        if(15>10){
            CursoII.aula4.Carro c2 = new CursoII.aula4.Carro();
            c2.ano = 2010;
        }//agora fora desse contexto n é mais acessivel também, mas por outra razão, por estar dentro do if, variavel local do if, só pode ser acessada dentor dele.
        //pro for o principio é o msm.

        CursoII.aula4.Carro c3;//já neste caso embaixo mesmo saindo do loop a variavel c3 ainda vai existir. Ela foi decalrada fora do loop.
        for(int i = 0; i<10; i++){
            c3 = new CursoII.aula4.Carro();
        }

        //ENTÃO:
        /*pro objeto ser criado tenho q chamar um construtor: new Objeto();
        *É acessível quando possui referencias a aquela objeto e puder acessar ele.
        * */


        // Garbage Collector
//dsTodo objeto inacessível é considerado elegível para o ::garbage collector::. Algumas questões da prova perguntam quantos objetos são elegíveis ao garbage collector ao final de algum trecho de código:
        //Garbage collector: não tem como saber quando ele rodar, ele pode ou não.
        //Depois q substitui pode ser jogado fora os objetos anteriores.
        //se a prova perguntar quantos objetos foram coletados no gaarbage collector a resposta certa é:
        //não sei dizer.

        //Se ainda tiver uma referencia direta, não pode ser garbage coletado, ainda estou usando esse cara.
    }
}
