package com.example.demo.funcional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				"\n------------------------------------------- SUPPLIER -------------------------------------------");
		System.out.println("1. CLASE");
		
		IPersonaSupplier<String> supplierClase = new PersonaSupplierImpl();
		System.out.println(supplierClase.getId());
		
		
		System.out.println("2. LAMBDA");

		IPersonaSupplier<String> supplierLambda = () -> {			
			String cedula = "1722781000";
			cedula = cedula + " Canton";
			return cedula;			
		};
		System.out.println(supplierLambda.getId());
		
		IPersonaSupplier<String> supplierLambda2 = () -> "1722781000"+" Pais";
		System.out.println(supplierLambda2.getId());
		
		IPersonaSupplier<Integer> supplierLambda3 = () -> {
			Integer valor1 = Integer.valueOf(100);
			valor1 = valor1 * Integer.valueOf(50) / Integer.valueOf(5);
			return valor1;
		};
		System.out.println(supplierLambda3.getId());
		
		
		System.out.println(
				"\n------------------------------------------- CONSUMER -------------------------------------------");
		System.out.println("1. CLASE");
		IPersonaConsumer<String> consumerClase = new PersonaConsumerImpl();
		consumerClase.accept("Profesor");
		
		
		System.out.println("2. LAMBDA");
		IPersonaConsumer<String> consumerLambda = cadena -> {
			System.out.println("Se inserta");
			System.out.println(cadena);
		};
		consumerLambda.accept("Profesor");
		
		
		
		System.out.println(
				"\n------------------------------------------- PREDICATE -------------------------------------------");
		System.out.println("1. LAMBDA");
		IPersonaPredicate<Integer> predicateLambda = numero -> numero.compareTo(7)==0;
		System.out.println(predicateLambda.evaluar(7));
		System.out.println(predicateLambda.evaluar(8));
		
		IPersonaPredicate<String> predicateLambda1 = letra -> "Christian".contains(letra);
		System.out.println(predicateLambda1.evaluar("C"));
	}
	
	

}
