package CursoI.Test3;

//Uma vez que o arquivo chama A.java, o �nico tipo
//p�blico que pode existir dentro dele deve
//se chamar A, o que n�o � verdade: tentamos definir um tipo B p�blico. Al�m disso, ap�s o extends n�o podemos colocar uma ,.
class A implements B { //A
}
interface B { //B
}
class C extends A { //C
}
class D extends A implements B { //D
}
