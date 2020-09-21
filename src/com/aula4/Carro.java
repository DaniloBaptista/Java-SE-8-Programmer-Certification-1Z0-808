package com.aula4;

public class Carro {
    String modelo;
    int ano;
    public Carro(){
        ano = 2014;
    }
    void modelo(){
        ano = 2014;
    }
    /*Não existe conflito de nomes entre variável membro e método ou variável membro e variável local.
    * */
    public String getDadosImpressos(){
        return modelo + "::" + ano;
    }
    public void setModelo(String modelo){
        //modelo=modelo;
        this.modelo=modelo;
        //como a variavel local e de instancia tem o nome igual ai seria bom colcoar o this, pra indicar que
        //é a variavel de instancia q seta o modelo;
        //Isso é ser a avriavel local tiver o mesmo nome da variavel membro.
        //se o nome das duas for diferente, ai o this não é necessário.
    }

}
