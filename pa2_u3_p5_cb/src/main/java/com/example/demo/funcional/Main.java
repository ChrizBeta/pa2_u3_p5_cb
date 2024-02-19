package com.example.demo.funcional;

public class Main {

	public static void main(String[] args) {

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

		IPersonaSupplier<String> supplierLambda2 = () -> "1722781000" + " Pais";
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
		IPersonaPredicate<Integer> predicateLambda = numero -> numero.compareTo(7) == 0;
		System.out.println(predicateLambda.evaluar(7));
		System.out.println(predicateLambda.evaluar(8));

		IPersonaPredicate<String> predicateLambda1 = letra -> "Christian".contains(letra);
		System.out.println(predicateLambda1.evaluar("C"));

		
		MetodosReferenciados metR = new MetodosReferenciados();
		IPersonaSupplier<String> supplierLambda4 = metR::obtenerId;
		System.out.println(supplierLambda4.getId());
		
		
		// Metodos Referenciados
		System.out.println(
				"\n------------------------------------------- METODO REFERENCIADO -------------------------------------------");
		IPersonaPredicate<String> predicate = metR::evaluar;
		System.out.println(predicate.evaluar("Z"));

		IPersonaPredicate<Integer> predicate1 = metR::comparar;
		System.out.println(predicate1.evaluar(8));

		// FUNCTION
		System.out.println(
				"\n------------------------------------------- FUNCTION -------------------------------------------");
		// Lambdas
		System.out.println("1. LAMBDAS");
		IPersonaFunction<String, Integer> functionLambda = numero -> {
			numero = numero + Integer.valueOf(100);
			String numeroString = numero.toString().concat("-Valor");
			return numeroString;
		};
		System.out.println(functionLambda.aplicar(7));

		IPersonaFunction<Empleado, Ciudadano> functionLambda1 = ciudadano -> {
			Empleado empl = new Empleado();
			empl.setNombreCompleto(ciudadano.getNombre() + " " + ciudadano.getApellido());
			if (ciudadano.getProvincia().compareTo("Pichincha") == 0) {
				empl.setPais(" Ecuador");
			}
			return empl;
		};
		Ciudadano ciud = new Ciudadano();
		ciud.setApellido("Betancourt");
		ciud.setNombre("Christian");
		ciud.setProvincia("Pichincha");

		Empleado emple = functionLambda1.aplicar(ciud);
		System.out.println(emple);

		// Metodos Referenciados
		System.out.println(
				"\n------------------------------------------- METODO REFERENCIADO -------------------------------------------");
		Empleado empl2 = new Empleado();
		empl2.setNombreCompleto("Alejandro Alban");
		empl2.setPais("Ecuador");

		IPersonaFunction<Ciudadano, Empleado> function = metR::cambiar;
		Ciudadano ciud2 = function.aplicar(empl2);
		System.out.println(ciud2);

		// UNARY OPERATOR
		System.out.println(
				"\n------------------------------------------- UNARY OPERATOR -------------------------------------------");
		// Lambdas
		System.out.println("1. LAMBDAS");
		IPersonaUnaryOperator<Integer> unaryOperatorLambda = numero -> numero + (numero * 2);
		System.out.println(unaryOperatorLambda.aplicar(15));

		IPersonaUnaryOperator<Integer> unaryOperatorLambda2 = numero -> numero + (numero * 2);
		System.out.println(unaryOperatorLambda2.aplicar(10));

		// Metodos Referenciados
		System.out.println(
				"\n------------------------------------------- METODO REFERENCIADO -------------------------------------------");
		IPersonaUnaryOperator<Empleado> unary = metR::procesar;
		Empleado empl3 = unary.aplicar(empl2);
		System.out.println(empl3);
	}

}
