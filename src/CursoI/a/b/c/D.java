package CursoI.a.b.c;
import java.util.*;
import java.io.*;
public class D {
	 public static void main(String[] args) {
	        ArrayList<String> lista = new ArrayList<String>();

	        for (String arg : args) {
	            if (new E().existe(arg))
	                lista.add(arg);
	        }
	    }
	}


	class E {
	    public boolean existe(String nome) {
	        File f = new File(nome);
	        return f.exists();
	    }
	}
