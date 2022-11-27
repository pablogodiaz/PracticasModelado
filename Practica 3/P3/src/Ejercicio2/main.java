package Ejercicio2;

public class main {

	 public static void main(String[] args) throws Exception {
		 
			Activo activo = new Activo("Juan", "123321323", 1000.0);
			Pensionista pensionista = new Pensionista("Juan", "123321323", 500.0);
			MedioPensionista medioPensionista = new MedioPensionista(activo, pensionista);
			
			System.out.println("Salario de activo del mediopensionista "+medioPensionista.getNombre()+": "+medioPensionista.getActivo().nomina());
			System.out.println("Salario de pensionista del mediopensionista "+medioPensionista.getNombre()+": "+medioPensionista.getPensionista().nomina());
			System.out.println("Salario pre incremento de "+medioPensionista.getNombre()+": "+medioPensionista.nomina());
			medioPensionista.incrementar();
			System.out.println("Salario post incremento de "+medioPensionista.getNombre()+": "+medioPensionista.nomina());
		
	    }

}
