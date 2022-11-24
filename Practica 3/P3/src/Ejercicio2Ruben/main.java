package Ejercicio2Ruben;

public class main {

	public static void main(String[] args) {

		Activo activo = new Activo("Juan", "123321323", 1000.0);
		Pensionista pensionista = new Pensionista("Juan", "123321323", 500.0);
		MedioPensionista medioPensionista = new MedioPensionista(activo, pensionista);
		
		System.out.println("Salario pre incremento de "+medioPensionista.getNombre()+": "+medioPensionista.getSalario());
		medioPensionista.incrementar();
		System.out.println("Salario post incremento de "+medioPensionista.getNombre()+": "+medioPensionista.getSalario());
	}

}
