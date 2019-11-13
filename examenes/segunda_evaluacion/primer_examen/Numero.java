package biblioteca.digitos;

public class Numero{
	private int valor;
	public Numero(int valor){
		this.valor=valor;
	}
	public boolean esPar(){
		return this.valor % 2 == 0;
	}
	public java.util.List<Integer> divisores(){
		java.util.List<Integer> lista = new java.util.ArrayList<Integer>();
		for (int i=1; i< this.valor; i++){
			if (this.valor % i == 0)
				lista.add(i);
		}
		return lista;
	}

/*	public static void main(String[] arg){
		Numero n = new Numero(1118);
		System.out.println("¿Es par) "+n.esPar());
		System.out.println("Divisores: "+n.divisores());
	}*/
}
