package org.example;
public class Ciudad {
	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad(String nombre) {

		this.nombre=nombre;
		throw new UnsupportedOperationException();
	}
}