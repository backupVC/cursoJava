package ejercicio1_herencia;

public class PruebaInformaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programador p = new Programador("Informatic", "java");
		p.setSueldo(30);
		System.out.println("Gana en 20 horas: "+p.pagarSueldo(20)+ " en la empresa "+p.getEmpresa());
		Analista a = new Analista("analistic", "base de datos");
		a.setSueldo(24);
		System.out.println("Gana en 20 horas: "+a.pagarSueldo(20)+ " en la empresa "+a.getEmpresa());
	}

}
