package com.example.demo.funcional;

public class MetodosReferenciados {
	// Supplier
	public String obtenerId() {
		// TODO Auto-generated method stub

		String cedula = "1722781000";
		cedula = cedula + " Referenciado";
		return cedula;
	}

	// Consumer
	public void procesar(String cadena) {
		// TODO Auto-generated method stub
		// System.out.println("Se inserta");
		System.out.println(cadena);
		System.out.println("Se proceso la cadena");
	}

	// Predicate
	public boolean evaluar(String cadena) {
		return "Christian ".contains(cadena);
	}

	public boolean comparar(Integer numero) {
		return 8 == numero;
	}

	// Function
	public Ciudadano cambiar(Empleado empl) {
		Ciudadano ciud = new Ciudadano();
		String nombre = empl.getNombreCompleto().split(" ")[0];
		String apellido = empl.getNombreCompleto().split(" ")[1];
		ciud.setNombre(nombre);
		ciud.setApellido(apellido);
		ciud.setProvincia("Manabi");
		return ciud;
	}

	// UNARY OPERATOR
	public Empleado procesar(Empleado empl) {
		empl.setNombreCompleto(empl.getNombreCompleto() + " " + empl.getPais());
		empl.setPais(empl.getPais() + " de nacimiento");
		return empl;
	}
}
