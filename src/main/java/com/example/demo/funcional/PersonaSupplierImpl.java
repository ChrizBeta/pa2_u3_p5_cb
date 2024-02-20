package com.example.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String> {

	@Override
	public String getId() {

		String cedula = "1722781000";
		cedula = cedula + " Provincia";
		return cedula;
	}

}
