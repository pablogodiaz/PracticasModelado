package Ejercicio2;

public class main {

	 public static void main(String[] args) throws Exception {
	        //Activo activo = new Activo("Pablo", "555501234", 1000);
	        //Pensionista pensionista = new Pensionista("Victor", "550034726", 1500);
	        //activo.incrementar();
	        //pensionista.incrementar();

	        //MedioPensionista medioPensionista = new MedioPensionista("Pablo", "555501234", 1000, 1500);
	        //medioPensionista.incrementar();
		 
			Activo activo = new Activo("Juan", "123321323", 1000.0);
			Pensionista pensionista = new Pensionista("Juan", "123321323", 500.0);
			MedioPensionista medioPensionista = new MedioPensionista(activo, 400);
			
			System.out.println("Salario pre incremento de "+medioPensionista.getNombre()+": "+medioPensionista.nomina());
			medioPensionista.incrementar();
			System.out.println("Salario post incremento de "+medioPensionista.getNombre()+": "+medioPensionista.nomina());
		
	    }

}
