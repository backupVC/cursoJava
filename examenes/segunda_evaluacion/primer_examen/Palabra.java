package biblioteca.caracteres;

public class Palabra{
	StringBuilder valor;
	public Palabra(String palabra){
		valor = new StringBuilder(palabra);
	}
	public String reverso(){
		return this.valor.reverse().toString();
	}
	public int numeroPalabras(){
		String[] aux;
		aux = this.valor.toString().split(" ");
		return aux.length;
	}

/*	public static void main(String[] arg){
		Palabra p = new Palabra("esto es una prueba");
		System.out.println("Al revés:  "+p.reverso());
		System.out.println("número de palabras: "+p.numeroPalabras());
	}*/
}
