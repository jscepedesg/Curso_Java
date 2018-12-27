package programacion_generica;

public class UsoArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist_classgen archivos = new Arraylist_classgen(4);
		
		archivos.add("Juan");
		archivos.add("Maria");
		archivos.add("Sandra");
		archivos.add("Jorge");
		
		String nom =(String) archivos.get(0);
		System.out.println(nom);
	}

}
